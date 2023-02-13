import java.util.Scanner;

class TeamNameNotFoundException extends Exception{
	public TeamNameNotFoundException(String s) {
		super(s);
	}
}

public class Program4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String teams[] = {"Chennai Super Kings","Sun Risers","Delhi Daredevils",
		                  "Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians",
		                  "Rajasthan Royals","Royal Challengers Bangalore"};
		
		
		

		try {
			System.out.println("Enter the expected winner team of IPL Season 10:");
			String winner = sc.nextLine();
			
			System.out.println("Enter the expected runner Team of IPL Season 10: ");
			String runner = sc.nextLine();
		
			boolean found1=false;
			boolean found2=false;

			for(int i = 0; i < teams.length; i++)
			{
			    if((teams[i].equalsIgnoreCase(winner)))
			    {
			        found1=true;
			    }
			    
			    if((teams[i].equalsIgnoreCase(runner)))
			    {
			    	found2=true;
			       
			    }
			}
			
			if(!(found1 && found2)) {
				 throw new TeamNameNotFoundException("TeamNameNotFoundException: Entered team is not a part of IPL Season 10");
			}
			
			System.out.println("Expected IPL Season 10 winner: "+winner);
			System.out.println("Expected IPL Season 10 runner: "+runner);
		} catch (TeamNameNotFoundException teamNotFondExc) {
			System.out.println(teamNotFondExc.getMessage());
		}
	}

}
