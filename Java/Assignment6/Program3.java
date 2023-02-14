import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> player14 = new ArrayList<String>();
		ArrayList<String> player15 = new ArrayList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 14:");
		for (int i = 0; i < 5; i++) {
			player14.add(sc.next());
		}
		
		System.out.println("Enter the top 5 scorers of IPL Season 15:");
		for (int i = 0; i < 5; i++) {
			player15.add(sc.next());
		}
		
		System.out.println("Consistent Scorer: ");
		player14.retainAll(player15);
		
		
		for(String i:player14) {
			System.out.println(i);
		}
		
	}

}
