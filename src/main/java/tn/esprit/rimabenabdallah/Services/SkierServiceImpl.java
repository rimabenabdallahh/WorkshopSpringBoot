package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.*;
import tn.esprit.rimabenabdallah.repositories.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor

public class SkierServiceImpl implements ISkierServices {
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ICourseRepository courseRepository;
    private final IRegistrationRepository registrationRepository;
    private final ISubscription subscriptionRepository;
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



            @Override
            public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
                Subscription subscription = new Subscription();
                skier.setSubscription(subscription);
                subscriptionRepository.save(subscription);
                Course course = courseRepository.findById(numCourse).orElse(null);
                Registration registration = new Registration();
                registration.setNumWeek(LocalDate.now().getDayOfYear() / 7);
                registration.setCourse(course);
                registration.setSkier(skier);
                registrationRepository.save(registration);

                if (skier.getRegistrations() == null) {
                    skier.setRegistrations(new HashSet<>());
                }
                skier.getRegistrations().add(registration);

                return skierRepository.save(skier);
            }

    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscription_TypeSub(typeSubscription);
    }

}
