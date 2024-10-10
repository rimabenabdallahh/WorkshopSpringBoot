package tn.esprit.rimabenabdallah.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.rimabenabdallah.entities.Subscription;

public interface ISubscription extends CrudRepository<Subscription, Long> {
}
