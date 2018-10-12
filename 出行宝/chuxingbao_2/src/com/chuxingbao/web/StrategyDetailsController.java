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
import com.chuxingbao.service.StrategyDetailsService;
import com.chuxingbao.service.StrategyService;
import com.chuxingbao.service.UserService;


@Controller
public class StrategyDetailsController {
	@Autowired
	private StrategyDetailsService strategyDetailsService ;
	@Autowired
	private StrategyService strategyService ;
	
	
	/*@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}*/
	
	@RequestMapping(value="/strategyDetails.do")
	public ModelAndView strategyDetails(HttpServletRequest request ,HttpServletResponse response )throws IOException{
		ModelAndView mav = new ModelAndView("strategyDetails");
		/*int id = ((Strategy)request.getSession().getAttribute("strategy")).getId();
		StrategyDetails strategyDetails = strategyService.findById(id);
		request.getSession().setAttribute("strategyDetails", strategyDetails);*/
		return mav;

	}
	
	

	
	


}
