package com.mb.bean;

import java.util.List;

/**
 * 分页工具类
 * @author 王烨雯
 *
 */
public class PageInfo {

	private List msgList;
	
	private Integer pageSize;
	private Integer pageNumb;
	private Integer rowCount;
	private Integer pageCount;
	private Integer prevPageNumb;
	private Integer nextPageNumb;
	
	public PageInfo(List msgList, Integer rowCount, Integer pageNumb, Integer pageSize) {
		this.msgList = msgList;
		this.rowCount = rowCount;
		this.pageSize = pageSize;
		
		this.pageCount = this.rowCount / this.pageSize;
		if (this.rowCount % this.pageSize != 0) {
			this.pageCount ++;
		}
		
		this.pageNumb = pageNumb;
		if (this.pageNumb < 1) {
			this.pageNumb = 1;
		}
		if (this.pageNumb > this.pageCount) {
			this.pageNumb = this.pageCount;
		}
		this.prevPageNumb = this.pageNumb - 1;
		if (this.prevPageNumb < 1) {
			this.prevPageNumb = 1;
		}
		this.nextPageNumb = this.pageNumb + 1;
		if (this.nextPageNumb > this.pageCount) {
			this.nextPageNumb = this.pageCount;
		}
	}

	public List getMsgList() {
		return msgList;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getPageNumb() {
		return pageNumb;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public Integer getPrevPageNumb() {
		return prevPageNumb;
	}

	public Integer getNextPageNumb() {
		return nextPageNumb;
	}
	
}
