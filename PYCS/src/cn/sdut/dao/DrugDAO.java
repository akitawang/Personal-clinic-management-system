package cn.sdut.dao;

import java.util.List;


import cn.sdut.Pclass.*;

public interface DrugDAO {
	
	public boolean add(drug drug);
	public boolean delete(int Docter_id);
	public boolean update(int id, String ins, String fun, double price, int stock);
	public List<drug> getAlldrug();
	public boolean drug_addition(drug drug);
	
}
