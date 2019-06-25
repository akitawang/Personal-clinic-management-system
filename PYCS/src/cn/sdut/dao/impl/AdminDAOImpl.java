package cn.sdut.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.*;
import cn.sdut.dao.*;

public class AdminDAOImpl implements AdminDAO {


	

	public boolean update(admin admin) {
		// TODO Auto-generated method stub
	String sql = "update  admin set  Admin_password=? where Admin_num=?";
		
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		
		//System.out.println(sql);
		try
		{
				
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			
			stmt.setString(1, admin.getAdmin_password());
			stmt.setString(2, admin.getAdmin_num());
		
			
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

public List<admin> getAlladmin() {
		
		

		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		

		String sql = "select  Admin_num,Admin_password from admin  ";
		
		//System.out.println(sql);
		
		try
		{
			 List<admin> list= new ArrayList<admin>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			
			rs  = stmt.executeQuery();


			while(rs.next()){
				admin user = new admin();
				
			
			user.setAdmin_num(rs.getString("Admin_num"));
			user.setAdmin_password(rs.getString("Admin_password"));
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

public admin getOneUser(String username) {
	// TODO Auto-generated method stub
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs =null;
	

	String sql = "select * from admin where admin_num=?  ";
	
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
			admin admin1 = new admin();
		
			admin1.setAdmin_num(rs.getString("Admin_num"));

			admin1.setAdmin_password(rs.getString("Admin_password"));
	
			return admin1;
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
