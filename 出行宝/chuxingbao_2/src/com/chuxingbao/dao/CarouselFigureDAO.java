package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.CarouselFigure;

public interface CarouselFigureDAO {
	//增加一个,insert one
	public int insertCarousel(CarouselFigure carouselFigure);
	
	//删除一个 ,delete one
	public void deleteCarousel(CarouselFigure carouselFigure);
	
	//查找一个 ,find one
	public CarouselFigure findCarouselById(int id);
	
	//find all
	public List<CarouselFigure> getAll();
}
