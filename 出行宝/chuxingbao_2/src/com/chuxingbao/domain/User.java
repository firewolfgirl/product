package com.chuxingbao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_user")
public class User {
	private Integer id;
	private String account;
	private String password;

	public User() {
		super();
	}

	public User(String account, String password) {
		super();
		this.account = account;
		this.password = password;
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

	@Column(name = "account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + "]";
	}

}
