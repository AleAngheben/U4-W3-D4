package org.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "matches")
public class Football extends Event {

    @Column(nullable = false , name = "home_team")
    private String homeTeam;

    @Column(nullable = false , name = "guest_team")
    private String guestTeam;

    @Column(name = "winning_team")
private String winningTeam;

    @Column(nullable = false, name = "goals_home")
    private int goalsHome;

    @Column(nullable = false, name = "goals_home")
    private int goalsGuest;


    public Football(){}


    public Football(String title, LocalDate eventDate, String decription, EventType eventType, int maxEnter, Location location, String homeTeam, String guestTeam, String winningTeam, int goalsHome, int goalsGuest) {
        super(title, eventDate, decription, eventType, maxEnter, location);
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.goalsHome = goalsHome;
        this.goalsGuest = goalsGuest;

        if(goalsHome>goalsGuest){
            this.winningTeam = homeTeam;
        } else if (goalsHome < goalsGuest) {
            this.winningTeam = guestTeam;
        }else{
            this.winningTeam=null;
        }
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam;
    }

    public String getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public int getGoalsHome() {
        return goalsHome;
    }

    public void setGoalsHome(int goalsHome) {
        this.goalsHome = goalsHome;
    }

    public int getGoalsGuest() {
        return goalsGuest;
    }

    public void setGoalsGuest(int goalsGuest) {
        this.goalsGuest = goalsGuest;
    }

}
