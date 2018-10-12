package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_gateticket")
public class GateTicket {
	private Integer id;
	private String img;
	private String attraction_name;
	private String address;
	private String introduction;
	private Integer money;

	public GateTicket() {
		super();
	}
	public GateTicket(String img,String attraction_name,String address,String introduction,int money) {
		super();
		this.img=img;
		this.attraction_name=attraction_name;
		this.address=address;
		this.introduction=introduction;
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
	@Column(name = "attraction_name", length = 50, nullable = true)
	public String getAttraction_name() {
		return attraction_name;
	}
	public void setAttraction_name(String attraction_name) {
		this.attraction_name = attraction_name;
	}
	@Column(name = "address", length = 50, nullable = true)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "introduction", length = 50, nullable = true)
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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
		return "GateTicket [id=" + id + ", img=" + img + ", attraction_name=" + attraction_name + ", address=" + address
				+ ", introduction=" + introduction + ", money=" + money + "]";
	}
	
	
	
}
