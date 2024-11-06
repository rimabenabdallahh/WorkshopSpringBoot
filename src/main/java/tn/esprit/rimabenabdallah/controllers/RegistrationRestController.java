package tn.esprit.rimabenabdallah.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rimabenabdallah.Services.RegistrationServiceImpl;
import tn.esprit.rimabenabdallah.entities.Registration;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("registration")
public class RegistrationRestController {
    private final RegistrationServiceImpl registrationService;

    @PostMapping("/add")
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationService.updateRegistration(registration);
    }

    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationService.retrieveRegistration(numRegistration);
    }

    @GetMapping("/all")
    public List<Registration> getAllRegistrations() {
        return registrationService.retrieveAllRegistrations();
    }

    @DeleteMapping("/delete/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationService.removeRegistration(numRegistration);
    }



    @PostMapping("/AddAndAssignSkier/{idSkier}")
    public Registration assignSkier(@RequestBody Registration registration,
                                        @PathVariable Long idSkier)
    {
      return registrationService.addRegistrationAndAssignToSkier(registration,idSkier);
    }

    @PutMapping("/assignToCourse/{numCourse}")

    public Registration RegistrationCourse(@RequestBody Registration registration, @PathVariable Long numCourse) {
        return registrationService.RegistrationAndAssignToCourse(registration, numCourse);

    }
}
