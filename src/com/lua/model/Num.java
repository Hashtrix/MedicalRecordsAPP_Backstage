package com.lua.model;
/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��12�� ����8:08:18
 * ��˵��
 */
public class Num {
	private int month;
	private Float number;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Float getNumber() {
		return number;
	}
	public void setNumber(Float number) {
		this.number = number;
	}
	public Num(int month, Float number) {
		super();
		this.month = month;
		this.number = number;
	}
	
	

}
