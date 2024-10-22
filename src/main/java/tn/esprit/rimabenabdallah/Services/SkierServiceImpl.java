package tn.esprit.rimabenabdallah.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.repositories.ISkierRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class SkierServiceImpl implements ISkierServices {
    private final ISkierRepository skierRepository;
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


}
