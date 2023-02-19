package Program1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the Team:");
		String teamName = sc.nextLine();
		
		Player player = new Player();
		Team team = new Team(teamName, null);
		while (true) {
			System.out.println("1.Add Player\r\n"
					+ "2.Delete Player\r\n"
					+ "3.Display Players\r\n"
					+ "4.Exit");
			
			int choice = sc.nextInt(); sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter the details of player in CSV format:");
				String details = sc.nextLine();
				player = Player.createPlayer(details);
				if(player!=null) {
					team.addPlayerToTeam(player);
					System.out.println("Player successfully added");
				}
				break;
			case 2:
				System.out.println("Enter the name of the player to be deleted:");
				String name = sc.nextLine();
				if(team.removePlayerFromTeam(name)){
					System.out.println("Player successfully deleted");
				}else {
					System.out.println("Player not found in the team");
				}
				break;
			case 3:
				team.displayPlayers();
				break;
			case 4:
				return;
			default:
				break;
			}
		}

	}

}
