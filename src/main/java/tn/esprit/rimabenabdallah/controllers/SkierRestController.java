package tn.esprit.rimabenabdallah.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rimabenabdallah.Services.ISkierServices;
import tn.esprit.rimabenabdallah.Services.SkierServiceImpl;
import tn.esprit.rimabenabdallah.entities.Skier;

@RequiredArgsConstructor
@RestController
@RequestMapping("skier")
public class SkierRestController {
private final ISkierServices skierServices;


    @PostMapping("/add")
            public Skier saveSkier(
                    @RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }@GetMapping("/get/{numSkier}")
    public Skier getSkier(Long numSkier){
      return skierServices.retrieveSkier(numSkier);
    }
}
