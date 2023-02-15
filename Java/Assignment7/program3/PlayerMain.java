package teamPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Team> teams = new ArrayList<>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String arr[] = sc.nextLine().split("\\|");
			String teamName = arr[0];
			String playerName = arr[1];
			boolean found = false;
			
			for(Team team:teams) {
				if(team.getName().equalsIgnoreCase(teamName)) {
					team.addPlayer(playerName);
					found = true;
					break;
				}
			}
			
			if(!found) {
				Team team = new Team(teamName);
				team.addPlayer(playerName);
				teams.add(team);
			}
			
		}
		Collections.sort(teams);
		
		for(Team team: teams) {
			System.out.println(team.getName()+":");
			List<Player> players = team.getPlayerList();
			for(Player player : players) {
				System.out.println("--"+player.getName());
			}
			
		}
	}

}
