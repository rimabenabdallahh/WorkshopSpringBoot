package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAllSkiers();
    void removeSkier(Long numSkier);
    void assignSkierToPiste(Long numSkier, Long numPiste);
}
