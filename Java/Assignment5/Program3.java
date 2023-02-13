import java.util.Scanner;

class InvalidAgeRangeException extends Exception{
	public InvalidAgeRangeException(String s) {
		super(s);
	}
}

public class Program3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Enter the player name: ");
		String name = sc.next();
		
		System.out.println("Enter the player age: ");
		int age = sc.nextInt();
		
		if(age<19) {
			throw new InvalidAgeRangeException("CustomException: InvalidAgeRangeException");
		}
		else {
			System.out.println("Player name : "+name);
			System.out.println("Player age : "+age);
		}
	}
		catch (InvalidAgeRangeException InAgeExc) {
			System.out.println(InAgeExc.getMessage());
		}
	}

}
