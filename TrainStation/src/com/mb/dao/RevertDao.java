package com.mb.dao;

import java.util.List;

import com.mb.bean.Revert;

public interface RevertDao {

	/**
	 * 保存回复信息
	 * @param plId
	 * @param liuYan
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Integer saveRevert(String plId, String liuYan, Integer userId) throws Exception;

	/**
	 * 根据评论id在回复表中检索回复的是那条评论
	 * @param pl_id
	 * @return
	 * @throws Exception
	 */
	List<Revert> getListByCommentId(Integer pl_id) throws Exception;

	/**
	 * 根据回复记录id删除某条回复记录
	 * @param hfId
	 * @return
	 * @throws Exception
	 */
	Integer delete(String hfId) throws Exception;

	Integer deleteByPlId(String plId) throws Exception;
}
