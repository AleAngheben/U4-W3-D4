package org.example.entities;


import javax.persistence.*;

@Entity
@Table(name = "attendances")
public class Attendance {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "event_id")
private Event event;




}
