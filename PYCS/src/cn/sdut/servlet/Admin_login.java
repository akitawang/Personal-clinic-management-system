package cn.sdut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.sdut.Pclass.*;
import cn.sdut.dao.impl.*;


/**
 * Servlet implementation class Admin_login
 */
//@WebServlet("/Admin_login")
public class Admin_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		PrintWriter pw = response.getWriter();
		
		//获取前端输入的用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String radioInline= request.getParameter("radioInline");
		HttpSession session = request.getSession();
		
	System.out.println("username = "+username);
	System.out.println("password = "+password);
	System.out.println("radioInline = "+radioInline);
		
		//连接数据库s
	if(radioInline.equals("option1"))
{
		AdminDAOImpl impl = new AdminDAOImpl();
		admin ub=null;
		ub=impl.getOneUser(username);
		//判断是否为管理员
		if(ub!=null&&ub.getAdmin_password().equals(password)) {
		
	
			session.setAttribute("user", ub);
				System.out.println("管理员登陆成功");
				
				
				pw.write("<script language='javascript'>window.location = '/PYCS/Mainpages/index.jsp';</script>");
				
			}
		else {
			out.print("<script language='javaScript'>alert('登陆失败，请检查账号密码是否正确');</script>");
			String url = request.getContextPath()+"/loginpages/login.jsp";
			response.setHeader("Refresh", "0;"+url);
		}
			
}
else
{
	DoctorDAOImpl impl=new DoctorDAOImpl();
	doctor ub=null;
	ub=impl.getOneUser(username);

	if(ub!=null&&ub.getDoctor_password().equals(password)) {
	

		session.setAttribute("user1", ub);
			System.out.println("医生登陆成功");
			
			
			pw.write("<script language='javascript'>window.location = '/PYCS/Mainpages/index_doctor.jsp';</script>");
			
		}
	else {
		out.print("<script language='javaScript'>alert('登陆失败，请检查账号密码是否正确');</script>");
		String url = request.getContextPath()+"/loginpages/login.jsp";
		response.setHeader("Refresh", "0;"+url);
	}
}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}