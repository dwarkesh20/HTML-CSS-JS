package com.einfochips.demomvc.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.einfochips.demomvc.model.User;

public class UserDAO {
	public int insert(User user) throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		
		PreparedStatement pt = con.prepareStatement("insert into info values (0,?,?)");
		pt.setString(1, user.getName());
		pt.setString(2, user.getEmail());
		return pt.executeUpdate();
	}
	
	
	public List<User> displayAll() throws Exception {
		List<User> li = new ArrayList<>();
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		
		PreparedStatement pt = con.prepareStatement("select * from info");
		
		ResultSet rs = pt.executeQuery();
		
		while (rs.next()) {
			li.add(new User(rs.getString(2), rs.getString(3)));
		}
		
		return li;
		
		
	}
}
