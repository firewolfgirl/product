package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.GateTicket;

public interface GateTicketDAO{
	//增加一条票信息
	public int insertGateTicket(GateTicket gateTicket);
		
	//删除一条票信息
	public void deleteGateTicket(GateTicket gateTicket);
		
	//查找一条票信息,   according to the start and the end,
	public List<GateTicket> findGateTicketByStartAndEnd(String start,String end);
		
	//查所有
	public List<GateTicket> getAll();

}
