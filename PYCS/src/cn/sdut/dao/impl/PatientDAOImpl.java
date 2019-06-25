package cn.sdut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.*;
import cn.sdut.dao.PatientDAO;

public class PatientDAOImpl implements PatientDAO {




	public boolean add(patient Patient) {
		// TODO Auto-generated method stub
		String sql = "insert into patient(Patient_name,Patient_sex,Patient_birth,Patient_weight,Patient_id,Patient_phone,Patient_address,Patient_list,Patient_zt)values(?,?,?,?,?,?,?,?,?)";
		
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		//System.out.println(sql);
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			stmt.setString(1, Patient.getPatient_name());
			stmt.setString(2, Patient.getPatient_sex());
			stmt.setString(3, Patient.getPatient_birth());
			stmt.setString(4, Patient.getPatient_weight());
			stmt.setString(5, Patient.getPatient_id());
			stmt.setString(6, Patient.getPatient_phone());
			stmt.setString(7, Patient.getPatient_address());
		
			stmt.setInt(8, Patient.getPatient_list());
			stmt.setString(9, Patient.getPatient_zt());
			
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

public List<patient> getAllpatient() {
		
		

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		

		String sql = "select  Patient_name,Patient_sex,Patient_birth,Patient_weight,Patient_id,Patient_phone,Patient_address,Patient_list ,Patient_zt from patient  ";
		
		//System.out.println(sql);
		
		try
		{
			 List<patient> list= new ArrayList<patient>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();

			//5���������
			while(rs.next()){
				patient user = new patient();
				
			user.setPatient_address(rs.getString("Patient_address"));
			user.setPatient_birth(rs.getString("Patient_birth"));
			user.setPatient_id(rs.getString("Patient_id"));
			user.setPatient_list(rs.getInt("Patient_list"));
			user.setPatient_name(rs.getString("Patient_name"));
			user.setPatient_phone(rs.getString("Patient_phone"));
			user.setPatient_sex(rs.getString("Patient_sex"));
			user.setPatient_weight(rs.getString("Patient_weight"));
			user.setPatient_zt(rs.getString("Patient_zt"));
				
				
				
		
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

public boolean delete(int Patient_name) {
	// TODO Auto-generated method stub
	
			Connection conn=null;
			PreparedStatement stmt=null;
			ResultSet rs =null;
			

			String sql = "delete from patient where Patient_list=? ";
			
			//System.out.println(sql);
			
			try
			{
				 List<patient> list= new ArrayList<patient>();
				conn = JdbcUtil.getConnection();
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1,Patient_name);
				
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

public boolean update(patient Patient) {
	
	String sql = "update patient set Patient_sex=?,Patient_birth=?,Patient_weight=?,Patient_id=?,Patient_phone=?,Patient_address=?,Patient_zt=?,Patient_name=? where Patient_list=?";
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	
	//System.out.println(sql);
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
	
		stmt.setString(1, Patient.getPatient_sex());
		stmt.setString(2, Patient.getPatient_birth());
		stmt.setString(3, Patient.getPatient_weight());
		stmt.setString(4, Patient.getPatient_id());
		stmt.setString(5, Patient.getPatient_phone());
		stmt.setString(6, Patient.getPatient_address());
		stmt.setString(7, Patient.getPatient_zt());
		stmt.setString(8, Patient.getPatient_name());
		stmt.setInt(9, Patient.getPatient_list());


		
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

public boolean update1(String num) {
	
	String sql = "update patient set Patient_zt=? where Patient_id=?";
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	
	//System.out.println(sql);
	try
	{
		String s=new String("NO");	
		
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
	

		stmt.setString(1, s);
		stmt.setString(2, num);
		
		
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



public patient getOneUser(int list) {
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	

	String sql = "select * from patient where patient_list=?  ";
	
	//System.out.println(sql);
	
	try
	{
			
		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1, list);
		//stmt.setString(2, password);
		
		rs  = stmt.executeQuery();

		//5、遍历结果
		if(rs.next()){
			patient user = new patient();
			
			
			
			user.setPatient_address(rs.getString("Patient_address"));
			user.setPatient_birth(rs.getString("Patient_birth"));
			user.setPatient_id(rs.getString("Patient_id"));
			user.setPatient_list(rs.getInt("Patient_list"));
			user.setPatient_name(rs.getString("Patient_name"));
			user.setPatient_phone(rs.getString("Patient_phone"));
			user.setPatient_sex(rs.getString("Patient_sex"));
			user.setPatient_weight(rs.getString("Patient_weight"));
			user.setPatient_zt(rs.getString("Patient_zt"));
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
