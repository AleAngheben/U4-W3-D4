package org.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "concerts")
public class Concert extends Event {

    @Column(nullable = false, name = "music_gender")
    private GenderMusic musicGender;

    @Column(nullable = false, name = "in_streaming")
    private boolean inStraming;

    public Concert() {
    }

    public Concert(String title, LocalDate eventDate, String decription, EventType eventType, int maxEnter, Location location, GenderMusic musicGender, boolean inStraming) {
        super(title, eventDate, decription, eventType, maxEnter, location);
        this.musicGender = musicGender;
        this.inStraming = inStraming;
    }


    public GenderMusic getMusicGender() {
        return musicGender;
    }

    public void setMusicGender(GenderMusic musicGender) {
        this.musicGender = musicGender;
    }

    public boolean isInStraming() {
        return inStraming;
    }

    public void setInStraming(boolean inStraming) {
        this.inStraming = inStraming;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "musicGender=" + musicGender +
                ", inStraming=" + inStraming +
                "} " + super.toString();
    }
}
