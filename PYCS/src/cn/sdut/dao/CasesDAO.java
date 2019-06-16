package cn.sdut.dao;

import java.util.List;


import cn.sdut.Pclass.*;

public interface CasesDAO {
	
	public boolean add(cases cases);
	public boolean delete(int Case_num);
	public boolean update(cases cases);
	public List<cases> getAllcases();
	
}
