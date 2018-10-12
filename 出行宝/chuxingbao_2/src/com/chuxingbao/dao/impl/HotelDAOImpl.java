package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.HotelDAO;
import com.chuxingbao.domain.Hotel;
@Repository
@Transactional //增删改都要加
public class HotelDAOImpl implements HotelDAO{
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int insertHotel(Hotel hotel) {
		getSession().save(hotel);
		return 1;
	}

	@Override
	public void deleteHotel(Hotel hotel) {
		getSession().delete(hotel);
		
	}

	@Override
	public Hotel findHotel(int id) {
		String hql = "FROM Hotel h WHERE h.id=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		return (Hotel)query.list();
	}

	@Override
	public List<Hotel> getAll() {
		return getSession().createQuery("from Hotel h").list();
	}

}
