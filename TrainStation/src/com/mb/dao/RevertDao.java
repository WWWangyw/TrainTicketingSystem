package com.mb.dao;

import java.util.List;

import com.mb.bean.Revert;

public interface RevertDao {

	/**
	 * ����ظ���Ϣ
	 * @param plId
	 * @param liuYan
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Integer saveRevert(String plId, String liuYan, Integer userId) throws Exception;

	/**
	 * ��������id�ڻظ����м����ظ�������������
	 * @param pl_id
	 * @return
	 * @throws Exception
	 */
	List<Revert> getListByCommentId(Integer pl_id) throws Exception;

	/**
	 * ���ݻظ���¼idɾ��ĳ���ظ���¼
	 * @param hfId
	 * @return
	 * @throws Exception
	 */
	Integer delete(String hfId) throws Exception;

	Integer deleteByPlId(String plId) throws Exception;
}
