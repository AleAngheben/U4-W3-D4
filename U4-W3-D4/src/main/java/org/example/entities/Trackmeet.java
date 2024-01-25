package org.example.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "track_meets")
public class Trackmeet extends Event {

    @ManyToMany
    @JoinTable(name = "person_competition", joinColumns = @JoinColumn(name = "competition_id"), inverseJoinColumns = @JoinColumn(name = "athlete_id"))
    private Set<Person> athlete;

    @ManyToOne
    @JoinColumn(name = "winner")
    private Person winner;
}
