package com.taurus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.validator.PublicClassValidator;

import com.taurus.domain.Product;
import com.taurus.tool.DBUtil;

public class ProductDao {
	//获得热门商品
	public List<Product> findHot() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();
		con = DBUtil.getConnection();
		String sql = "select * from product where is_hot=? limit ?,?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setInt(2, 0);
			ps.setInt(3, 9);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setPid(rs.getInt("pid"));
				product.setPname(rs.getString("pname"));
				product.setMarketPrice(rs.getDouble("market_price"));
				product.setShopPrice(rs.getDouble("shop_price"));
				product.setPimage(rs.getString("pimage"));
				product.setpDate(rs.getDate("pdate"));
				product.setIsHot(rs.getInt("is_hot"));
				product.setPdesc(rs.getString("pdesc"));
				product.setPflag(rs.getInt("pflag"));
				product.setCid(rs.getString("cid"));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, rs);
		}
		return list;
	}
	//获得最新商品
	public List<Product> findNew() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();
		con = DBUtil.getConnection();
		String sql = "select * from product order by pdate desc limit ?,?;";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, 0);
			ps.setInt(2, 9);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setPid(rs.getInt("pid"));
				product.setPname(rs.getString("pname"));
				product.setMarketPrice(rs.getDouble("market_price"));
				product.setShopPrice(rs.getDouble("shop_price"));
				product.setPimage(rs.getString("pimage"));
				product.setpDate(rs.getDate("pdate"));
				product.setIsHot(rs.getInt("is_hot"));
				product.setPdesc(rs.getString("pdesc"));
				product.setPflag(rs.getInt("pflag"));
				product.setCid(rs.getString("cid"));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, rs);
		}
		return list;
	}
	
	//获取单个商品的信息
	public Product getOne(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		String sql = "select * from product where pid = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				Product product = new Product();
				product.setPid(rs.getInt("pid"));
				product.setPname(rs.getString("pname"));
				product.setMarketPrice(rs.getDouble("market_price"));
				product.setShopPrice(rs.getDouble("shop_price"));
				product.setPimage(rs.getString("pimage"));
				product.setpDate(rs.getDate("pdate"));
				product.setIsHot(rs.getInt("is_hot"));
				product.setPdesc(rs.getString("pdesc"));
				product.setPflag(rs.getInt("pflag"));
				product.setCid(rs.getString("cid"));
				return product;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
