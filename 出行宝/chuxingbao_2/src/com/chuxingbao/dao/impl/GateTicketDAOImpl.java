package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.GateTicketDAO;
import com.chuxingbao.domain.GateTicket;
@Repository
@Transactional //增删改都要加
public class GateTicketDAOImpl implements GateTicketDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertGateTicket(GateTicket gateTicket) {
		getSession().save(gateTicket);
		return 1;
	}

	@Override
	public void deleteGateTicket(GateTicket gateTicket) {
		getSession().delete(gateTicket);
	}

	@Override
	public List<GateTicket> findGateTicketByStartAndEnd(String start, String end) {
		String hql = "FROM GateTicket g WHERE g.start = ? AND g.end=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, start);
		query.setParameter(0, end);
		return (List<GateTicket>)query.list();
	}

	@Override
	public List<GateTicket> getAll() {
		return getSession().createQuery("from GateTicket g").list();
	}

}
