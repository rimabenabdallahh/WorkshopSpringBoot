package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.entities.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long>
{
   Skier findByName(String name);
   List<Skier> findByBirthDate(LocalDate birthDate);
   List<Skier> findBySubscription_TypeSub(TypeSubscription typeSubscription);


}
