package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Course;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.util.List;

public interface ICourseServices {
    Course addCourse(Course course);
    List<Course> retrieveAllCourses();
    Course retrieveCourses(Long  numCourse);
    Course updateCourse(Course course);
    void removeCourse(Long  numCourse);

}
