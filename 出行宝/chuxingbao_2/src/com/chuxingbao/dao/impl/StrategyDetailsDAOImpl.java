package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.StrategyDetailsDAO;
import com.chuxingbao.domain.CarouselFigure;
import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.StrategyDetails;
@Repository
@Transactional //增删改都要加
public class StrategyDetailsDAOImpl implements StrategyDetailsDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertStrategyDetails(StrategyDetails strategyDetails) {
		getSession().save(strategyDetails);
		return 1;
	}

	@Override
	public void deleteStrategyDetails(StrategyDetails strategyDetails) {
		getSession().delete(strategyDetails);

	}

	@Override
	public StrategyDetails findStrategyDetails(int id) {
		String hql = "FROM StrategyDetails s WHERE s.id=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		return (StrategyDetails)query.list();
	}

	@Override
	public List<StrategyDetails> getAll() {
		return getSession().createQuery("from StrategyDetails s").list();
	}

	@Override
	public List<StrategyDetails> findNew() {
		String hql ="FROM StrategyDetails s ORDER BY s.id DESC ";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(5);
		return (List<StrategyDetails>)query.list();
	}

	@Override
	public List<StrategyDetails> findAll() {
		return getSession().createQuery("FROM StrategyDetails s").list();
	}

}
