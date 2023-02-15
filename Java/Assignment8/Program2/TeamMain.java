package Program2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Program1.Player;
import Program1.PlayerComparator;

public class TeamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Team> t = new ArrayList<Team>();
		
		System.out.println("Enter number of teams:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter team "+i+" detail");
			System.out.println("Enter Name:");
			String name = sc.next();
			System.out.println("Enter number of matches:");
			long numberOfMatches = sc.nextLong();
			
			Team team = new Team(name, numberOfMatches);
			t.add(team);
			
		}
		
		Comparator<Team> c = new Comparator<Team>() {
			
			@Override
			public int compare(Team o1, Team o2) {
				if(o1.getNumberOfMatches()>o2.getNumberOfMatches()) {
					return 1;
				}else if(o1.getNumberOfMatches()<o2.getNumberOfMatches()) {
					return -1;
				}else {
					return 0;
				}
			}
		};
		
		Collections.sort(t,c);
		
		for(Team i:t) {
			System.out.println(i);
		}
	}

}
