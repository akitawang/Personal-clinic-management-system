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
 * Servlet implementation class DeleteDoctor
 */
public class DeleteDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDoctor() {
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
		
		
		
		
		
		String num = request.getParameter("username");
		
		
		
		
		
		  System.out.println(num);
		
		
		
		DoctorDAOImpl impl = new DoctorDAOImpl();
		doctor data = new doctor();
		

		
		boolean judge = impl.delete(num);
		if(judge) {
			pw.write("<script language='javascript'>alert('删除成功！');if(window.confirm)window.location = '/PYCS/Mainpages/index.jsp';</script>");
		}
		else {
			pw.write("<script language='javascript'>alert('删除失败');if(window.confirm)window.location = '/PYCS/Mainpages/index.jsp';</script>");
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
