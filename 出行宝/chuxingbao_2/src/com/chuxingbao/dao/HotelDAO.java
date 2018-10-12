package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.Hotel;

public interface HotelDAO{
	//增加一个,insert one
	public int insertHotel(Hotel hotel);
		
	//删除一个 ,delete one
	public void deleteHotel(Hotel hotel);
		
	//查找一个 ,find one
	public Hotel findHotel(int id);
		
	//find all
	public List<Hotel> getAll();

}
