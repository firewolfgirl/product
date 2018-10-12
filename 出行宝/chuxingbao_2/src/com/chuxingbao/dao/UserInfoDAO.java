package com.chuxingbao.dao;

import com.chuxingbao.domain.UserInfo;

public interface UserInfoDAO{
	//增加一个用户信息
	public void insertUserInfo(UserInfo userInfo);
		
	//根据账号查找用户信息
	public UserInfo getUserInfoByAccount(String account);
		
	//修改用户信息
	public void updateUserInfo(UserInfo userInfo);

}
