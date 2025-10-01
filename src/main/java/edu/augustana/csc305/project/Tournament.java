package edu.augustana.csc305.project;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private List<Team> teams = new ArrayList<>();
    private Court court;
    private String bracketSyle;

    public Tournament(List<Team> teams, String bracketStyle){
        this.teams = teams;
        this.bracketSyle = bracketStyle;
    }



}
