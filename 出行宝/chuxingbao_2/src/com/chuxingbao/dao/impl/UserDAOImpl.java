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
@Transactional //��ɾ�Ķ�Ҫ��
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*��ȡsession�ķ���
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
		//1.getSession().get(����.class, id)
		//2.ͨ�����Query����
		String hql = "from User u where u.account = ? " ;//ָ��hql��ѯ����
		Query query = getSession().createQuery(hql);//����Query����
		query.setParameter(0, account);//���ò������±��0��ʼ
		User user = (User) query.uniqueResult();//��ֵ��ѯ
		return user;
	}

	@Override
	public List<User> findUserBy(String key) {
		//ƴ�Ӹ��ݹؼ���ģ����ѯ��hql(like!!!!!!!)
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
