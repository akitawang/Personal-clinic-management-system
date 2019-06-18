package cn.sdut.Pclass;

import java.sql.*;

public class patient {
	
	private String Patient_name;     //客户姓名
	private String Patient_sex;      //客户性别
	private String Patient_birth;    //客户出生日期
	private String Patient_weight;   //客户体重
	private String Patient_id;       //客户身份证号
	private String Patient_phone;    //客户电话号码
	private String Patient_address;  //客户家庭住址
	private String Patient_history;  //客户既往史
	private String Patient_pers;     //客户个人史
	private String Patient_fam;      //客户家族史
	private String Patient_list;     //客户排队序号
	public patient(String patient_name, String patient_sex, String patient_birth, String patient_weight,
			String patient_id, String patient_phone, String patient_address, String patient_history,
			String patient_pers, String patient_fam, String patient_list) {
		super();
		Patient_name = patient_name;
		Patient_sex = patient_sex;
		Patient_birth = patient_birth;
		Patient_weight = patient_weight;
		Patient_id = patient_id;
		Patient_phone = patient_phone;
		Patient_address = patient_address;
		Patient_history = patient_history;
		Patient_pers = patient_pers;
		Patient_fam = patient_fam;
		Patient_list = patient_list;
	}
	public String getPatient_name() {
		return Patient_name;
	}
	public void setPatient_name(String patient_name) {
		Patient_name = patient_name;
	}
	public String getPatient_sex() {
		return Patient_sex;
	}
	public void setPatient_sex(String patient_sex) {
		Patient_sex = patient_sex;
	}
	public String getPatient_birth() {
		return Patient_birth;
	}
	public void setPatient_birth(String patient_birth) {
		Patient_birth = patient_birth;
	}
	public String getPatient_weight() {
		return Patient_weight;
	}
	public void setPatient_weight(String patient_weight) {
		Patient_weight = patient_weight;
	}
	public String getPatient_id() {
		return Patient_id;
	}
	public void setPatient_id(String patient_id) {
		Patient_id = patient_id;
	}
	public String getPatient_phone() {
		return Patient_phone;
	}
	public void setPatient_phone(String patient_phone) {
		Patient_phone = patient_phone;
	}
	public String getPatient_address() {
		return Patient_address;
	}
	public void setPatient_address(String patient_address) {
		Patient_address = patient_address;
	}
	public String getPatient_history() {
		return Patient_history;
	}
	public void setPatient_history(String patient_history) {
		Patient_history = patient_history;
	}
	public String getPatient_pers() {
		return Patient_pers;
	}
	public void setPatient_pers(String patient_pers) {
		Patient_pers = patient_pers;
	}
	public String getPatient_fam() {
		return Patient_fam;
	}
	public void setPatient_fam(String patient_fam) {
		Patient_fam = patient_fam;
	}
	public String getPatient_list() {
		return Patient_list;
	}
	public void setPatient_list(String patient_list) {
		Patient_list = patient_list;
	}
}
