package com.taurus.test;

import java.util.List;

import org.junit.Test;

import com.taurus.dao.ProductDao;
import com.taurus.domain.Product;
import com.taurus.domain.User;

public class ProductTest {
	@Test
	public void findHot() {
		ProductDao pDao = new ProductDao();
		List<Product> list = pDao.findHot();
		for(Product li : list) {
			System.out.println(li);
		}
	}
	@Test
	public void findNew() {
		ProductDao pDao = new ProductDao();
		List<Product> list = pDao.findNew();
		for(Product li : list) {
			System.out.println(li);
		}
	}
	
	@Test
	public void getOne() {
		ProductDao pDao = new ProductDao();
		Product product = pDao.getOne(3);
		System.out.println(product);
	}
}
