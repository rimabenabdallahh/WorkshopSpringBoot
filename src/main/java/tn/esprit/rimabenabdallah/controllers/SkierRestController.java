package tn.esprit.rimabenabdallah.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rimabenabdallah.Services.ISkierServices;
import tn.esprit.rimabenabdallah.Services.SkierServiceImpl;
import tn.esprit.rimabenabdallah.entities.Color;
import tn.esprit.rimabenabdallah.entities.Skier;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("skier")
public class SkierRestController {
private final ISkierServices skierServices;


    @PostMapping("/add")
            public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier( @PathVariable Long numSkier){
      return skierServices.retrieveSkier(numSkier);
    }
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier)
    {
        return skierServices.updateSkier(skier);
    }
    @GetMapping("/all")
    public List<Skier> retrieveAllSkiers(){
        return skierServices.retrieveAllSkiers();
    }
    @PutMapping("/assignToPiste/{numSkier}/{numPiste}")
    public void assignSkier(@PathVariable Long numSkier,@PathVariable Long numPiste)
    {
        skierServices.assignSkierToPiste(numSkier,numPiste);
    }
    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkieur(@PathVariable Long numSkier) {
        skierServices.removeSkier(numSkier);
    }
    @GetMapping("/getBy/{name}")
    public Skier getByName(@PathVariable String name) {
        return skierServices.getByName(name);
    }
    @GetMapping("/ByBirthDate/{birthDate}")
    public List<Skier> getByBirthDate(@PathVariable LocalDate birthDate) {
        return skierServices.getByBirthDate(birthDate);
    }

    @PostMapping("/assign/{name}/{color}")
    public Skier assignSkierToPiste(@PathVariable String name, @PathVariable Color color) {
        Skier assignedSkier = skierServices.assignSkierToPiste(name, color);
        return assignedSkier;
    }
}
