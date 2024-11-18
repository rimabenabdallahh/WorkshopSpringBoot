package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Course;
import tn.esprit.rimabenabdallah.entities.Instructor;
import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.repositories.ICourseRepository;
import tn.esprit.rimabenabdallah.repositories.IInstructorRepository;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements IInstructorServices {
    private final IInstructorRepository instructorRepository;
    private final ICourseRepository courseRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void removeInstructor(Long numInstructor) {
    instructorRepository.deleteById(numInstructor);
    }

    @Override
    public Instructor addInstructorToCourse(Instructor instructor, List<Long> numCourses) {
            List<Course> courses= (List<Course>) courseRepository.findAllById(numCourses);
        if (instructor.getCourses() == null) {
            instructor.setCourses(new HashSet<>());
        }
        for (Course course : courses) {
            instructor.getCourses().addAll(courses);
        }

        return instructorRepository.save(instructor);

    }

    @Override
    public Instructor addAndAssignCourses(Instructor instructor) {
        Set<Course> courseSet = new HashSet<>();
        for(Course c : instructor.getCourses()){
            Course course = courseRepository.findById(c.getNumCourse()).orElse(null);
            courseSet.add(course);
        }
        instructor.setCourses(courseSet);
        return instructorRepository.save(instructor);
    }



}
