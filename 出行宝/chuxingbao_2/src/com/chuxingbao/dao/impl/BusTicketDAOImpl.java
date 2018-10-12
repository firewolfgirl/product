package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.BusTicketDAO;
import com.chuxingbao.domain.BusTicket;
@Repository
@Transactional //增删改都要加
public class BusTicketDAOImpl implements BusTicketDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertBusTicket(BusTicket busTicket) {
		getSession().save(busTicket);
		return 1;
	}

	@Override
	public void deleteBusTicket(BusTicket busTicket) {
		getSession().delete(busTicket);

	}

	@Override
	public List<BusTicket> findBusTicketByStartAndEnd(String start, String end) {
		String hql = "FROM BusTicket b WHERE b.start = ? AND b.end=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, start);
		query.setParameter(0, end);
		return (List<BusTicket>)query.list();
	}

	@Override
	public List<BusTicket> getAll() {
		return getSession().createQuery("from BusTicket b").list();
	}

}
