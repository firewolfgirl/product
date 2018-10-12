package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "t_userinfo")
public class UserInfo {
	private Integer id;
	private String account;
	private String head;
	private String sex;
	private String address;
	private Integer credits;
	
	public UserInfo() {
		super();
	}
	public UserInfo(String account,String head,String sex,String address,Integer credits) {
		super();
		this.account=account;
		this.head=head;
		this.sex=sex;
		this.address=address;
		this.credits=credits;
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
	@Column(name = "account", length = 50, nullable = true)
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Column(name = "head", length = 500, nullable = true)
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	@Column(name = "sex", length = 4, nullable = true)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Column(name = "address", length = 50, nullable = true)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "credits", length = 11, nullable = true)
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ",account=" + account + ", head=" + head + ", sex=" + sex + ", address=" + address + ", credits="
				+ credits + "]";
	}
	
	
	

}
