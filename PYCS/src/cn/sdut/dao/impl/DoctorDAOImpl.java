package cn.sdut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.*;
import cn.sdut.dao.DoctorDAO;

public class DoctorDAOImpl implements DoctorDAO {




	public boolean add(doctor doctor) {
		// TODO Auto-generated method stub
		String sql = "insert into doctor(Doctor_name,Doctor_num,Doctor_password,Doctor_dep,Doctor_time,Doctor_id,Doctor_phone)values(?,?,?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		//System.out.println(sql);
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			stmt.setString(1, doctor.getDoctor_name());
			stmt.setString(2, doctor.getDoctor_num());
			stmt.setString(3, doctor.getDoctor_password());
			stmt.setString(4, doctor.getDoctor_dep());
			stmt.setString(5, doctor.getDoctor_time());
			stmt.setString(6, doctor.getDoctor_id());
			stmt.setString(7, doctor.getDoctor_phone());
			
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

public List<doctor> getAlldoctor() {
		
		

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		

		String sql = "select  Doctor_name,Doctor_num,Doctor_password,Doctor_dep,Doctor_time,Doctor_id,Doctor_phone from doctor  ";
		
		//System.out.println(sql);
		
		try
		{
			 List<doctor> list= new ArrayList<doctor>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();

	
			while(rs.next()){
				doctor user = new doctor();
				
			
				
				user.setDoctor_name(rs.getString("Doctor_name"));
				user.setDoctor_num(rs.getString("doctor_num"));
				user.setDoctor_dep(rs.getString("Doctor_dep"));
				user.setDoctor_password(rs.getString("Doctor_password"));
				user.setDoctor_id(rs.getString("Doctor_id"));
				user.setDoctor_time(rs.getString("Doctor_time"));
				user.setDoctor_phone(rs.getString("Doctor_phone"));
				
		
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

public boolean delete(String num) {
	// TODO Auto-generated method stub
	
			Connection conn=null;
			PreparedStatement stmt=null;
			ResultSet rs =null;
			

			String sql = "delete from doctor where Doctor_num=? ";
			
			//System.out.println(sql);
			
			try
			{
				 List<doctor> list= new ArrayList<doctor>();
				conn = JdbcUtil.getConnection();
				stmt = conn.prepareStatement(sql);
				stmt.setString(1,num);
				
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

public boolean update(doctor doctor, String username) {
	
	String sql = "update doctor set  Doctor_name=?,Doctor_num=?,Doctor_password=?,Doctor_dep=?,Doctor_time=?,Doctor_id=?,Doctor_phone=? where Doctor_num=?";
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	
	//System.out.println(sql);
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
		stmt.setString(1, doctor.getDoctor_name());
		stmt.setString(2, doctor.getDoctor_num());
		stmt.setString(3, doctor.getDoctor_password());
		stmt.setString(4, doctor.getDoctor_dep());
		stmt.setString(5, doctor.getDoctor_time());
		stmt.setString(6, doctor.getDoctor_id());
		stmt.setString(7, doctor.getDoctor_phone());
	
		stmt.setString(8, username);
		
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

public doctor getOneUser(String username) {
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	

	String sql = "select * from doctor where Doctor_num=?  ";
	
	//System.out.println(sql);
	
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, username);
		//stmt.setString(2, password);
		
		rs  = stmt.executeQuery();

		//5、遍历结果
		if(rs.next()){
			doctor user = new doctor();
			
			
			
			user.setDoctor_name(rs.getString("Doctor_name"));
			user.setDoctor_num(rs.getString("doctor_num"));
			user.setDoctor_dep(rs.getString("Doctor_dep"));
			user.setDoctor_password(rs.getString("Doctor_password"));
			user.setDoctor_id(rs.getString("Doctor_id"));
			user.setDoctor_time(rs.getString("Doctor_time"));
			user.setDoctor_phone(rs.getString("Doctor_phone"));
			return user;
			//(rs.getString("birthday"));
			
		}
		return null;
//		6、释放占用的资源
	
		
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

	

}
