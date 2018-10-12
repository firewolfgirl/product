package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.StrategyDAO;
import com.chuxingbao.domain.CarouselFigure;
import com.chuxingbao.domain.Strategy;
import com.zhihu.domain.Post;
import com.zhihu.domain.Topic;
@Repository
@Transactional //增删改都要加
public class StrategyDAOImpl implements StrategyDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertStrategy(Strategy strategy) {
		getSession().save(strategy);
		return 1;
	}

	@Override
	public void deleteStrategy(Strategy strategy) {
		getSession().delete(strategy);

	}

	@Override
	public Strategy findStrategy(int id) {
		String hql = "FROM Strategy s WHERE s.id=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		return (Strategy)query.list();
	}

	@Override
	public List<Strategy> getAll() {
		return getSession().createQuery("from Strategy s").list();
	}
	
	@Override
	public List<Strategy> findNew() {
		String hql ="FROM Strategy s ORDER BY s.id DESC ";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(5);
		return (List<Strategy>)query.list();
	}
	
	@Override
	public List<Strategy> findAll() {
		return getSession().createQuery("FROM Strategy s").list();
	}

}
