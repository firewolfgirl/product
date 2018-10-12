package com.chuxingbao.dao;

import com.chuxingbao.domain.UserInfo;

public interface UserInfoDAO{
	//����һ���û���Ϣ
	public void insertUserInfo(UserInfo userInfo);
		
	//�����˺Ų����û���Ϣ
	public UserInfo getUserInfoByAccount(String account);
		
	//�޸��û���Ϣ
	public void updateUserInfo(UserInfo userInfo);

}
