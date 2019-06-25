package cn.sdut.dao.impl;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import cn.sdut.JdbcUtil;
import cn.sdut.Pclass.*;
import cn.sdut.dao.DrugDAO;

public class DrugDAOImpl implements DrugDAO {

	public boolean add(drug Drug) {
		// TODO Auto-generated method stub
		String sql = "insert into drug(Drug_id,Drug_name,Drug_class,Drug_number,Drug_factory,Drug_type,Drug_instruction,Drug_function,Drug_stock,Drug_price,Drug_date,Drug_expdate)values(?,?,?,?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// System.out.println(sql);
		try {
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
			int rows = stmt.executeUpdate();

			if (rows > 0)
				return true;

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, stmt, conn);
		}
		return false;
	}

	public List<drug> getAlldrug() {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "select Drug_id,Drug_name,Drug_class,Drug_number,Drug_factory,Drug_type,Drug_instruction,Drug_function,Drug_stock,Drug_price,Drug_date,Drug_expdate from drug  ";

		// System.out.println(sql);

		try {
			List<drug> list = new ArrayList<drug>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			while (rs.next()) {
				drug user = new drug();

				user.setDrug_class(rs.getString("Drug_class"));
				user.setDrug_date(rs.getString("Drug_date"));
				user.setDrug_expdate(rs.getString("Drug_expdate"));
				user.setDrug_factory(rs.getString("Drug_factory"));
				user.setDrug_function(rs.getString("Drug_function"));
				user.setDrug_id(rs.getInt("Drug_id"));
				user.setDrug_instruction(rs.getString("Drug_instruction"));
				user.setDrug_name(rs.getString("Drug_name"));
				user.setDrug_number(rs.getString("Drug_number"));
				user.setDrug_price(rs.getDouble("Drug_price"));
				user.setDrug_stock(rs.getInt("Drug_stock"));
				user.setDrug_type(rs.getString("Drug_type"));

				list.add(user);
			}
			return list;

		} catch (Exception e) {
			throw new RuntimeException(e);

		} finally {
			JdbcUtil.release(rs, stmt, conn);

		}
	}

	public boolean delete(int Drug_id) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "delete from drug where Drug_id=? ";

		// System.out.println(sql);

		try {
			List<drug> list = new ArrayList<drug>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, Drug_id);

			int rows = stmt.executeUpdate();

			if (rows > 0)

				return true;
			else
				return false;

		} catch (Exception e) {
			throw new RuntimeException(e);

		} finally {
			JdbcUtil.release(rs, stmt, conn);

		}
	}

	public boolean update(int id, String ins, String fun, double price, int stock) {

		String sql = "update drug  set Drug_instruction=?,Drug_function=?,Drug_stock=?,Drug_price=? where Drug_id=? ";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// System.out.println(sql);
		try {

			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, ins);
			stmt.setString(2, fun);
			stmt.setInt(3, stock);
			stmt.setDouble(4, price);
			stmt.setInt(5, id);

			int rows = stmt.executeUpdate();

			if (rows > 0)
				return true;

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, stmt, conn);
		}

		return false;
	}

	@Override
	public boolean drug_addition(drug drug) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = (Connection) JdbcUtil.getConnection();

			String sql = "insert into drug values(?, ?, ?, ?,?, ?, ?, ?,?, ?, ?, ?)";

			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, drug.getDrug_id());
			stmt.setString(2, drug.getDrug_name());
			stmt.setString(3, drug.getDrug_class());
			stmt.setString(4, drug.getDrug_number());
			stmt.setString(5, drug.getDrug_factory());
			stmt.setString(6, drug.getDrug_type());
			stmt.setString(7, drug.getDrug_instruction());
			stmt.setString(8, drug.getDrug_function());
			stmt.setInt(9, drug.getDrug_stock());
			stmt.setDouble(10, drug.getDrug_price());
			stmt.setString(11, drug.getDrug_date());
			stmt.setString(12, drug.getDrug_expdate());

			int i = stmt.executeUpdate();

			if (i == 1) {
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.release(rs, stmt, conn);
		}

		return false;
	}

	public drug find(int Drug_id) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		System.out.println(Drug_id);

		String sql = "select * from drug where Drug_id=?";

		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);

		stmt.setInt(1, Drug_id);
		rs = stmt.executeQuery();

		while (rs.next()) {
			drug dg = new drug();

			dg.setDrug_class(rs.getString("Drug_class"));
			dg.setDrug_date(rs.getString("Drug_date"));
			dg.setDrug_expdate(rs.getString("Drug_expdate"));
			dg.setDrug_factory(rs.getString("Drug_factory"));
			dg.setDrug_function(rs.getString("Drug_function"));
			dg.setDrug_id(Drug_id);
			dg.setDrug_instruction(rs.getString("Drug_instruction"));
			dg.setDrug_name(rs.getString("Drug_name"));
			dg.setDrug_number(rs.getString("Drug_number"));
			dg.setDrug_price(rs.getDouble("Drug_price"));
			dg.setDrug_stock(rs.getInt("Drug_stock"));
			dg.setDrug_type(rs.getString("Drug_type"));

			// return user;
			// (rs.getString("birthday"));

			JdbcUtil.release(rs, stmt, conn);
			return dg;
		}
		return null;
	}

	public static List<drug> SearchOne(int Drug_id) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "select * from drug where Drug_id=" + Drug_id;

		conn = JdbcUtil.getConnection();
		stmt = conn.prepareStatement(sql);

		rs = stmt.executeQuery();
		List<drug> list = new ArrayList<drug>();
		while (rs.next()) {
			drug dg = new drug();

			dg.setDrug_class(rs.getString("Drug_class"));
			dg.setDrug_date(rs.getString("Drug_date"));
			dg.setDrug_expdate(rs.getString("Drug_expdate"));
			dg.setDrug_factory(rs.getString("Drug_factory"));
			dg.setDrug_function(rs.getString("Drug_function"));
			dg.setDrug_id(rs.getInt("Drug_id"));
			dg.setDrug_instruction(rs.getString("Drug_instruction"));
			dg.setDrug_name(rs.getString("Drug_name"));
			dg.setDrug_number(rs.getString("Drug_number"));
			dg.setDrug_price(rs.getDouble("Drug_price"));
			dg.setDrug_stock(rs.getInt("Drug_stock"));
			dg.setDrug_type(rs.getString("Drug_type"));

			// return user;
			// (rs.getString("birthday"));
			list.add(dg);

		}

		JdbcUtil.release(rs, stmt, conn);
		return list;
	}

	public static int differentDays(Date date1, Date date2) {
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int day1 = cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if (year1 != year2) // 同一年
		{
			int timeDistance = 0;
			for (int i = year1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) // 闰年
				{
					timeDistance += 366;
				} else // 不是闰年
				{
					timeDistance += 365;
				}
			}

			return timeDistance + (day2 - day1);
		} else // 不同年
		{
			System.out.println("判断day2 - day1 : " + (day2 - day1));
			return day2 - day1;
		}
	}
	
	public List<drug> warning() throws ParseException
	{
		List<drug> list = getAlldrug();
		List<drug> l = new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
		{
		      drug drug = list.get(i);
		      String expdate = drug.getDrug_expdate();
		      
		      DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		      Date date = dateFormat.parse(expdate);
		       
		      System.out.println(date);
		     
		      Date now = new Date(); 	
		      
		      int days = differentDays(now, date);
		      
		      if(days <= 7)
		      {
		    	  
		    	  l.add(drug);
		      }
		     
		}
		return l;
	}
	
	public List<drug> stocklimit()
	{
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "select * from drug where Drug_stock < 10";
		// System.out.println(sql);

		try {
			List<drug> list = new ArrayList<drug>();
			conn = JdbcUtil.getConnection();
			stmt = conn.prepareStatement(sql);

			rs = stmt.executeQuery();

			while (rs.next()) {
				drug user = new drug();

				user.setDrug_class(rs.getString("Drug_class"));
				user.setDrug_date(rs.getString("Drug_date"));
				user.setDrug_expdate(rs.getString("Drug_expdate"));
				user.setDrug_factory(rs.getString("Drug_factory"));
				user.setDrug_function(rs.getString("Drug_function"));
				user.setDrug_id(rs.getInt("Drug_id"));
				user.setDrug_instruction(rs.getString("Drug_instruction"));
				user.setDrug_name(rs.getString("Drug_name"));
				user.setDrug_number(rs.getString("Drug_number"));
				user.setDrug_price(rs.getDouble("Drug_price"));
				user.setDrug_stock(rs.getInt("Drug_stock"));
				user.setDrug_type(rs.getString("Drug_type"));

				list.add(user);
			}
			return list;

		} catch (Exception e) {
			throw new RuntimeException(e);

		} finally {
			JdbcUtil.release(rs, stmt, conn);

		}
		
	}
	

}
