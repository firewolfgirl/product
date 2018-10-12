package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.TrainTicket;

public interface TrainTicketDAO{
	//增加一条票信息
	public int insertTrainTicket(TrainTicket trainTicket);
	
	//删除一条票信息
	public void deleteTrainTicket(TrainTicket trainTicket);
	
	//查找一条票信息,   according to the start and the end,
	public List<TrainTicket> findTrainTicketByStartAndEnd(String start,String end);
	
	//查所有
	public List<TrainTicket> getAll();
	
	

	

}
