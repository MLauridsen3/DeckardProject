package edu.augustana.csc305.project;

import java.util.List;

public class Court {
    private short numCourts;
    private short courtNum;
    private boolean refereeAssigned;
    private List<Team> teamsAssigned;

    public Court(short numCourts, short courtNum, boolean refereeAssigned, List<Team> teamsAssigned){
        this.numCourts = numCourts;
        this.courtNum = courtNum;
        this.refereeAssigned = refereeAssigned;
        this.teamsAssigned = teamsAssigned;
    }

    public List<Team> getTeamAssignment(){
        return teamsAssigned;
    }

    public short getNumCourts(){
        return numCourts;
    }

    public short getCourtNum(){
        return courtNum;
    }

    public boolean hasReferee(){
        return refereeAssigned;
    }

    public void addReferee(){
        refereeAssigned = true;
    }

    public Boolean hasMinNumOfCourts(){
        return teamsAssigned.size() % 4 == 0;
    }
}
