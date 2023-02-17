package com.sp.dao;

import java.sql.Date;

public class LyTable implements java.io.Serializable {
    // Ù–‘
    private Integer id;
    private Integer userId;
    private Date date;
    private String title;
    private String content;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public Integer getUserId() {
        return userId;
    }
 
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
 
    public Date getDate() {
        return date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getContent() {
        return content;
    }
 
    public void setContent(String content) {
        this.content = content;
    }
}
