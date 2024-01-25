package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name= "events")
public abstract class Event {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    @Column(name = "event_date")
    private LocalDate eventDate;

    private String decription;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

private int maxEnter;

@ManyToOne
    @JoinColumn(name = "event_location")
    private Location location;

@OneToMany(mappedBy = "event", cascade = CascadeType.REMOVE)
private List<Attendance> attendances;
public Event(){}

    public Event(String title, LocalDate eventDate, String decription, EventType eventType, int maxEnter, Location location) {
        this.title = title;
        this.eventDate = eventDate;
        this.decription = decription;
        this.eventType = eventType;
        this.maxEnter = maxEnter;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaxEnter() {
        return maxEnter;
    }

    public void setMaxEnter(int maxEnter) {
        this.maxEnter = maxEnter;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", decription='" + decription + '\'' +
                ", eventType=" + eventType +
                ", maxEnter=" + maxEnter +
                ", location=" + location +
                '}';
    }
}
