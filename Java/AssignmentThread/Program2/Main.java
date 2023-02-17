package Program2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String matchType = "";
		String scoreString = "";
		
		System.out.println("Enter the Match :");
		matchType = sc.next();
		System.out.println("Enter the Scores : ");
		scoreString = sc.next();
			
		CalculateScores test = new CalculateScores(matchType, scoreString);
		
		
		System.out.println("Enter the Match :");
		matchType = sc.next();
		System.out.println("Enter the Scores : ");
		scoreString = sc.next();
			
		CalculateScores odi = new CalculateScores(matchType, scoreString);
		
		
		System.out.println("Enter the Match :");
		matchType = sc.next();
		System.out.println("Enter the Scores : ");
		scoreString = sc.next();
			
		CalculateScores t20 = new CalculateScores(matchType, scoreString);
		

		Thread t1 = new Thread(test);
		Thread t2 = new Thread(odi);
		Thread t3 = new Thread(t20);
		
		
		try {
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Score Summary");
		
		System.out.println("Match: "+test.getMatchType());
		System.out.printf("Mean Score: %.2f\n",test.getMeanScore());
		System.out.println("Min Score : "+test.getMaxScore());
		System.out.println("Max Score : "+test.getMinScore());
		
		System.out.println("Match: "+odi.getMatchType());
		System.out.printf("Mean Score: %.2f\n",odi.getMeanScore());
		System.out.println("Min Score : "+odi.getMaxScore());
		System.out.println("Max Score : "+odi.getMinScore());
		
		System.out.println("Match: "+t20.getMatchType());
		System.out.printf("Mean Score: %.2f\n",t20.getMeanScore());
		System.out.println("Min Score : "+t20.getMaxScore());
		System.out.println("Max Score : "+t20.getMinScore());
		
		
	}

}
