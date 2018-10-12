package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.TrainTicket;

public interface TrainTicketDAO{
	//����һ��Ʊ��Ϣ
	public int insertTrainTicket(TrainTicket trainTicket);
	
	//ɾ��һ��Ʊ��Ϣ
	public void deleteTrainTicket(TrainTicket trainTicket);
	
	//����һ��Ʊ��Ϣ,   according to the start and the end,
	public List<TrainTicket> findTrainTicketByStartAndEnd(String start,String end);
	
	//������
	public List<TrainTicket> getAll();
	
	

	

}
