package teamPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team>{
	private String name;
	private List<Player> playerList;

	public Team(String name) {
		super();
		this.name = name;
		this.playerList = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	
	
	public void addPlayer(String playername) {
		Player pl = new Player(playername);
		playerList.add(pl);
	}
	
	@Override
	public int compareTo(Team o) {
		return this.name.compareTo(o.getName());
	}
	
	
}
