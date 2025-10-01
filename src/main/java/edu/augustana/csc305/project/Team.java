package edu.augustana.csc305.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Team {
    private List<String> players = new ArrayList<>();
    private String name;
    private String mascot;
    private Double teamRating;
    private String fightSong;
    private short wins;
    private short losses;

    public Team(List<String> players, String name, String mascot, Double teamRating,
    String fightSong, short wins, short losses){
        this.players = players;
        this.name = name;
        this.mascot = mascot;
        this.teamRating = teamRating;
        this.fightSong = fightSong;
        this.wins = wins;
        this.losses = losses;
    }

    public String getName(){
        return name;
    }

    public String getMascot(){
        return mascot;
    }

    public Double getTeamRating() {
        return teamRating;
    }

    public String getFightSong(){
        return fightSong;
    }

    public void increaseWin(){
        wins += 1;
    }

    public void increaseLoss(){
        losses += 1;
    }
}
