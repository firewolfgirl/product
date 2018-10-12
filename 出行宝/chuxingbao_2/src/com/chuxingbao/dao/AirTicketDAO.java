package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.AirTicket;

public interface AirTicketDAO{
	//����һ��Ʊ��Ϣ
	public int insertAirTicket(AirTicket airTicket);
		
	//ɾ��һ��Ʊ��Ϣ
	public void deleteAirTicket(AirTicket airTicket);
		
	//����һ��Ʊ��Ϣ,   according to the start and the end,
	public List<AirTicket> findAirTicketByStartAndEnd(String start,String end);
		
	//������
	public List<AirTicket> getAll();

	public List<AirTicket> findNew();

	public List<AirTicket> findAll();
	
}
