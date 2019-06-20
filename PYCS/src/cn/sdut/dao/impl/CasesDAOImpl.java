package cn.sdut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.*;
import cn.sdut.dao.CasesDAO;

public class CasesDAOImpl implements CasesDAO {




	public boolean add(cases Cases) {
		// TODO Auto-generated method stub
		String sql = "insert into cases(Case_name,Case_sex,Case_birth,Case_phone,Case_weight,Case_address,Case_allergy,Case_height,Case_type,Case_symptom,Case_info,Case_advice,Case_item,Case_pre,Case_currentdate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		//System.out.println(sql);
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, Cases.getCase_name());
			stmt.setString(2, Cases.getCase_sex());
			stmt.setString(3, Cases.getCase_birth());
			stmt.setString(4, Cases.getCase_phone());
			stmt.setString(5, Cases.getCase_weight());
			stmt.setString(6, Cases.getCase_address());
			stmt.setString(7, Cases.getCase_allergy());
			stmt.setString(8, Cases.getCase_height());
			stmt.setString(9, Cases.getCase_type());
			stmt.setString(10, Cases.getCase_symptom());
			stmt.setString(11, Cases.getCase_info());
			stmt.setString(12, Cases.getCase_advice());
			stmt.setString(13, Cases.getCase_item());
			stmt.setString(14, Cases.getCase_pre());
			stmt.setString(15, Cases.getCase_currentdate());
			
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

public List<cases> getAllcases() {
		
		

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		

		String sql = "select * from cases";
		
		//System.out.println(sql);
		
		try
		{
			
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();
			List<cases> list= new ArrayList<cases>();
			//5���������
			while(rs.next()){
				cases user = new cases();
				user.setCase_num(rs.getString("Case_num"));
				user.setCase_name(rs.getString("Case_name"));
				user.setCase_birth(rs.getString("Case_birth"));
				user.setCase_phone(rs.getString("Case_phone"));
				user.setCase_sex(rs.getString("Case_sex"));
				user.setCase_currentdate(rs.getString("Case_currentdate"));
			
		
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



public List<cases> SearchOnecases(String num) throws Exception {
	
	

	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	

	String sql = "select * from cases where Case_num=" + num ;
	
	//System.out.println(sql);
	
	try
	{
		
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		rs  = stmt.executeQuery();
		List<cases> list= new ArrayList<cases>();
		//5���������
		while(rs.next()){
			cases user = new cases();
			user.setCase_num(rs.getString("Case_num"));
			user.setCase_name(rs.getString("Case_name"));
			user.setCase_birth(rs.getString("Case_birth"));
			user.setCase_phone(rs.getString("Case_phone"));
			user.setCase_sex(rs.getString("Case_sex"));
			user.setCase_currentdate(rs.getString("Case_currentdate"));
			user.setCase_address(rs.getString("Case_address"));
			user.setCase_advice(rs.getString("Case_advice"));
			user.setCase_allergy(rs.getString("Case_allergy"));
			user.setCase_height(rs.getString("Case_height"));
			user.setCase_info(rs.getString("Case_info"));
			user.setCase_item(rs.getString("Case_item"));
			user.setCase_pre(rs.getString("Case_pre"));
			user.setCase_symptom(rs.getString("Case_symptom"));
			user.setCase_type(rs.getString("Case_type"));
			user.setCase_weight(rs.getString("Case_weight"));
	
			list.add(user);
			//return user;
			//(rs.getString("birthday"));
			
		}
		return list;
	
	
		
	}
	
	finally
	{
		JdbcUtil.release(rs, stmt, conn);
		
	}
	
	
	
	
	// TODO Auto-generated method stub
	//return null;
}


public boolean delete(String Case_num) {
	// TODO Auto-generated method stub
	
			Connection conn=null;
			PreparedStatement stmt=null;
			ResultSet rs =null;
			

			String sql = "delete from cases where Case_num="+Case_num;
			
			//System.out.println(sql);
			
			try
			{
				
				conn = JdbcUtil.getConnection();
				stmt = conn.prepareStatement(sql);
				
				
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

public boolean update(cases Cases) {
	
	String sql = "update cases set Case_phone=?,Case_weight=?,Case_address=?,Case_allergy=?,Case_height=?,Case_symptom=?,Case_info=?,Case_advice=?,Case_item=?,Case_pre=? where Case_num=?";
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	
	//System.out.println(sql);
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
		
		stmt.setString(1, Cases.getCase_phone());
		stmt.setString(2, Cases.getCase_weight());
		stmt.setString(3, Cases.getCase_address());
		stmt.setString(4, Cases.getCase_allergy());
		stmt.setString(5, Cases.getCase_height());
		stmt.setString(6, Cases.getCase_symptom());
		stmt.setString(7, Cases.getCase_info());
		stmt.setString(8, Cases.getCase_advice());
		stmt.setString(9, Cases.getCase_item());
		stmt.setString(10, Cases.getCase_pre());
		stmt.setString(11, Cases.getCase_num());
		
		

		
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
