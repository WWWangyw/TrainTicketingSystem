package com.mb.bean;

import java.util.Date;

/**
 * 回复类，回复某条评论
 * @author 王烨雯
 *
 */
public class Revert {

	private Integer id;
	private Integer pl_id;
	private Integer user_id;
	private String hf_content;
	private Date hf_time;
	private String hf_realname;
	private String str_hf_time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPl_id() {
		return pl_id;
	}
	public void setPl_id(Integer pl_id) {
		this.pl_id = pl_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getHf_content() {
		return hf_content;
	}
	public void setHf_content(String hf_content) {
		this.hf_content = hf_content;
	}
	public Date getHf_time() {
		return hf_time;
	}
	public void setHf_time(Date hf_time) {
		this.hf_time = hf_time;
	}
	public String getStr_hf_time() {
		return str_hf_time;
	}
	public void setStr_hf_time(String str_hf_time) {
		this.str_hf_time = str_hf_time;
	}
	public String getHf_realname() {
		return hf_realname;
	}
	public void setHf_realname(String hf_realname) {
		this.hf_realname = hf_realname;
	}
}
