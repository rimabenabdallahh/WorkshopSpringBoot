package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Piste;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.repositories.IPisteRepository;
import tn.esprit.rimabenabdallah.repositories.ISkierRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class SkierServiceImpl implements ISkierServices {
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    @Override
    public Skier addSkier ( Skier skier)
    {  return skierRepository.save(skier);

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


}
