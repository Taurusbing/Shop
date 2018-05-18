package com.taurus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.taurus.domain.User;
import com.taurus.tool.DBUtil;

public class UserDao {
	public int insert(User user) {
		Connection con = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			con = DBUtil.getConnection();
			String sql = "insert into user(username,password,name,email,telephone,sex,state,code) value(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getTelephone());
			ps.setString(6, user.getSex());
			ps.setInt(7, user.getState());
			ps.setString(8, user.getCode());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, null);
		}
		return row;
	}
}
