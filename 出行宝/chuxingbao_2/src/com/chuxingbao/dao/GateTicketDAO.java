package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.GateTicket;

public interface GateTicketDAO{
	//����һ��Ʊ��Ϣ
	public int insertGateTicket(GateTicket gateTicket);
		
	//ɾ��һ��Ʊ��Ϣ
	public void deleteGateTicket(GateTicket gateTicket);
		
	//����һ��Ʊ��Ϣ,   according to the start and the end,
	public List<GateTicket> findGateTicketByStartAndEnd(String start,String end);
		
	//������
	public List<GateTicket> getAll();

}
