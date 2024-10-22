package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Registration;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.util.List;

public interface IRegistrationServices {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    void removeRegistration(Long numRegistration);
    List<Registration> retrieveAllRegistrations();


}
