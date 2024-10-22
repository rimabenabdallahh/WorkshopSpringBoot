package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Course;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements ICourseServices{


    @Override
    public Course addCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> retrieveAllCourses() {
        return List.of();
    }

    @Override
    public Course retrieveCourses(Long numCourse) {
        return null;
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void removeCourse(Long numCourse) {

    }
}
