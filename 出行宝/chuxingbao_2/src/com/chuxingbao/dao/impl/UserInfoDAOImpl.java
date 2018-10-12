package com.chuxingbao.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.UserInfoDAO;
import com.chuxingbao.domain.UserInfo;



@Repository
@Transactional
public class UserInfoDAOImpl implements UserInfoDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		getSession().save(userInfo);
	}

	@Override
	public UserInfo getUserInfoByAccount(String account) {
		String hql = "FROM UserInfo u WHERE account = ? " ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, account);
		UserInfo userInfo = (UserInfo) query.uniqueResult();
		return userInfo;
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		getSession().update(userInfo);
	}

}
