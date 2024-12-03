package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.*;
import tn.esprit.rimabenabdallah.repositories.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Slf4j
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
                Course course =courseRepository.findById(numCourse).orElse(null);
                for(Registration registration:skier.getRegistrations()){
                    registration.setSkier(skier);
                    registration.setCourse(course);
                    registrationRepository.save(registration);
                }
                return skierRepository.save(skier);
            }


    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscription_TypeSub(typeSubscription);
    }

    @Scheduled(cron = "*/15 * * * * *")
    @Override
    public void getSkiersNotif() {
           log.info("Notification sent to all skiers");
           log.debug("In method:getSkiersNotif");
           log.warn("warning !!");
           log.error("Ceci est une exception!");
    }


}
