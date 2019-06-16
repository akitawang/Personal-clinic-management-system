package cn.sdut.dao;

import java.util.List;


import cn.sdut.Pclass.*;

public interface DrugDAO {
	
	public boolean add(drug drug);
	public boolean delete(int Docter_id);
	public boolean update(drug drug);
	public List<drug> getAlldrug();
	
}
