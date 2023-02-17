package Program3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range of scores:");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		Scores s1 = new Scores(start, end, "ODD");
		Scores s2 = new Scores(start, end, "EVEN");
		
		try {
			s1.start();
			s2.start();
			s1.join();
			s2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Odd scores in given range ");
		s1.display();
		System.out.println("\nEven scores in given range ");
		s2.display();
	}
}
