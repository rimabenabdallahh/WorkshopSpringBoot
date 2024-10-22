package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Piste;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PisteServiceImpl implements IPisteServices{

    @Override
    public Piste addPiste(Piste piste) {
        return null;
    }

    @Override
    public List<Piste> retrieveAllPiste() {
        return List.of();
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return null;
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public void removePiste(Long numPiste) {

    }
}
