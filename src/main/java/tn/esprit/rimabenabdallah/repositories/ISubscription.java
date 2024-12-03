package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Subscription;
import tn.esprit.rimabenabdallah.entities.TypeSubscription;

import java.util.List;

public interface ISubscription extends CrudRepository<Subscription, Long> {
    List<Subscription> findByTypeSubOrderByStartDate(TypeSubscription type);
    
}
