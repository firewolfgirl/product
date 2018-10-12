package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_hotel")
public class Hotel {
	private Integer id;
	private String img;
	private String hotel_name;
	private String district;
	private String city;
	private Integer money;
	public Hotel() {
		super();
	}
	public Hotel(String img,String hotel_name,String district,String city,int money) {
		super();
		this.img=img;
		this.hotel_name=hotel_name;
		this.district=district;
		this.city=city;
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
	@Column(name = "hotel_name", length = 50, nullable = true)
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	@Column(name = "district", length = 50, nullable = true)
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Column(name = "city", length = 50, nullable = true)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
		return "Hotel [id=" + id + ", img=" + img + ", hotel_name=" + hotel_name + ", district=" + district + ", city="
				+ city + ", money=" + money + "]";
	}
	

}
