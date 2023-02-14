import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> team = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			team.add(sc.next());
		}
		
		
		System.out.println("Enter swap positions:");
		int pos = sc.nextInt();
		
		if(pos>team.size()-1) {
			System.out.println("Invalid index.");
			return;
		}
		else {
			String s1 = team.get(0);
			String s2 = team.get(pos);
			
			team.set(0, s2);
			team.set(pos, s1);
			
			
			for(String i:team) {
				System.out.println(i);
			}
		}
	}

}
