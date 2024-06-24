// Chapter 8 exercise

import java.util.*;

public class BowlingTeamDemo {
	public static void main(String[] args) {

		// variables and constants
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 3;
		Scanner input = new Scanner(System.in);
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];

		// Input phase
		for(y = 0; y < NUM_TEAMS; ++y) {
		// each time through this loop, construct a new BowlingTeam object
			teams[y] = new BowlingTeam();
			System.out.print("Enter team name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
				System.out.print("Enter team member's name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			} // end of MEMBERS FOR loop
		} // end of TEAMS FOR loop

		// Output phase
		for(y = 0; y < NUM_TEAMS; ++y) {
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
				System.out.print(teams[y].getMember(x) + " ");
			} // end of FOR loop
			System.out.println();
		} // end of TEAMS output FOR loop

	} // end of main()
} // end of class block