package com.lua.model;

import java.sql.Date;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��2��24�� ����6:36:38
 * ��˵��
 */
public class Communication {

	private int ID;
	private String communication_ID;
	private String communication_sendID;
	private String communication_getID;
	private String communication_msg;
	private Date communication_time;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCommunication_ID() {
		return communication_ID;
	}
	public void setCommunication_ID(String communication_ID) {
		this.communication_ID = communication_ID;
	}
	public String getCommunication_sendID() {
		return communication_sendID;
	}
	public void setCommunication_sendID(String communication_sendID) {
		this.communication_sendID = communication_sendID;
	}
	public String getCommunication_getID() {
		return communication_getID;
	}
	public void setCommunication_getID(String communication_getID) {
		this.communication_getID = communication_getID;
	}
	public String getCommunication_msg() {
		return communication_msg;
	}
	public void setCommunication_msg(String communication_msg) {
		this.communication_msg = communication_msg;
	}
	public Date getCommunication_time() {
		return communication_time;
	}
	public void setCommunication_time(Date communication_time) {
		this.communication_time = communication_time;
	}
}
