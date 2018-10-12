package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_airticket")
public class AirTicket {
	private Integer id;
	private String img;
	private String start;
	private String end;
	private String date;
	private String flight_number;
	private Integer money;
	
	public AirTicket() {
		super();
	}
	public AirTicket(String img,String start,String end,String date,String flight_number,Integer money) {
		super();
		this.img=img;
		this.start=start;
		this.end=end;
		this.date=date;
		this.flight_number=flight_number;
		this.money=money;
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
	@Column(name = "start", length = 50, nullable = true)
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	@Column(name = "end", length = 50, nullable = true)
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	@Column(name = "date",  nullable = true)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Column(name = "flight_number", length = 50, nullable = true)
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	@Column(name = "money", length = 11, nullable = true)
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "AirTicket [id=" + id + ", img=" + img + ", start=" + start + ", end=" + end + ", date=" + date
				+ ", flight_number=" + flight_number + ", money=" + money + "]";
	}
	

}
