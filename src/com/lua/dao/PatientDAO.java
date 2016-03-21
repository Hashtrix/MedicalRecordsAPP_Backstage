package com.lua.dao;

import java.sql.ResultSet;

import com.lua.model.PatientBaseInfo;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��2��24�� ����1:12:26
 * ��˵��
 */
public interface PatientDAO {

	public ResultSet show(String sqlString,String doctorInfo_ID,int startRow,int i) throws Exception;

	public int getListNum(String sqlString,String doctorInfo_ID)throws Exception;

	public int getAllListNum(String sqlString,String hospital_ID)throws Exception;

	public ResultSet showAll(String sqlString,String hospital_ID, int startRow, int i)throws Exception;

	public ResultSet findPatientByID(String patient_ID) throws Exception;

}
