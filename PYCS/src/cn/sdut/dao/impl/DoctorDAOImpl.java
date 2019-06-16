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
		String sql = "insert into doctor(Docter_name,Docter_num,Docter_password,Docter_dep,Docter_time,Docter_id,Docter_phone)values(?,?,?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		//System.out.println(sql);
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			stmt.setString(1, doctor.getDoctor_name());
			stmt.setInt(2, doctor.getDoctor_num());
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
		

		String sql = "select  Docter_name,Docter_num,Docter_password,Docter_dep,Docter_time,Docter_id,Docter_phone from doctor  ";
		
		//System.out.println(sql);
		
		try
		{
			 List<doctor> list= new ArrayList<doctor>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();

			//5���������
			while(rs.next()){
				doctor user = new doctor();
				
			
				
				user.setDoctor_name(rs.getString("Doctor_name"));
				user.setDoctor_num(rs.getInt("doctor_num"));
				user.setDoctor_dep(rs.getString("Doctor_rep"));
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

public boolean delete(int Doctor_num) {
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
				stmt.setInt(1,Doctor_num);
				
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

public boolean update(doctor doctor) {
	
	String sql = "update doctor set  Docter_name=?,Docter_password=?,Docter_dep=?,Docter_time=?,Docter_id=?,Docter_phone=? where Doctor_num=?";
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	
	//System.out.println(sql);
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
		stmt.setString(1, doctor.getDoctor_name());
		stmt.setString(2, doctor.getDoctor_password());
		stmt.setString(3, doctor.getDoctor_dep());
		stmt.setString(4, doctor.getDoctor_time());
		stmt.setString(5, doctor.getDoctor_id());
		stmt.setString(6, doctor.getDoctor_phone());
		stmt.setInt(7, doctor.getDoctor_num());

		
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
