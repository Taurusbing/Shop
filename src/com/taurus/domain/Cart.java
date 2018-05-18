package com.taurus.domain;
/**
 * 购物车实体类
 * Cart <br>
 * 创建人: Taurus <br>
 * 时间：2018-04-03 12:53:13 <br>
 */

import java.util.HashMap;
import java.util.Map;

public class Cart {
	//购物车中存放多个购物项
	private Map<String,CartItem> orderItems = new HashMap<>();
	//总计
	private Double total;
	
	public Map<String, CartItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Map<String, CartItem> orderItems) {
		this.orderItems = orderItems;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
}
