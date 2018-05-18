package com.taurus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.taurus.domain.Category;
import com.taurus.tool.DBUtil;

public class CategoryDao {
	public List<Category> find(){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Category> list = new ArrayList<>();
		try {
			con = DBUtil.getConnection();
			String sql = "select * from category";
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Category category = new Category();
				category.setCid(rs.getInt("cid"));
				category.setCname(rs.getString("cname"));
				list.add(category);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, rs);
		}
		return list;
	}
}
