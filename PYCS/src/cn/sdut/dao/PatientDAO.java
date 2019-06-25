package cn.sdut.dao;

import java.util.List;


import cn.sdut.Pclass.*;

public interface PatientDAO {
	
	public boolean add(patient patient);
	public boolean delete(int patient_name);
	public boolean update(patient patient);
	public List<patient> getAllpatient();
	public patient getOneUser(int list);
}
