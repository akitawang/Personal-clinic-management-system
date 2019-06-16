package cn.sdut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.*;
import cn.sdut.dao.DrugDAO;

public class DrugDAOImpl implements DrugDAO {




	public boolean add(drug Drug) {
		// TODO Auto-generated method stub
		String sql = "insert into drug(Drug_id,Drug_name,Drug_class,Drug_number,Drug_factory,Drug_type,Drug_instruction,Drug_function,Drug_stock,Drug_price,Drug_date,Drug_expdate)values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		//System.out.println(sql);
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			stmt.setInt(1, Drug.getDrug_id());
			stmt.setString(2, Drug.getDrug_name());
			stmt.setString(3, Drug.getDrug_class());
			stmt.setString(4, Drug.getDrug_number());
			stmt.setString(5, Drug.getDrug_factory());
			stmt.setString(6, Drug.getDrug_type());
			stmt.setString(7, Drug.getDrug_instruction());
			stmt.setString(8, Drug.getDrug_function());
			stmt.setInt(9, Drug.getDrug_stock());
			stmt.setDouble(10, Drug.getDrug_price());
			stmt.setString(11, Drug.getDrug_date());
			stmt.setString(12, Drug.getDrug_expdate());
		;
			
			int rows  = stmt.executeUpdate();

		    if(rows>0)
		    	return true;

		}
		catch(Exception e)
		{
			throw new RuntimeException(e);	
		}
		finally
		{
			JdbcUtil.release(rs, stmt, conn);
		}

		return false;
		
	}

public List<drug> getAlldrug() {
		
		

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		

		String sql = "select Drug_id,Drug_name,Drug_class,Drug_number,Drug_factory,Drug_type,Drug_instruction,Drug_function,Drug_stock,Drug_price,Drug_date,Drug_expdate from drug  ";
		
		//System.out.println(sql);
		
		try
		{
			 List<drug> list= new ArrayList<drug>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();

			//5���������
			while(rs.next()){
				drug user = new drug();
				
				user.setDrug_class(rs.getString("Drug_class"));
				user.setDrug_date(rs.getString("Drug_date"));
				user.setDrug_expdate(rs.getString("Drug_expdate"));
				user.setDrug_factory(rs.getString("Drug_factory"));
				user.setDrug_function(rs.getString("Drug_function"));
				user.setDrug_id(rs.getInt("Dugr_id"));
				user.setDrug_instruction(rs.getString("Drug_instruction"));
				user.setDrug_name(rs.getString("Drug_name"));
				user.setDrug_number(rs.getString("Drug_number"));
				user.setDrug_price(rs.getDouble("Drug_price"));
				user.setDrug_stock(rs.getInt("Drug_stock"));
				user.setDrug_type(rs.getString("Drug_type"));
			
				
			
				
		
				list.add(user);
				//return user;
				//(rs.getString("birthday"));
				
			}
			return list;
		
		
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
			
		}
		finally
		{
			JdbcUtil.release(rs, stmt, conn);
			
		}
		
		
		
		
		// TODO Auto-generated method stub
		//return null;
	}

public boolean delete(int Drug_id) {
	// TODO Auto-generated method stub
	
			Connection conn=null;
			PreparedStatement stmt=null;
			ResultSet rs =null;
			

			String sql = "delete from drug where Drug_id=? ";
			
			//System.out.println(sql);
			
			try
			{
				 List<drug> list= new ArrayList<drug>();
				conn = JdbcUtil.getConnection();
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1,Drug_id);
				
				int rows  = stmt.executeUpdate();
				
				if(rows>0)
				
				return true;
				else
					return false;
			
			
				
			}
			catch(Exception e)
			{
				throw new RuntimeException(e);
				
			}
			finally
			{
				JdbcUtil.release(rs, stmt, conn);
				
			}
}

public boolean update(drug Drug) {
	
	String sql = "update drug  set Drug_name=?,Drug_class=?,Drug_number=?,Drug_factory=?,Drug_type=?,Drug_instruction=?,Drug_function=?,Drug_stock=?,Drug_price=?,Drug_date=?,Drug_expdate=? where Drug_id=? ";
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	
	//System.out.println(sql);
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
		
		stmt.setString(1, Drug.getDrug_name());
		stmt.setString(2, Drug.getDrug_class());
		stmt.setString(3, Drug.getDrug_number());
		stmt.setString(4, Drug.getDrug_factory());
		stmt.setString(5, Drug.getDrug_type());
		stmt.setString(6, Drug.getDrug_instruction());
		stmt.setString(7, Drug.getDrug_function());
		stmt.setInt(8, Drug.getDrug_stock());
		stmt.setDouble(9, Drug.getDrug_price());
		stmt.setString(10, Drug.getDrug_date());
		stmt.setString(11, Drug.getDrug_expdate());
		stmt.setInt(12, Drug.getDrug_id());

		
		int rows  = stmt.executeUpdate();

	    if(rows>0)
	    	return true;

	}
	catch(Exception e)
	{
		throw new RuntimeException(e);	
	}
	finally
	{
		JdbcUtil.release(rs, stmt, conn);
	}

	return false;
}

	

}
