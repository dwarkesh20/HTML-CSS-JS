import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException{
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the total runs scored: ");
			int runs = sc.nextInt();
			System.out.println("Enter the total overs faced: ");
			int overs = sc.nextInt();
			float RunRate = runs/overs;
			System.out.println(RunRate);
		} 
		catch (ArithmeticException ae) {
			System.out.println(ae);
		} 
		catch (NumberFormatException nfe) {
			System.out.println(nfe);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
