package com.DawidJugowiec;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Footballteam FC_Barcelona = new Footballteam("FC_Barcelona");
        Footballteam Manchester_United = new Footballteam("Manchester_United");
        Footballteam Arsenal_London = new Footballteam("Arsenal_London");

        BaseBallTeam Dolphins = new BaseBallTeam("Dolphins");
        BaseBallTeam Hornets = new BaseBallTeam("Hornets");
        BaseBallTeam Magicians = new BaseBallTeam("Magicians");

        BasketBallTeam Chicago_Bulls = new BasketBallTeam("Chicago_Bulls");
        BasketBallTeam Lakeyers = new BasketBallTeam("Lakeyers");
        BasketBallTeam Wizards = new BasketBallTeam("Wizards");

        Leaque <BaseBallTeam> Majors = new Leaque <>("Majors");
        Leaque <Footballteam> FootBallTournament = new Leaque <>("FootBallTournament");
        Leaque <BasketBallTeam> BasketBallTournament = new Leaque <>("BasketBallTournament");

        Majors.addTeam(Dolphins);
        Majors.addTeam(Hornets);
        Majors.addTeam(Magicians);
        Majors.addTeam(Magicians);

        Dolphins.MatchAgainst(Hornets, 0, 1);
        Dolphins.MatchAgainst(Magicians, 1, 3);
        Hornets.MatchAgainst(Magicians, 3, 1);

        Majors.printTableLeaque();
        Hornets.MatchAgainst(FC_Barcelona , 2 ,1);



    }
}
