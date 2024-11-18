package tn.esprit.rimabenabdallah.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rimabenabdallah.Services.InstructorServiceImpl;
import tn.esprit.rimabenabdallah.entities.Instructor;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("instructor")
public class InstructorRestController {

    private final InstructorServiceImpl instructorService;

    @PostMapping("/add")
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor) {
        return instructorService.retrieveInstructor(numInstructor);
    }

    @GetMapping("/all")
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorService.removeInstructor(numInstructor);
    }
    @PostMapping("/addInstructorToCourse/{numCourse}")
    public Instructor addInstructorToCourses(
            @RequestBody Instructor instructor,
            @PathVariable List<Long> numCourse) {
        return instructorService.addInstructorToCourse(instructor,numCourse);
    }
    @PutMapping("/addAndAssignToCourses")
    public Instructor addAndAssignToCourses(@RequestBody Instructor instructor){
        return  instructorService.addAndAssignCourses(instructor);
    }







}

