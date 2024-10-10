package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Instructor;

public interface IInstructorRepository extends CrudRepository<Instructor, Long> {
}

