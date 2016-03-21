package com.lua.dao;

import java.sql.ResultSet;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��9�� ����2:42:14
 * ��˵��
 */
public interface EvaluationDAO {

	public int getEvaluationByID(String sqlString,String hospital_ID) throws Exception;

	public ResultSet showEvaluationByID(String sqlString,String hospital_ID, int startRow, int i) throws Exception;

	public int getEvaluationByIDGood(String sqlString,String hospital_ID,int i)throws Exception;

	public ResultSet showEvaluationByIDGood(String sqlString,String hospital_ID, int startRow,
			int i, int j) throws Exception;

	public int deleteEvaluation(String doctorInfo_ID) throws Exception;

}
