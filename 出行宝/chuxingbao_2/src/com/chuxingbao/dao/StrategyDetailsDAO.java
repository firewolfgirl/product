package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.StrategyDetails;

public interface StrategyDetailsDAO{
	//增加一个,insert one
	public int insertStrategyDetails(StrategyDetails strategyDetails);
		
	//删除一个 ,delete one
	public void deleteStrategyDetails(StrategyDetails strategyDetails);
		
	//查找一个 ,find one
	public StrategyDetails findStrategyDetails(int id);
		
	//find all
	public List<StrategyDetails> getAll();

	public List<StrategyDetails> findNew();

	public List<StrategyDetails> findAll();

}
