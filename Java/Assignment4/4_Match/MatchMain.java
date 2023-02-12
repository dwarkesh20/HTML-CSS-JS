package match;

import java.util.Scanner;

public class MatchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the match format\r\n"
				+ "1. ODI\r\n"
				+ "2. T20\r\n"
				+ "3. Test:");
		int choice = sc.nextInt();
		
		System.out.println("Enter the Current score: ");
		int currentscore = sc.nextInt();
		
		System.out.println("Enter the current Over: ");
		float currentover = sc.nextFloat();
		
		System.out.println("Enter the Target Score: ");
		int target = sc.nextInt();
		
		int balls;
		float RunRate;
		switch (choice) {
		case 1:
			ODIMatch odi1 = new ODIMatch(currentscore, currentover, target);
			balls = odi1.calculateBalls();
			RunRate = odi1.calculateRunRate();
			odi1.display(RunRate, balls);
			break;
		case 2:
			T20Match t201 = new T20Match(currentscore, currentover, target);
			balls = t201.calculateBalls();
			RunRate = t201.calculateRunRate();
			t201.display(RunRate, balls);
			break;
		case 3:
			TestMatch test1 = new TestMatch(currentscore, currentover, target);
			balls = test1.calculateBalls();
			RunRate = test1.calculateRunRate();
			test1.display(RunRate, balls);
			break;
		default:
			System.out.println("Invalid Input.");
			break;
		}
	}
}
