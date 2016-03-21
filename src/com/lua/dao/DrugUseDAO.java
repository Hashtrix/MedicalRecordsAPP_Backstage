package com.lua.dao;

import java.sql.ResultSet;

import com.lua.model.Druguse;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��8�� ����6:21:48
 * ��˵��
 */
public interface DrugUseDAO {

	public int getDrugUseByID(String sqlString,String hospital_ID) throws Exception;

	public ResultSet showDrugUseByID(String sqlString,String hospital_ID, int startRow, int i) throws Exception;

	public ResultSet modifyDrugUseBefore(String druguse_ID) throws Exception;

	public int modifyDrugUseAfter(Druguse druguse) throws Exception;

}
