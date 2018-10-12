package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.User;

public interface UserDAO  {
	//����һ���û�
	public int insertUser(User user);
	
	//ɾ��һ���û�
	public void deleteUser(User user);
	
	//�޸�����
	public void updateUser(User user);
	
	//�����˺Ų����û�
	public User findUserByAccount(String account);
	
	//�������û�
	public List<User> getAll();
	
	//ģ����ѯ
	public List<User> findUserBy(String key);
}
