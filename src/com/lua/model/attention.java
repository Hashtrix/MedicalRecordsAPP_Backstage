package com.lua.model;

import java.sql.Date;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��2��27�� ����6:00:15
 * ��˵��
 */
public class attention {
	private int ID;
	private String patient_ID;
	private String doctorInfo_ID;
	private Date doctorInfo_time;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPatient_ID() {
		return patient_ID;
	}
	public void setPatient_ID(String patient_ID) {
		this.patient_ID = patient_ID;
	}
	public String getDoctorInfo_ID() {
		return doctorInfo_ID;
	}
	public void setDoctorInfo_ID(String doctorInfo_ID) {
		this.doctorInfo_ID = doctorInfo_ID;
	}
	public Date getDoctorInfo_time() {
		return doctorInfo_time;
	}
	public void setDoctorInfo_time(Date doctorInfo_time) {
		this.doctorInfo_time = doctorInfo_time;
	}
}
