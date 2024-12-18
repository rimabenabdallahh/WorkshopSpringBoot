package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.entities.Subscription;
import tn.esprit.rimabenabdallah.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionSerives {
    Subscription addSubscription(Subscription subscription);
    List<Subscription> retrieveAllSubscriptions();
    Subscription updateSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSub);
    void removeSubscription(Long numSub);
    Set<Subscription> getSubscriptionByType(TypeSubscription type);

}
