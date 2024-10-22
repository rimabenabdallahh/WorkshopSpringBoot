package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste piste);
    List<Piste> retrieveAllPiste();
    Piste retrievePiste(Long numPiste);
    Piste updatePiste(Piste piste);
    void removePiste(Long numPiste);

}
