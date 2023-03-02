package Program1;

import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		PlayerDAO pldao = new PlayerDAO();
		List<Player> list = pldao.getAllPlayers();
		
		System.out.println("Id\tName\t\t\tCountry\t\tSkill");
		for(Player p : list) {
			System.out.println(p);
		}
	}

}
