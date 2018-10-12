package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.TrainTicketDAO;
import com.chuxingbao.domain.TrainTicket;

@Repository
@Transactional //增删改都要加
public class TrainTicketDAOImpl implements TrainTicketDAO{

	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertTrainTicket(TrainTicket trainTicket) {
		getSession().save(trainTicket);
		return 1;
	}

	@Override
	public void deleteTrainTicket(TrainTicket trainTicket) {
		getSession().delete(trainTicket);
		
	}

	@Override
	public List<TrainTicket> findTrainTicketByStartAndEnd(String start, String end) {
		String hql = "FROM TrainTicket t WHERE t.start = ? AND t.end=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, start);
		query.setParameter(0, end);
		return (List<TrainTicket>)query.list();
	}

	@Override
	public List<TrainTicket> getAll() {
		return getSession().createQuery("from TrainTicket t").list();
	}

}
