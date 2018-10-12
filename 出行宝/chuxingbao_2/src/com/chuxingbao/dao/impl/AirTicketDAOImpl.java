package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.AirTicketDAO;
import com.chuxingbao.domain.AirTicket;
import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.TrainTicket;
@Repository
@Transactional //增删改都要加
public class AirTicketDAOImpl implements AirTicketDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertAirTicket(AirTicket airTicket) {
		getSession().save(airTicket);
		return 1;
	}

	@Override
	public void deleteAirTicket(AirTicket airTicket) {
		getSession().delete(airTicket);

	}

	@Override
	public List<AirTicket> findAirTicketByStartAndEnd(String start, String end) {
		String hql = "FROM AirTicket a WHERE a.start = ? AND a.end=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, start);
		query.setParameter(0, end);
		return (List<AirTicket>)query.list();
	}

	@Override
	public List<AirTicket> getAll() {
		return getSession().createQuery("from AirTicket a").list();
	}

	@Override
	public List<AirTicket> findNew() {
		String hql ="FROM AirTicket a ORDER BY a.id DESC ";
		Query query = getSession().createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(5);
		return (List<AirTicket>)query.list();
	}

	@Override
	public List<AirTicket> findAll() {
		return getSession().createQuery("FROM AirTicket a").list();
	}

}
