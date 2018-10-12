package com.chuxingbao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chuxingbao.dao.CarouselFigureDAO;
import com.chuxingbao.domain.CarouselFigure;
@Repository
@Transactional //增删改都要加
public class CarouselFigureDAOImpl implements CarouselFigureDAO {
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*获取session的方法
	 */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}


	@Override
	public int insertCarousel(CarouselFigure carouselFigure) {
		getSession().save(carouselFigure);
		return 1;
	}

	@Override
	public void deleteCarousel(CarouselFigure carouselFigure) {
		getSession().delete(carouselFigure);
	}

	@Override
	public CarouselFigure findCarouselById(int id) {
		String hql = "FROM CarouselFigure c WHERE c.id=?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		return (CarouselFigure)query.list();
	}

	@Override
	public List<CarouselFigure> getAll() {
		return getSession().createQuery("from CarouselFigure c").list();
	}

}
