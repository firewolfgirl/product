package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.StrategyDetails;

public interface StrategyDetailsDAO{
	//����һ��,insert one
	public int insertStrategyDetails(StrategyDetails strategyDetails);
		
	//ɾ��һ�� ,delete one
	public void deleteStrategyDetails(StrategyDetails strategyDetails);
		
	//����һ�� ,find one
	public StrategyDetails findStrategyDetails(int id);
		
	//find all
	public List<StrategyDetails> getAll();

	public List<StrategyDetails> findNew();

	public List<StrategyDetails> findAll();

}
