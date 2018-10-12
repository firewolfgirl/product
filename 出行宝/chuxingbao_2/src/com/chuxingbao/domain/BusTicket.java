package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_busticket")
public class BusTicket {
	private Integer id;
	private String start;
	private String end;
	private String date;
	private String bus_number;
	private Integer money;

	public BusTicket() {
		super();
	}
	public BusTicket(String start,String end,String date,String bus_number,int money) {
		super();
		this.start=start;
		this.end=end;
		this.date=date;
		this.bus_number=bus_number;
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
	@Column(name = "date",nullable = true)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Column(name = "bus_number", length = 50, nullable = true)
	public String getBus_number() {
		return bus_number;
	}
	public void setBus_number(String bus_number) {
		this.bus_number = bus_number;
	}
	@Column(name = "money", length = 8, nullable = true)
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "BusTicket [id=" + id + ", start=" + start + ", end=" + end + ", date=" + date + ", bus_number="
				+ bus_number + ", money=" + money + "]";
	}
	
}
