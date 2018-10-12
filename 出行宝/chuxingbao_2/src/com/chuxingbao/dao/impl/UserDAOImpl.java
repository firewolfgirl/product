package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.UserDAO;
import com.chuxingbao.domain.User;




@Repository
@Transactional //增删改都要加
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertUser(User user) {
		getSession().save(user);
		return 1;
	}

	@Override
	public User findUserByAccount(String account) {
		//1.getSession().get(类名.class, id)
		//2.通过获得Query对象
		String hql = "from User u where u.account = ? " ;//指定hql查询条件
		Query query = getSession().createQuery(hql);//创建Query对象
		query.setParameter(0, account);//设置参数，下标从0开始
		User user = (User) query.uniqueResult();//单值查询
		return user;
	}

	@Override
	public List<User> findUserBy(String key) {
		//拼接根据关键字模糊查询的hql(like!!!!!!!)
		//String hql = "from User u where u.account like '% "+key+"%'";
		String hql = "from User u where u.account like ? ";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, "%"+key+"%");
		return (List<User>)query.list();
	}

	@Override
	public void deleteUser(User user) {
       getSession().delete(user);		
	}

	@Override
	public void updateUser(User user) {
       getSession().update(user);
	}

	@Override
	public List<User> getAll() {
		return getSession().createQuery("from User u").list();
	}

}
