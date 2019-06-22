package cn.sdut.dao;

import java.util.List;


import cn.sdut.Pclass.*;

public interface DoctorDAO {
	
	public boolean add(doctor doctor);
	public boolean delete(String Docter_num);
	public boolean update(doctor doctor, String num);
	public List<doctor> getAlldoctor();
	
}
