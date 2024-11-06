package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Course;
import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Registration;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.repositories.ICourseRepository;
import tn.esprit.rimabenabdallah.repositories.IRegistrationRepository;
import tn.esprit.rimabenabdallah.repositories.ISkierRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements IRegistrationServices{
    private final IRegistrationRepository registrationRepository;
    private final ISkierRepository skierRepository;
    private final ICourseRepository courseRepository;

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public void removeRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);

    }

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long idSkier) {
        Skier skier = skierRepository.findById(idSkier).orElse(null);
        registration.setSkier(skier);
        return registrationRepository.save(registration);
    }

    @Override
    public Registration RegistrationAndAssignToCourse(Registration registration, Long numCourse) {
        Course course = courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }


}
