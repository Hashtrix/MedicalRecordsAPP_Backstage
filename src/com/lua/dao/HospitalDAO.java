package com.lua.dao;

import java.sql.ResultSet;

import com.lua.model.Hospital;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��5�� ����1:04:44
 * ��˵��
 */
public interface HospitalDAO {

	ResultSet hospitalbaseinfoShow(String baseinfo_ID) throws Exception;

	ResultSet findHospitalByID(String hospital_ID) throws Exception;

	int modifyHospitalAfter(Hospital hospital) throws Exception;

}
