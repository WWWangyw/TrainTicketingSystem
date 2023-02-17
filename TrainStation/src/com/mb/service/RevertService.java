package com.mb.service;

import java.util.List;

import com.mb.bean.Revert;

public interface RevertService {

	/**
	 * ����ظ���Ϣ
	 * @param plId
	 * @param liuYan
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	boolean saveRevert(String plId, String liuYan, Integer userId) throws Exception;
	
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
	boolean delete(String hfId) throws Exception;
	
	boolean deleteByPlId(String plId) throws Exception;
}
