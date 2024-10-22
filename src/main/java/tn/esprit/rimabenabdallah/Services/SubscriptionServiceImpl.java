package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.entities.Subscription;
import tn.esprit.rimabenabdallah.repositories.IPisteRepository;
import tn.esprit.rimabenabdallah.repositories.ISubscription;

import java.util.List;
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
}
