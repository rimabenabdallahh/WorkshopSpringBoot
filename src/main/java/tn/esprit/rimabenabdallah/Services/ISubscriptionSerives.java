package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.entities.Subscription;

import java.util.List;

public interface ISubscriptionSerives {
    Subscription addSubscription(Subscription subscription);
    List<Subscription> retrieveAllSubscriptions();
    Subscription updateSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSubscription);
    void removeSubscription(Long numSubscription);

}
