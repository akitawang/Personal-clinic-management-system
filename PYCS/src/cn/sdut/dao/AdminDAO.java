package cn.sdut.dao;

import java.util.List;


import cn.sdut.Pclass.*;

public interface AdminDAO {
	
	public boolean update(admin admin);
	public List<admin> getAlladmin();
	
}
