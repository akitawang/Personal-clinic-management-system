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
 * Servlet implementation class AddDoctor
 */
public class AddDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDoctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		PrintWriter pw = response.getWriter();
		
		
		
		
		String name = request.getParameter("name");
		String num = request.getParameter("username");
		String id = request.getParameter("id");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String dep = request.getParameter("dep");
		String time = request.getParameter("birth");
		
		
		
		  System.out.println(name);
		  System.out.println(num);
		  System.out.println(id);
		 System.out.println(phone);
		  System.out.println(password);
		 System.out.println(dep);
		 System.out.println(time);
		
		
		DoctorDAOImpl impl = new DoctorDAOImpl();
		doctor data = new doctor();
		
	
		data.setDoctor_dep(dep);
		data.setDoctor_id(id);
		data.setDoctor_name(name);
		data.setDoctor_num(num);
		data.setDoctor_password(password);
		data.setDoctor_phone(phone);
		data.setDoctor_time(time);
		
		boolean judge = impl.add(data);
		if(judge) {
			pw.write("<script language='javascript'>alert('添加成功！');if(window.confirm)window.location = '/PYCS/Mainpages/add_doctor.jsp';</script>");
		}
		else {
			pw.write("<script language='javascript'>alert('添加失败');if(window.confirm)window.location = '/PYCS/Mainpages/add_doctor.jsp';</script>");
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
