package com.lua.dao;

import java.sql.ResultSet;

import com.lua.model.Medical;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��2��26�� ����1:27:05
 * ��˵��
 */
public interface MedicalDAO {

	public ResultSet findById(String medical_ID) throws Exception;

	public int modifyMedical(Medical medical) throws Exception;

	public int deleteMedical(String doctorInfo_ID) throws Exception;

}
