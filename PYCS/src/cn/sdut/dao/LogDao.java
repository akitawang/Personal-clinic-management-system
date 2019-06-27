package cn.sdut.dao;

import java.util.List;

import cn.sdut.Pclass.*;

public interface LogDao {
	
	public boolean add_case_add(cases Cases);
	public boolean add_case_del(String name,String date);
	public boolean add_case_rec(String name,String date);
	public boolean add_patient_add(String name,String date);
	public boolean add_patient_del(String name,String date);
	public boolean add_patient_rec(String name,String date);
	public boolean add_drug_add(String name,String date);
	public boolean add_drug_del(String name,String date);
	public boolean add_drug_rec(String name,String date);
	public boolean add_drug_sell(String name,String date);
	public List<logs> getOneLog();
	public boolean del_log(int log_num);
}
