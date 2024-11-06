package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Color;
import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Registration;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.time.LocalDate;
import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAllSkiers();
    void removeSkier(Long numSkier);
    void assignSkierToPiste(Long numSkier, Long numPiste);
    Skier getByName(String name);
    List<Skier> getByBirthDate(LocalDate birthDate);
  Skier assignSkierToPiste(String name, Color color);
}
