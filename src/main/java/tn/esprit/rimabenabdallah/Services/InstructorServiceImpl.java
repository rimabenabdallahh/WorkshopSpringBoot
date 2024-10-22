package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Instructor;

import java.util.List;
@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements IInstructorServices {

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return List.of();
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return null;
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public void removeInstructor(Long numInstructor) {

    }
}
