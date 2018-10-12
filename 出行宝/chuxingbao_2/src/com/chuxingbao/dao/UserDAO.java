package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.User;

public interface UserDAO  {
	//增加一个用户
	public int insertUser(User user);
	
	//删除一个用户
	public void deleteUser(User user);
	
	//修改密码
	public void updateUser(User user);
	
	//根据账号查找用户
	public User findUserByAccount(String account);
	
	//查所有用户
	public List<User> getAll();
	
	//模糊查询
	public List<User> findUserBy(String key);
}
