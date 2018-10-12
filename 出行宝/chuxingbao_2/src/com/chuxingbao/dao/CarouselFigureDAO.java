package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.CarouselFigure;

public interface CarouselFigureDAO {
	//����һ��,insert one
	public int insertCarousel(CarouselFigure carouselFigure);
	
	//ɾ��һ�� ,delete one
	public void deleteCarousel(CarouselFigure carouselFigure);
	
	//����һ�� ,find one
	public CarouselFigure findCarouselById(int id);
	
	//find all
	public List<CarouselFigure> getAll();
}
