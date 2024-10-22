package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Subscription;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionSerives {
    @Override
    public Subscription addSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public List<Subscription> retrieveAllSubscriptions() {
        return List.of();
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public Subscription retrieveSubscription(Long numSubscription) {
        return null;
    }

    @Override
    public void removeSubscription(Long numSubscription) {

    }
}
