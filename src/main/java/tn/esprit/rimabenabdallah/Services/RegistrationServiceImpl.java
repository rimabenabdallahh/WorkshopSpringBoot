package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Registration;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements IRegistrationServices{
    @Override
    public Registration addRegistration(Registration registration) {
        return null;
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return null;
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return null;
    }

    @Override
    public void removeRegistration(Long numRegistration) {

    }

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return List.of();
    }
}
