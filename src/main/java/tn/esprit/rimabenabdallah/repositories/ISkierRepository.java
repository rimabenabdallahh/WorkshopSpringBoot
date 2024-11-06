package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.time.LocalDate;
import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long>
{
   Skier findByName(String name);
   List<Skier> findByBirthDate(LocalDate birthDate);


}
