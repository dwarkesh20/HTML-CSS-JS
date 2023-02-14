import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> player = new ArrayList<String>();
        
        System.out.println("Enter the player details");
        
        System.out.println("Enter player name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter age: ");
        String age = sc.next();
        
        System.out.println("Enter Country: ");
        String country = sc.next();

        player.add(name);
        player.add(age);
        player.add(country);
                
        System.out.println("Player Details");
        for(String i:player) {
        	System.out.println(i);
        }
        
        System.out.println("Enter Skill:");
        String skill = sc.next();
        
        System.out.println("Enter the position to add the skill: ");
        int pos = sc.nextInt();
        
        player.set(pos, skill);
        
        System.out.println("Player Details");
        for(String i:player) {
        	System.out.println(i);
        }
        
        System.out.println("Enter the position of the detail to be removed: ");
        pos = sc.nextInt();
        player.remove(pos);
        
        System.out.println("Player Details");
        for(String i:player) {
        	System.out.println(i);
        }

        
	}
	
}
