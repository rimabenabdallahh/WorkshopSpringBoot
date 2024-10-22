package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Course;
import tn.esprit.rimabenabdallah.entities.Instructor;

import java.util.List;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
    List<Instructor> getAllInstructors();
    Instructor retrieveInstructor(Long numInstructor);
    Instructor updateInstructor(Instructor instructor);
    void removeInstructor(Long numInstructor);


}
