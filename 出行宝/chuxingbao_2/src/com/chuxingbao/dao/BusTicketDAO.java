package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.BusTicket;

public interface BusTicketDAO{
	//增加一条票信息
	public int insertBusTicket(BusTicket busTicket);
		
	//删除一条票信息
	public void deleteBusTicket(BusTicket busTicket);
		
	//查找一条票信息,   according to the start and the end,
	public List<BusTicket> findBusTicketByStartAndEnd(String start,String end);
		
	//查所有
	public List<BusTicket> getAll();

}
