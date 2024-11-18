package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.rimabenabdallah.entities.Course;

import java.util.List;

public interface ICourseRepository extends CrudRepository<Course, Long> {

}
