package com.chuxingbao.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chuxingbao.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserDAO {
	@Autowired 
	private UserDAO userDAO;

	@Test
	public void testGetSession() {
		
	}

	@Test
	public void testInsertUser() {
		User user = new User("ddd", "111");
		int n = userDAO.insertUser(user);
		assertEquals(1, n);
	}

	@Test
	public void testFindUserByAccount() {
		User user = userDAO.findUserByAccount("mj");
		System.err.println(user);
	}
	
	@Test
	public void testFindUserBy() {
		List<User> list = userDAO.findUserBy("m");
		System.err.println(list.size());
	}
	
	@Test
	public void testdeleteUser() {
		User user = userDAO.findUserByAccount("mj");
		userDAO.deleteUser(user);
	}
	
	@Test
	public void testupdateUser() {
		User user = userDAO.findUserByAccount("mj");
		user.setPassword("newmj");
		userDAO.updateUser(user);
	}
	

}
