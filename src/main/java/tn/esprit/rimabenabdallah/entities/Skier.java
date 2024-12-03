package tn.esprit.rimabenabdallah.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skier implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idSkier;

    private String name;
    private LocalDate birthDate;
    private int age;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Subscription subscription;
   @OneToMany(mappedBy = "skier",fetch=FetchType.EAGER)
   Set<Registration> registrations;
   @ManyToMany(mappedBy = "skiers")
    Set<Piste>pistes;

}
