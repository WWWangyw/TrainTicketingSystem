package com.mb.bean;

import java.util.Date;
import java.util.List;

/**
 * ÆÀÂÛÀà
 * @author ÍõìÇö©
 *
 */
public class Comment {
	
	private Integer id;
	private Integer user_id;
	private String pl_content;
	private Date pl_time;
	
	private String str_time;
	private String pl_realname;
	
	private List<Revert> revertList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getPl_content() {
		return pl_content;
	}
	public void setPl_content(String pl_content) {
		this.pl_content = pl_content;
	}
	public Date getPl_time() {
		return pl_time;
	}
	public void setPl_time(Date pl_time) {
		this.pl_time = pl_time;
	}
	public String getStr_time() {
		return str_time;
	}
	public void setStr_time(String str_time) {
		this.str_time = str_time;
	}
	public String getPl_realname() {
		return pl_realname;
	}
	public void setPl_realname(String pl_realname) {
		this.pl_realname = pl_realname;
	}
	public List<Revert> getRevertList() {
		return revertList;
	}
	public void setRevertList(List<Revert> revertList) {
		this.revertList = revertList;
	}
}
