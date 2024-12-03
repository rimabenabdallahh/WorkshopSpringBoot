package tn.esprit.rimabenabdallah.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rimabenabdallah.Services.CourseServiceImpl;
import tn.esprit.rimabenabdallah.entities.Course;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("course")
public class CourseRestController {
    private final CourseServiceImpl courseService;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }
    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse) {
        return courseService.retrieveCourses(numCourse);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return courseService.retrieveAllCourses();
    }
    @DeleteMapping("/delete/{numCourse}")
    public void deleteCourse(@PathVariable Long numCourse) {
        courseService.removeCourse(numCourse);
    }
}
