package com.lua.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.lua.model.DoctorBaseInfo;
import com.lua.service.DoctorService;
import com.lua.service.RegistrationfeeService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @LUA www.guoao@foxmail.com:
 * @version ����ʱ�䣺2016��1��21�� ����6:16:00
 * ��˵��
 */
public class DoctorInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private int i;
	private File file;//�ϴ��ļ���file����
	private String fileFileName;//�ϴ��ļ�������
	private String fileContentType;//�ϴ��ļ���MIME����
	private String description;//�ϴ���������Ϣ
	private String uploadDir;//�����ϴ��ļ���Ŀ¼
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUploadDir() {
		return uploadDir;
	}
	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	private static final long serialVersionUID = 1L;
	private DoctorBaseInfo doctorBaseInfo;
	public DoctorBaseInfo getDoctorBaseInfo() {
		return doctorBaseInfo;
	}
	public void setDoctorBaseInfo(DoctorBaseInfo doctorBaseInfo) {
		this.doctorBaseInfo = doctorBaseInfo;
	}
	public String execute() throws Exception{
		RegistrationfeeService service = new RegistrationfeeService();
		HttpServletRequest request=ServletActionContext.getRequest();  
		HttpSession session = request.getSession();
		DoctorBaseInfo doctorBaseInfo2 = (DoctorBaseInfo) session.getAttribute("doctorBaseInfo");
		String hospital_ID = service.findHospitalByID(doctorBaseInfo2.getDoctorInfo_ID());
		DoctorService doctorService = new DoctorService();
		doctorBaseInfo = doctorService.findDoctorByDocID(hospital_ID,doctorBaseInfo2.getDoctorInfo_ID());
		return "doctorInfoShow";
	}
	public String modifyDoctorInfo() throws Exception{
		RegistrationfeeService service = new RegistrationfeeService();
		HttpServletRequest request=ServletActionContext.getRequest();  
		HttpSession session = request.getSession();
		DoctorBaseInfo doctorBaseInfo2 = (DoctorBaseInfo) session.getAttribute("doctorBaseInfo");
		String hospital_ID = service.findHospitalByID(doctorBaseInfo2.getDoctorInfo_ID());
		DoctorService doctorService = new DoctorService();
		String realpath = ServletActionContext.getServletContext().getRealPath("/images");
		if(file!=null){
			File savefile = new File(new File(realpath), fileFileName);
			if(!savefile.getParentFile().exists()) savefile.getParentFile().mkdirs();
			FileUtils.copyFile(file, savefile);
		}
		doctorBaseInfo.setDoctorInfo_photo(realpath+"\\"+fileFileName);
		doctorBaseInfo = doctorService.findDoctorByDocID(hospital_ID,doctorBaseInfo2.getDoctorInfo_ID());
		return "modifyDoctorInfo";
	}
	public String updateDoctorInfo() throws Exception {
		DoctorService doctorService = new DoctorService();
		String realpath = ServletActionContext.getServletContext().getRealPath("/images");
		if(file!=null){
			File savefile = new File(new File(realpath), fileFileName);
			if(!savefile.getParentFile().exists()) savefile.getParentFile().mkdirs();
			FileUtils.copyFile(file, savefile);
		}
		doctorBaseInfo.setDoctorInfo_photo(realpath+"\\"+fileFileName);
		int i = doctorService.update(doctorBaseInfo);
		if(i == 1){
			HttpServletRequest request=ServletActionContext.getRequest();  
			HttpSession session = request.getSession();
			session.setAttribute("doctorBaseInfo", doctorBaseInfo);
			return "updateDoctorInfo";
		}else{
			return "failed";
		}
	}

}
