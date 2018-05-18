package com.taurus.web.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.taurus.dao.ProductDao;
import com.taurus.domain.Cart;
import com.taurus.domain.CartItem;
import com.taurus.domain.Product;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.valueOf(request.getParameter("pid"));
		int count = Integer.valueOf(request.getParameter("count"));
		
		//根据pid查询商品对象
		Product product = new ProductDao().getOne(pid);
		CartItem cItem = new CartItem();
		
		//将商品存入购物项中
		cItem.setProduct(product);
		cItem.setCount(count);
		//存入小计
		cItem.setSubtotal(product.getShopPrice()*count);
	
		//从session中取出购物车对象，如果session中没有购物车，则new一个
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		if(cart == null) {
			cart = new Cart();
			cart.setTotal(0.0);
		}
		
		//将订单项放进购物车对象的map中,购物车的map对象来自于session
		Map<String, CartItem> cMap = cart.getOrderItems();
		cMap.put(request.getParameter("pid"), cItem);
		cart.setOrderItems(cMap);
		
		//总计，session中购物车的总计加上刚添加进来的购物项小计
		Double total = cart.getTotal()+cItem.getSubtotal();
		cart.setTotal(total);
		
		//将购物车重新放进session中
		request.getSession().setAttribute("cart", cart);
		
		//遍历map的两种方式，map.keySet方法将map转为set
//		cart.getOrderItems().forEach((k,v)->System.out.println("key:"+k+"  value:"+v));
		for(String key : cart.getOrderItems().keySet()) {
			System.out.println(cart.getOrderItems().get(key));
		}
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
