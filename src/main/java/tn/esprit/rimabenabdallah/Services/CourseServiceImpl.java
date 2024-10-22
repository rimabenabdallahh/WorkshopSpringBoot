package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Course;
import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.repositories.ICourseRepository;
import tn.esprit.rimabenabdallah.repositories.IRegistrationRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements ICourseServices{
    private final ICourseRepository courseRepository;


    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> retrieveAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course retrieveCourses(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);

    }

    @Override
    public void removeCourse(Long numCourse) {
      courseRepository.deleteById(numCourse);
    }
}
