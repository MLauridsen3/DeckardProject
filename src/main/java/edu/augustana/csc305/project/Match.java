package edu.augustana.csc305.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Match {
    private List<Team> teams = new ArrayList<>();
    private Boolean isPoolPlay;
    private Boolean isBracketPlay;
    private Court court;
    private Tournament tournament;
    private Random coinFlip = new Random();

    public Match(List<Team> teams){
        this.teams = teams;
    }

    public List<Team> getTeams(){
        return teams;
    }

    private Team playsFirst(Random coinFlip){
        if (coinFlip.nextDouble(0.0, 1.0) >= 0.5){
            return teams.get(0);
        } else {
            return teams.get(1);
        }
    }

    public Team game(List<Team> teams){
        Team advantageTeam = playsFirst(coinFlip);
        String name = advantageTeam.getName();
        return advantageTeam;
    }



    // Using this to test functionality

    public static void main(String[] args) {
        Random coinFlip = new Random();
        Double test = coinFlip.nextDouble(0.0, 1.0);
        System.out.println(test);
        System.out.println(test >= 0.5);
    }



}
