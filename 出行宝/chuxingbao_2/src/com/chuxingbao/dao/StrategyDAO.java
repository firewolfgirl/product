package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.Strategy;
import com.zhihu.domain.Post;

public interface StrategyDAO {
	//����һ��,insert one
	public int insertStrategy(Strategy strategy);
		
	//ɾ��һ�� ,delete one
	public void deleteStrategy(Strategy strategy);
		
	//����һ�� ,find one
	public Strategy findStrategy(int id);
		
	//find all
	public List<Strategy> getAll();
	
	public List<Strategy> findNew();

	public List<Strategy> findAll();

}
