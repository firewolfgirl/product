package com.chuxingbao.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.StrategyDetails;
import com.chuxingbao.domain.User;
import com.chuxingbao.domain.UserInfo;
import com.chuxingbao.service.AirTicketService;
import com.chuxingbao.service.StrategyService;
import com.chuxingbao.service.UserService;


@Controller
public class AirTicketController {
	@Autowired
	private AirTicketService airTicketService ;
	

	@RequestMapping(value="/airTicket.do")
	public ModelAndView airTicket(HttpServletRequest request )throws IOException{
		ModelAndView mav = new ModelAndView("airTicket");
		return mav;

	}
	
	
}
