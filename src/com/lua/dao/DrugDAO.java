package com.lua.dao;

import java.sql.ResultSet;

import com.lua.model.Drug;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��8�� ����1:19:12
 * ��˵��
 */
public interface DrugDAO {

	public int getDrugByID(String sqlString,String hospital_ID) throws Exception;

	public ResultSet showDrugByID(String sqlString,String hospital_ID, int startRow, int i) throws Exception;

	public ResultSet modifyDrugBefore(String drug_ID) throws Exception;

	public int modifyDrugAfter(Drug drug) throws Exception;

	public int insertDrugAfter(Drug drug) throws Exception;

	public int insertHos(String drug_ID, String hospital_ID) throws Exception;

}
