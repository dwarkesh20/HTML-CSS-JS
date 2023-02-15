package Program1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class PlayerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Player> p = new ArrayList<Player>();
		
		System.out.println("Please provide the number of players to be registered:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {	
			System.out.println("Please enter player name:");
			String name = sc.next();
			String skill="";
			System.out.println("Please select the skill of the player\r\n"
					+ "1.All Rounder\r\n"
					+ "2.Batsman\r\n"
					+ "3.Bowler");
			int ch = sc.nextInt();
			
			if(ch==1) {
				skill="All Rounder";
			}else if(ch==2) {
				skill="Batsman";
			}else if(ch==3) {
				skill="Bowler";
			}else {
				System.out.println("Invalid choice.");
				return;
			}
			
			Player player = new Player(name, skill);
			p.add(player);
		 
			
		}
		
		Collections.sort(p,new PlayerComparator());
		
		for(Player i:p) {
			System.out.println(i);
		}
	}

}
