package com.lua.model;

import java.sql.Date;

/**
 * @LUA www.guoao@foxmail.com:
 * @version 创建时间：2016年2月24日 下午12:47:53
 * 类说明
 */
public class PatientBaseInfo {
	private int ID;
	private String patient_ID;
	private String patient_pwd;
	private String patient_name;
	private int patient_sex;
	private Date patient_birthday;
	private String patient_address;
	private String patient_phone;
	private String patient_ID_card;
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
	public String getPatient_pwd() {
		return patient_pwd;
	}
	public void setPatient_pwd(String patient_pwd) {
		this.patient_pwd = patient_pwd;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getPatient_sex() {
		return patient_sex;
	}
	public void setPatient_sex(int patient_sex) {
		this.patient_sex = patient_sex;
	}
	public Date getPatient_birthday() {
		return patient_birthday;
	}
	public void setPatient_birthday(Date patient_birthday) {
		this.patient_birthday = patient_birthday;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getPatient_phone() {
		return patient_phone;
	}
	public void setPatient_phone(String patient_phone) {
		this.patient_phone = patient_phone;
	}
	public String getPatient_ID_card() {
		return patient_ID_card;
	}
	public void setPatient_ID_card(String patient_ID_card) {
		this.patient_ID_card = patient_ID_card;
	}
}
