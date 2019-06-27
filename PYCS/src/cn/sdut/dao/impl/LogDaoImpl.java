package cn.sdut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.admin;
import cn.sdut.Pclass.cases;
import cn.sdut.Pclass.logs;
import cn.sdut.dao.LogDao;

public class LogDaoImpl implements LogDao {

	public boolean add_case_add(cases Cases) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "患者  "+Cases.getCase_name()+"  在"+Cases.getCase_currentdate()+"在本院新建病例处方";
		String type = "病历处方";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	
	
	public boolean add_case_del(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "患者  "+name+"  在"+date+"在本院删除了病例处方";
		String type = "病历处方";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	
	public boolean add_case_rec(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "患者  "+name+"  在"+date+"在本院修改了病例处方";
		String type = "病历处方";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	public boolean add_patient_add(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "患者  "+name+"  在"+date+"在本院进行了挂号";
		String type = "客户";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	public boolean add_patient_del(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "患者  "+name+"  在"+date+" 个人信息被删除";
		String type = "客户";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	public boolean add_patient_rec(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "患者  "+name+"  在"+date+" 个人信息被修改";
		String type = "客户";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	public boolean add_drug_add(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "药品 "+name+"  在"+date+" 被添加进仓库";
		String type = "药品";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	public boolean add_drug_sell(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "药品 "+name+"  在"+date+" 被售出一件";
		String type = "药品";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	public boolean add_drug_del(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "药品 "+name+"  在"+date+" 被从仓库中删除";
		String type = "药品";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
	public boolean add_drug_rec(String name,String date) {
		// TODO Auto-generated method stub
		
		String sql = "insert into log(Log_description,Log_type)values(?,?)";
		String des = "药品 "+name+"  在"+date+" 信息被修改";
		String type = "药品";
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			
			stmt.setString(1, des);
			stmt.setString(2, type);
			
			
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
	
public List<logs> getOneLog() {
		
		

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		

		String sql = "select  * from log";
		
		//System.out.println(sql);
		
		try
		{
			 List<logs> list= new ArrayList<logs>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();


			while(rs.next()){
				logs user = new logs();
				
			user.setLog_id(rs.getInt("Log_id"));
			user.setLog_description(rs.getString("Log_description"));
			user.setLog_type(rs.getString("Log_type"));
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

public boolean del_log(int log_num) {
	// TODO Auto-generated method stub
	
			Connection conn=null;
			PreparedStatement stmt=null;
			ResultSet rs =null;
			

			String sql = "delete from log where Log_id="+log_num;
			
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
}
