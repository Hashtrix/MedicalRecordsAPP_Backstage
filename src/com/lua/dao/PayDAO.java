package com.lua.dao;

import java.sql.ResultSet;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��9�� ����1:29:11
 * ��˵��
 */
public interface PayDAO {

	public int getPayByID(String sqlString,String hospital_ID) throws Exception;

	public ResultSet showPayByID(String sqlString,String hospital_ID, int startRow, int i) throws Exception;

}
