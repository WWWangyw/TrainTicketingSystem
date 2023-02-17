package com.mb.dao;

import java.sql.SQLException;
import java.util.List;

import com.mb.bean.Comment;
import com.mb.bean.PageInfo;

public interface CommentDao {

	/**
	 * 读取评论记录，进行分页处理
	 * @param pageNumb
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	List<Comment> page(Integer pageNumb, Integer pagesize) throws Exception;

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
	Integer delete(String pl_id) throws Exception;

	/**
	 * 增加评论
	 * @param userId
	 * @param content
	 * @return
	 * @throws Exception
	 */
	Integer saveComment(Integer userId, String content) throws SQLException, Exception;

	/**
	 * 获取评论表中所有的记录数
	 * @return
	 * @throws Exception
	 */
	Integer getCount() throws Exception;
	
}
