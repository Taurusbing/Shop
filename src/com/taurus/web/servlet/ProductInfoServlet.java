package com.taurus.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taurus.dao.ProductDao;
import com.taurus.domain.Product;
@WebServlet("/productInfo")
public class ProductInfoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//商品的id
		int id =  Integer.parseInt(request.getParameter("pid"));
		ProductDao pd = new ProductDao();
	 	Product product = pd.getOne(id);
	 	request.setAttribute("product", product);
	 	request.getRequestDispatcher("product_info.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
