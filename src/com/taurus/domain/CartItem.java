package com.taurus.domain;
/**
 * 购物项实体类(中间表)
 * OrderItem <br>
 * 创建人: Taurus <br>
 * 时间：2018-04-03 12:40:42 <br>
 * @version 1.0.0 <br>
 */
public class CartItem {
	
	//每个订单项对应的商品
	private Product product;
	
	//购买数量
	private int count;
	
	//小计
	private Double subtotal;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + ", count=" + count + ", subtotal=" + subtotal + "]";
	}

}
