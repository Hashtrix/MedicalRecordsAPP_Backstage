package com.lua.model;
/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��3��13�� ����12:50:13
 * ��˵��
 */
public class DocCount {
	private String docname;
	private int num;
	
	public DocCount(String docname, int num) {
		super();
		this.docname = docname;
		this.num = num;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String docname) {
		this.docname = docname;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
