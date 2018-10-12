package com.chuxingbao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chuxingbao.domain.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserInfoDAO {
	@Autowired
	private UserInfoDAO userInfoDAO ;

	@Test
	public void testInsertUserInfo() {
		UserInfo userInfo = new UserInfo("mj", "1.jpg", "1", "Å®",  100);
		userInfoDAO.insertUserInfo(userInfo);
	}

	@Test
	public void testGetUserInfoByAccount() {
		UserInfo userInfo = userInfoDAO.getUserInfoByAccount("mj");
		System.err.println(userInfo.getAccount());
	}

	@Test
	public void testUpdateUserInfo() {
		UserInfo userInfo = userInfoDAO.getUserInfoByAccount("mj");
		userInfo.setAddress("¹àÄÏ");
		userInfoDAO.updateUserInfo(userInfo);
	}

}
