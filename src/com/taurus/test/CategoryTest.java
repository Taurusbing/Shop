package com.taurus.test;

import java.util.List;

import org.junit.Test;

import com.taurus.dao.CategoryDao;
import com.taurus.domain.Category;

public class CategoryTest {
	@Test
	public void find() {
		CategoryDao cd = new CategoryDao();
		List<Category> list = cd.find();
		for(Category li : list) {
			System.out.println(li);
		}
	}
}
