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
import com.chuxingbao.service.StrategyService;
import com.chuxingbao.service.UserService;


@Controller
public class StrategyController {
	@Autowired
	private StrategyService strategyService ;
	
	
	/*@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}*/
	
	@RequestMapping(value="/strategy.do")
	public ModelAndView strategy(HttpServletRequest request ,HttpServletResponse response /*,int id*/)throws IOException{
		ModelAndView mav = new ModelAndView("strategy");
		/*request.getSession().setAttribute("id", id);*/
		return mav;

	}
	
	/*@RequestMapping(value="/strategyDetails.do")
	public ModelAndView strategyDetails(HttpServletRequest request)throws IOException{
		ModelAndView mav = new ModelAndView("strategyDetails");
		int id = ((StrategyDetails)request.getSession().getAttribute("strategyDetails")).getId();
		StrategyDetails strategyDetails = strategyService.findById(id);
		request.getSession().setAttribute("strategyDetails", strategyDetails);
		return mav;

	}*/
	
	

	
	


}
