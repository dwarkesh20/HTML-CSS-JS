package Program2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Program1.Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Wicket> players = new HashMap<String,Wicket>();
		
		String temp = "yes";
		
		while (temp.equalsIgnoreCase("yes")) {
			System.out.println("Enter the player name:");
			String bowlerName = sc.next();
			sc.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			String wickets = sc.nextLine();
			
			
			players.put(bowlerName, new Wicket(wickets,new Bowler(bowlerName)));
			
			System.out.println("Do you want to add another player (yes/no)");
			temp = sc.next();
			
		}

		temp = "yes";
		while (temp.equalsIgnoreCase("yes")) {
			System.out.println("Enter the player name to search:");
			String name = sc.next();
		
			Wicket w = players.get(name);
			if(w == null) {
				System.out.println("No player found with the name "+name);
			}
			else {
				System.out.println("Player name: "+name);
				
				String[] wicketlist= w.getPlayerName().split("\\|");
				
				System.out.println("Wickets: ");
				for (String wcl : wicketlist) {
					System.out.println(wcl);
					
				}
				
			}
			
			System.out.println("Do you want to search another player (yes/no)");
			temp = sc.next();
		}
		
	}

}
