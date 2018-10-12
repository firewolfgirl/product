package com.chuxingbao.dao;

import java.util.List;

import com.chuxingbao.domain.Strategy;
import com.zhihu.domain.Post;

public interface StrategyDAO {
	//增加一个,insert one
	public int insertStrategy(Strategy strategy);
		
	//删除一个 ,delete one
	public void deleteStrategy(Strategy strategy);
		
	//查找一个 ,find one
	public Strategy findStrategy(int id);
		
	//find all
	public List<Strategy> getAll();
	
	public List<Strategy> findNew();

	public List<Strategy> findAll();

}
