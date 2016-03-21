package com.lua.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.lua.model.DoctorBaseInfo;
import com.lua.service.DoctorService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��1��21�� ����2:02:25
 * ��˵��
 */
public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private DoctorBaseInfo doctorBaseInfo;
	public DoctorBaseInfo getDoctorBaseInfo() {
		return doctorBaseInfo;
	}

	public void setDoctorBaseInfo(DoctorBaseInfo doctorBaseInfo) {
		this.doctorBaseInfo = doctorBaseInfo;
	}

	private static final long serialVersionUID = 1L;
	
	public String execute(){
		return "login";
	}
	
	public String login()throws Exception{
		DoctorService doctorService = new DoctorService();
		doctorBaseInfo = doctorService.login(doctorBaseInfo.getDoctorInfo_ID(),doctorBaseInfo.getDoctorInfo_pwd());
		if(doctorBaseInfo.getID()==0){
			return "loginfailed";
		}else{
			HttpServletRequest request=ServletActionContext.getRequest();  
			HttpSession session = request.getSession();
			session.setAttribute("doctorBaseInfo", doctorBaseInfo);
			return "loginSuccess";
		}
	}

}
