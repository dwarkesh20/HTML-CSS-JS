import java.util.Arrays;
import java.util.Scanner;

public class SortScoreMain {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String matchType = "";
		String scoreString = "";
		
			System.out.println("Enter the Match :");
			matchType = sc.next();
			System.out.println("Enter the Scores : ");
			scoreString = sc.next();
			
			SortScore odi = new SortScore(matchType, scoreString);
			
			/* --------------------------------------------------------- */
			
			System.out.println("Enter the Match :");
			matchType = sc.next();
			System.out.println("Enter the Scores : ");
			scoreString = sc.next();
			
			SortScore test = new SortScore(matchType, scoreString);
			
			/* --------------------------------------------------------- */

			System.out.println("Enter the Match :");
			matchType = sc.next();
			System.out.println("Enter the Scores : ");
			scoreString = sc.next();
			
			SortScore t20 = new SortScore(matchType, scoreString);
			
			/* --------------------------------------------------------- */
			
			odi.start();
			test.start();
			t20.start();
			
			odi.join();
			test.join();
			t20.join();
			
			System.out.println("Match Type: " + odi.getMatchType());
	        System.out.println(Arrays.toString(odi.getScores()));
	        
	        System.out.println("Match Type: " + test.getMatchType());
	        System.out.println(Arrays.toString(test.getScores()));
	        
	        System.out.println("Match Type: " + t20.getMatchType());
	        System.out.println(Arrays.toString(t20.getScores()));
			
			
			
		

	}

}
