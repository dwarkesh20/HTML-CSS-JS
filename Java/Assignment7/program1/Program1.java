import java.util.Scanner;
import java.util.TreeSet;


public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeSet<String> player = new TreeSet<String>();
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			player.add(sc.next());			
		}
		for(String i:player) {
			System.out.println(i);
		}
		
	}

}
