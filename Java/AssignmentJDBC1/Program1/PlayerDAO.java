package Program1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
	public List<Player> getAllPlayers() throws Exception{
		List<Player> list = new ArrayList<Player>();
		
		SkillDAO skdao = new SkillDAO();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignment1","root","root");
		PreparedStatement ps = con.prepareStatement("select * from player order by name"); 
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Skill skill = skdao.getSkillByID((long) rs.getInt(4));
			list.add(new Player(rs.getInt(1), rs.getString(2), rs.getString(3), skill));
		}
		
		return list;
	}
}
