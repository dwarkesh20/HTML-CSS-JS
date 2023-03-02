package Program1;

import java.sql.*;

public class SkillDAO {
	public Skill getSkillByID(Long id) throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcassignment1","root","root");
		PreparedStatement ps = con.prepareStatement("select * from skill where id="+id);
		ResultSet rs = ps.executeQuery();
		Skill skill = new Skill();
		while (rs.next()) {
			skill.setSkillId(rs.getInt(1));
			skill.setSkillName(rs.getString(2));
		}
		
		
		return skill;
	}
}
