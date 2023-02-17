package com.mb.service;

import com.mb.bean.Comment;
import com.mb.bean.PageInfo;

public interface CommentService {
	
	/**
	 * 增加评论
	 * @param userId
	 * @param content
	 * @return
	 * @throws Exception
	 */
	boolean saveComment(Integer userId, String content) throws Exception;

	/**
	 * 读取评论记录，进行分页处理
	 * @param pageNumb
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	PageInfo page(Integer pageNumb, Integer pagesize) throws Exception;

	/**
	 * 根据评论id查询某条评论
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Comment queryById(Integer id) throws Exception;

	/**
	 * 根据id删除某条评论
	 * @param pl_id
	 * @return
	 * @throws Exception
	 */
	boolean delete(String pl_id) throws Exception;
}
