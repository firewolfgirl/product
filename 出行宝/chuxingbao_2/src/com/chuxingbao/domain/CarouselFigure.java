package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_carousel_figure")
public class CarouselFigure {
	private int id;
	private int rank;
	private String img;
	private String title;
	private String gourl;

	public CarouselFigure() {
		super();
	}
	public CarouselFigure(int id ,int rank,String img,String title,String gourl) {
		super();
		this.id=id;
		this.rank=rank;
		this.img=img;
		this.title=title;
		this.gourl=gourl;
	}
	
	@Id
	@GenericGenerator(name="generator",strategy="increment")//主键自增策略
	@GeneratedValue(generator="generator")
	@Column(name="id",unique=true,nullable=false)//指定对应的列，是否唯一，是否允许为空
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "rank")
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Column(name = "img")
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "gourl")
	public String getGourl() {
		return gourl;
	}
	public void setGourl(String gourl) {
		this.gourl = gourl;
	}
	@Override
	public String toString() {
		return "carousel_figure [id=" + id + ", rank=" + rank + ", img=" + img + ", title=" + title + ", gourl="
				+ gourl + "]";
	}
	
	
	
}
