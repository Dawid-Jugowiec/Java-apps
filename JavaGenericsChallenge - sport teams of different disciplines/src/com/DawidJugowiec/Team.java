package com.DawidJugowiec;

public abstract class Team <T> implements Comparable<Team> {

    private String name;
    private int matchesWon = 0;
    private int matchesLost = 0;
    private int equalizers = 0;
    private int numberOfMatches = 0;


    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public void MatchAgainst(Team <T>  OpponentTeam, int won, int lost) {
        System.out.println("Team" + getName());
        if (won > lost) {
            System.out.println(" won agains ");
            matchesWon++;
            numberOfMatches++;

        } else if (lost > won) {
            System.out.println(" lost against ");
            matchesLost++;
            numberOfMatches++;
        } else {
            System.out.println(" equalized  against ");
            equalizers++;
            numberOfMatches++;
        }




        if (OpponentTeam != null) {
            System.out.println("team: " + OpponentTeam.getName());
            OpponentTeam.MatchAgainst(null, lost, won);

        }
    }


    public int Score() {
        return (matchesWon * 3) + equalizers;
    }

    @Override
    public int compareTo(Team o) {
        if (Score() < o.Score()) {
            return 1;
        } else if (Score() > o.Score())
            return -1;

        else
            return 0;
    }
}


