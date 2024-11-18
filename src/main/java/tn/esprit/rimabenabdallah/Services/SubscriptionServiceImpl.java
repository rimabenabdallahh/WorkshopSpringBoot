package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.entities.Subscription;
import tn.esprit.rimabenabdallah.entities.TypeSubscription;
import tn.esprit.rimabenabdallah.repositories.IPisteRepository;
import tn.esprit.rimabenabdallah.repositories.ISubscription;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionSerives {
    private final ISubscription subscriptionRepository;
    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public List<Subscription> retrieveAllSubscriptions() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return subscriptionRepository.findById(numSub).orElse(null);
    }

    @Override
    public void removeSubscription(Long numSub) {
        subscriptionRepository.deleteById(numSub);
    }

    @Override
    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return new HashSet<>(subscriptionRepository.findByTypeSubOrderByStartDate(type));
    }
}
