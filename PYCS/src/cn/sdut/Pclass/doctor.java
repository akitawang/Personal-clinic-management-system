package cn.sdut.Pclass;

import java.sql.Date;

public class doctor {
	
	private String Doctor_name;         //ҽ������
	private String Doctor_num;             //ҽ����š���¼�˺�
	private String Doctor_password;     //ҽ����¼����
	private String Doctor_dep;          //ҽ������
	private String Doctor_time;           //ҽ����ְʱ��
	private String Doctor_id;           //ҽ�����֤��
	private String Doctor_phone;        //ҽ���绰
	public doctor(String doctor_name, String doctor_num, String doctor_password, String doctor_dep, String doctor_time,
			String doctor_id, String doctor_phone) {
		super();
		Doctor_name = doctor_name;
		Doctor_num = doctor_num;
		Doctor_password = doctor_password;
		Doctor_dep = doctor_dep;
		Doctor_time = doctor_time;
		Doctor_id = doctor_id;
		Doctor_phone = doctor_phone;
	}
	public doctor() {
		super();
	}

	public String getDoctor_name() {
		return Doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		Doctor_name = doctor_name;
	}
	public String getDoctor_num() {
		return Doctor_num;
	}
	public void setDoctor_num(String doctor_num) {
		Doctor_num = doctor_num;
	}
	public String getDoctor_password() {
		return Doctor_password;
	}
	public void setDoctor_password(String doctor_password) {
		Doctor_password = doctor_password;
	}
	public String getDoctor_dep() {
		return Doctor_dep;
	}
	public void setDoctor_dep(String doctor_dep) {
		Doctor_dep = doctor_dep;
	}
	public String getDoctor_time() {
		return Doctor_time;
	}
	public void setDoctor_time(String doctor_time) {
		Doctor_time = doctor_time;
	}
	public String getDoctor_id() {
		return Doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		Doctor_id = doctor_id;
	}
	public String getDoctor_phone() {
		return Doctor_phone;
	}
	public void setDoctor_phone(String doctor_phone) {
		Doctor_phone = doctor_phone;
	}
	
	
}
