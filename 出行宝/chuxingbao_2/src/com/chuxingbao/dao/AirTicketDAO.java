package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.AirTicket;

public interface AirTicketDAO{
	//增加一条票信息
	public int insertAirTicket(AirTicket airTicket);
		
	//删除一条票信息
	public void deleteAirTicket(AirTicket airTicket);
		
	//查找一条票信息,   according to the start and the end,
	public List<AirTicket> findAirTicketByStartAndEnd(String start,String end);
		
	//查所有
	public List<AirTicket> getAll();

	public List<AirTicket> findNew();

	public List<AirTicket> findAll();
	
}
