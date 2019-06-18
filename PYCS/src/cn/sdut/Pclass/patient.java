package cn.sdut.Pclass;

import java.sql.*;

public class patient {
	
	private String Patient_name;     //�ͻ�����
	private String Patient_sex;      //�ͻ��Ա�
	private String Patient_birth;    //�ͻ���������
	private String Patient_weight;   //�ͻ�����
	private String Patient_id;       //�ͻ����֤��
	private String Patient_phone;    //�ͻ��绰����
	private String Patient_address;  //�ͻ���ͥסַ
	private String Patient_list;     //�ͻ��Ŷ����
	public patient(String patient_name, String patient_sex, String patient_birth, String patient_weight,
			String patient_id, String patient_phone, String patient_address, String patient_list) {
		super();
		Patient_name = patient_name;
		Patient_sex = patient_sex;
		Patient_birth = patient_birth;
		Patient_weight = patient_weight;
		Patient_id = patient_id;
		Patient_phone = patient_phone;
		Patient_address = patient_address;
		
		Patient_list = patient_list;
	}
	public patient() {
		super();
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
	
	
	public String getPatient_list() {
		return Patient_list;
	}
	public void setPatient_list(String patient_list) {
		Patient_list = patient_list;
	}
}
