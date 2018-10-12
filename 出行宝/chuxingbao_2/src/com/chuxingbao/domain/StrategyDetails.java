package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_strategy_details")
public class StrategyDetails {
	private Integer id;
	private String title;
	private String content;
	
	public StrategyDetails() {
		super();
	}
	
	public StrategyDetails(String title,String content) {
		super();
		this.title=title;
		this.content=content;
	}

	@Id
	@GenericGenerator(name="generator",strategy="increment")//主键自增策略
	@GeneratedValue(generator="generator")
	@Column(name="id",unique=true,nullable=false)//指定对应的列，是否唯一，是否允许为空
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "title", length = 50, nullable = true)
	public String getTitle() {
		return title;
	}

	

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", nullable = true)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "StrategyDetails [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	

}
