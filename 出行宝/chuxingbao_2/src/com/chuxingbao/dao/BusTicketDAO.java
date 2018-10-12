package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.BusTicket;

public interface BusTicketDAO{
	//����һ��Ʊ��Ϣ
	public int insertBusTicket(BusTicket busTicket);
		
	//ɾ��һ��Ʊ��Ϣ
	public void deleteBusTicket(BusTicket busTicket);
		
	//����һ��Ʊ��Ϣ,   according to the start and the end,
	public List<BusTicket> findBusTicketByStartAndEnd(String start,String end);
		
	//������
	public List<BusTicket> getAll();

}
