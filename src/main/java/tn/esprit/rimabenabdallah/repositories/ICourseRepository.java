package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Course;

public interface ICourseRepository extends CrudRepository<Course, Long> {
}
