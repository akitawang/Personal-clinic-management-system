package cn.sdut.Pclass;

import java.sql.Date;

public class cases {
	
	private int Case_num;          //处方编号
	private String Case_name;      //客户姓名
	private String Case_sex;       //客户性别
	private String Case_birth;     //客户出生日期
	private String Case_phone;     //客户电话号码
	private String Case_weight;    //客户体重
	private String Case_address;   //客户家庭住址
	private String Case_allergy;   //客户过敏史
	private String Case_height;    //客户身高
	private String Case_type;      //客户血型
	private String Case_symptom;   //客户症状
	private String Case_info;      //诊断信息
	private String Case_advice;    //医嘱
	private String Case_item;      //检查项目
	private String Case_pre;       //处方
	
	public cases(int case_num, String case_name, String case_sex, String case_birth, String case_phone,
			String case_weight, String case_address, String case_allergy, String case_height, String case_type,
			String case_symptom, String case_info, String case_advice, String case_item, String case_pre) {
		super();
		Case_num = case_num;
		Case_name = case_name;
		Case_sex = case_sex;
		Case_birth = case_birth;
		Case_phone = case_phone;
		Case_weight = case_weight;
		Case_address = case_address;
		Case_allergy = case_allergy;
		Case_height = case_height;
		Case_type = case_type;
		Case_symptom = case_symptom;
		Case_info = case_info;
		Case_advice = case_advice;
		Case_item = case_item;
		Case_pre = case_pre;
	}
	public cases() {
		super();
	}
	public int getCase_num() {
		return Case_num;
	}
	public void setCase_num(int case_num) {
		Case_num = case_num;
	}
	public String getCase_name() {
		return Case_name;
	}
	public void setCase_name(String case_name) {
		Case_name = case_name;
	}
	public String getCase_sex() {
		return Case_sex;
	}
	public void setCase_sex(String case_sex) {
		Case_sex = case_sex;
	}
	public String getCase_birth() {
		return Case_birth;
	}
	public void setCase_birth(String case_birth) {
		Case_birth = case_birth;
	}
	public String getCase_phone() {
		return Case_phone;
	}
	public void setCase_phone(String case_phone) {
		Case_phone = case_phone;
	}
	public String getCase_weight() {
		return Case_weight;
	}
	public void setCase_weight(String case_weight) {
		Case_weight = case_weight;
	}
	public String getCase_address() {
		return Case_address;
	}
	public void setCase_address(String case_address) {
		Case_address = case_address;
	}
	public String getCase_allergy() {
		return Case_allergy;
	}
	public void setCase_allergy(String case_allergy) {
		Case_allergy = case_allergy;
	}
	public String getCase_height() {
		return Case_height;
	}
	public void setCase_height(String case_height) {
		Case_height = case_height;
	}
	public String getCase_type() {
		return Case_type;
	}
	public void setCase_type(String case_type) {
		Case_type = case_type;
	}
	public String getCase_symptom() {
		return Case_symptom;
	}
	public void setCase_symptom(String case_symptom) {
		Case_symptom = case_symptom;
	}
	public String getCase_info() {
		return Case_info;
	}
	public void setCase_info(String case_info) {
		Case_info = case_info;
	}
	public String getCase_advice() {
		return Case_advice;
	}
	public void setCase_advice(String case_advice) {
		Case_advice = case_advice;
	}
	public String getCase_item() {
		return Case_item;
	}
	public void setCase_item(String case_item) {
		Case_item = case_item;
	}
	public String getCase_pre() {
		return Case_pre;
	}
	public void setCase_pre(String case_pre) {
		Case_pre = case_pre;
	}

}
