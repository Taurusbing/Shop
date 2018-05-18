package com.taurus.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taurus.dao.CategoryDao;
import com.taurus.dao.ProductDao;
import com.taurus.domain.Category;
import com.taurus.domain.Product;
@WebServlet("/home.do")
public class HomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao pDao = new ProductDao();
		List<Product> list = pDao.findHot();
		request.setAttribute("hotP", list);
		//获取最新商品
		List<Product> newP = pDao.findNew();
		request.setAttribute("newP", newP);
		
		//分类信息
		CategoryDao cd = new CategoryDao();
		List<Category> cate = cd.find();
		request.setAttribute("cate", cate);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
