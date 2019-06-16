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
		String sql = "insert into patient(Patient_name,Patient_sex,Patient_birth,Patient_weight,Patient_id,Patient_phone,Patient_address,Patient_history,Patient_pers,Patient_fam,Patient_list)values(?,?,?,?,?,?,?,?,?,?,?)";
		
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
			stmt.setString(1, Patient.getPatient_history());
			stmt.setString(2, Patient.getPatient_pers());
			stmt.setString(3, Patient.getPatient_fam());
			stmt.setString(4, Patient.getPatient_list());
			
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
		

		String sql = "select  Patient_name,Patient_sex,Patient_birth,Patient_weight,Patient_id,Patient_phone,Patient_address,Patient_history,Patient_pers,Patient_fam,Patient_list from patient  ";
		
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
			user.setPatient_fam(rs.getString("Patient_fam"));
			user.setPatient_history(rs.getString("atient_history"));
			user.setPatient_id(rs.getString("Patient_id"));
			user.setPatient_list(rs.getString("Patient_list"));
			user.setPatient_name(rs.getString("Patient_name"));
			user.setPatient_pers(rs.getString("Patient_pers"));
			user.setPatient_phone(rs.getString("Patient_phone"));
			user.setPatient_sex(rs.getString("Patient_sex"));
			user.setPatient_weight(rs.getString("Patient_weight"));
				
				
				
		
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
			

			String sql = "delete from patient where Patient_name=? ";
			
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
	
	String sql = "update patient set Patient_sex=?,Patient_birth=?,Patient_weight=?,Patient_id=?,Patient_phone=?,Patient_address=?,Patient_history=?,Patient_pers=?,Patient_fam=?,Patient_list=? where Patient_name=?";
	
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
		stmt.setString(7, Patient.getPatient_history());
		stmt.setString(8, Patient.getPatient_pers());
		stmt.setString(9, Patient.getPatient_fam());
		stmt.setString(10, Patient.getPatient_list());
		stmt.setString(11, Patient.getPatient_name());

		
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
