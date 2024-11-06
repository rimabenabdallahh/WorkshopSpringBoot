package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Color;
import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.repositories.IPisteRepository;
import tn.esprit.rimabenabdallah.repositories.ISkierRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor

public class SkierServiceImpl implements ISkierServices {
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    //private final ISubscription subscriptionRepository;
    @Override
    public Skier addSkier ( Skier skier)
    {
        // Subscription subscription = skier.getSubscription();
      //  subscriptionRepository.save(subscription);
        //   skier.setSubscription(subscription);
        return skierRepository.save(skier);

    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return  skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAllSkiers() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public void assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier=skierRepository.findById(numSkier).orElse(null);
        Piste piste=pisteRepository.findById(numPiste).orElse(null);
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);

    }

    @Override
    public Skier getByName(String name) {
        return skierRepository.findByName(name);
    }

    @Override
    public List<Skier> getByBirthDate(LocalDate birthDate) {
        return skierRepository.findByBirthDate(birthDate);
    }

    @Override
    public Skier assignSkierToPiste(String name, Color color) {
        Skier skier = skierRepository.findByName(name);
        List<Piste> pistes = pisteRepository.findByColor(color);
        pistes.forEach(piste -> {
            piste.getSkiers().add(skier);
            pisteRepository.save(piste);
        });

        return skier;
    }


}
