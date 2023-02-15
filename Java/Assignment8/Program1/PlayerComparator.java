package Program1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		int skillCheck = o1.getSkill().compareToIgnoreCase(o2.getSkill());
		if(skillCheck!=0) {
			return skillCheck;
		}
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
