package com.taurus.test;

import org.junit.Test;

import com.taurus.dao.UserDao;
import com.taurus.domain.User;

public class UserTest {
	@Test
	public void insert() {
		UserDao uDao = new UserDao();
		User user = new User();
		user.setUsername("bing冰");
		user.setPassword("123455");
		int row = uDao.insert(user);
		System.out.println(row);
		System.out.println(user);
	}
}
