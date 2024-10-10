package tn.esprit.rimabenabdallah.Services;

import tn.esprit.rimabenabdallah.entities.Skier;
import tn.esprit.rimabenabdallah.repositories.ISkierRepository;

public class SkierServiceImpl {
    private ISkierRepository skierRepository;
    public Skier addSkier (Skier skier)
    {  return skierRepository.save(skier);

    }
}
