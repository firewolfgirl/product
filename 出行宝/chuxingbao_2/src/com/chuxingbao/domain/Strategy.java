package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "t_strategy")
public class Strategy {
	private Integer id;
	private String img;
	private String title;
	private String account;
	private String date;
	private String introduction;
	
	public Strategy() {
		super();
	}
	public Strategy(String img,String title,String account,String date,String introduction) {
		super();
		this.img=img;
		this.title=title;
		this.account=account;
		this.date=date;
		this.introduction=introduction;
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
	@Column(name = "img", length = 50, nullable = true)
	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	@Column(name = "title", length = 50, nullable = true)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name = "account", length = 50, nullable = true)
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	@Column(name = "date", nullable = true)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Column(name = "introduction", length = 50, nullable = true)
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	@Override
	public String toString() {
		return "Strategy [id=" + id + ", img=" + img + ", title=" + title + ", account=" + account + ", date=" + date
				+ ", introduction=" + introduction + "]";
	}
	

}
