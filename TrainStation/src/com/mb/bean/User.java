package com.mb.bean;

/**
 * 用户类，用于注册登录
 * @author 王烨雯
 *
 */
public class User {

	private Integer id;
	private String account;
	private String password;
	private String realname;

	public User() {
		super();
	}

	public User(String account, String password, String realname) {
		super();
		this.account = account;
		this.password = password;
		this.realname = realname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
}
