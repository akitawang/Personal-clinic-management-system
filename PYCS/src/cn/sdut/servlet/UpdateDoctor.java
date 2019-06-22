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
 * Servlet implementation class UpdateDoctor
 */
public class UpdateDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDoctor() {
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
		String num = request.getParameter("username2");
		String id = request.getParameter("id");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String dep = request.getParameter("dep");
		String time = request.getParameter("birth");
		String num1=request.getParameter("username3");
		
		  System.out.println();
		  System.out.println(name);
		  System.out.println(num);
		  System.out.println(id);
		 System.out.println(phone);
		  System.out.println(password);
		 System.out.println(dep);
		 System.out.println(time);
		 System.out.println(num1);
		
		
		DoctorDAOImpl impl = new DoctorDAOImpl();
		doctor data = new doctor();
		
	
		data.setDoctor_dep(dep);
		data.setDoctor_id(id);
		data.setDoctor_name(name);
		data.setDoctor_num(num);
		data.setDoctor_password(password);
		data.setDoctor_phone(phone);
		data.setDoctor_time(time);
		
		boolean judge = impl.update(data,num1);
		if(judge) {
			pw.write("<script language='javascript'>alert('修改成功！');if(window.confirm)window.location = '/PYCS/Mainpages/index.jsp';</script>");
		}
		else {
			pw.write("<script language='javascript'>alert('修改失败');if(window.confirm)window.location = '/PYCS/Mainpages/index.jsp';</script>");
		}
		
		
		/*ManageService dao = new ManageService();
		
		int i;
		i = dao.register(username,userpassword,userphone,useremail);
		if(i == 1)
		{
			pw.write("<script language='javascript'>alert('娉ㄥ唽鎴愬姛锛?');if(window.confirm)window.location = '/mydoor/searchservlet';</script>");
		}
		else
		{
			pw.write("<script language='javascript'>alert('娉ㄥ唽澶辫触锛?');if(window.confirm)window.location = '/mydoor/back-page/forms/new_onemanage.jsp'</script>");
		} */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
