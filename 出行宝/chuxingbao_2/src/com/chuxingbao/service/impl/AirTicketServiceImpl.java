package com.chuxingbao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuxingbao.dao.AirTicketDAO;
import com.chuxingbao.dao.StrategyDAO;
import com.chuxingbao.domain.AirTicket;
import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.StrategyDetails;
import com.chuxingbao.service.AirTicketService;

@Service
public class AirTicketServiceImpl implements AirTicketService{

	@Autowired
	private AirTicketDAO airTicketDAO ;
	
	@Override
	public List<AirTicket> findNew() {
		List<AirTicket> list = airTicketDAO.findNew();
		return list;
	}

	@Override
	public List<AirTicket> findAll() {
		List<AirTicket> list = airTicketDAO.findAll();
		return list;
	}

	@Override
	public AirTicket findById(String start,String end) {
		AirTicket airTicket=new  AirTicket();
		airTicket=(AirTicket) airTicketDAO.findAirTicketByStartAndEnd(start, end);
		return airTicket;
	}



}
