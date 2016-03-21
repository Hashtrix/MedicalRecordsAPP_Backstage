package com.lua.dao;

import java.sql.ResultSet;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��12�� ����9:36:10
 * ��˵��
 */
public interface HighchartDAO {

	public ResultSet showRegistered(String hospital_ID) throws Exception;

	public ResultSet showRegisteredOther(String hospital_ID) throws Exception;

	public ResultSet showDoctorInfo(String hospital_ID,
			String minordepartment_ID, String idTimeStart, String idTimeEnd) throws Exception;

	public ResultSet showDepartment(String idTimeStart, String idTimeEnd,
			String hospital_ID) throws Exception;

	public ResultSet showHospitalCost(String hospital_ID, String timeYear) throws Exception;

	public ResultSet showHospitalCostBefore(String hospital_ID, float f) throws Exception;

}
