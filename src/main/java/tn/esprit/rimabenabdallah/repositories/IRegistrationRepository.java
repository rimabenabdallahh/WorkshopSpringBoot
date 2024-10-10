package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Registration;

public interface IRegistrationRepository extends CrudRepository<Registration,Long> {

}
