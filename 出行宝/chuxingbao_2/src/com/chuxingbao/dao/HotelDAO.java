package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.Hotel;

public interface HotelDAO{
	//����һ��,insert one
	public int insertHotel(Hotel hotel);
		
	//ɾ��һ�� ,delete one
	public void deleteHotel(Hotel hotel);
		
	//����һ�� ,find one
	public Hotel findHotel(int id);
		
	//find all
	public List<Hotel> getAll();

}
