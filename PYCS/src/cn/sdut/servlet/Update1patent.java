package cn.sdut.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.dao.impl.PatientDAOImpl;

/**
 * Servlet implementation class Update1patent
 */
public class Update1patent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update1patent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String num = request.getParameter("id");
		System.out.println();
		System.out.println(num);
		String s=new String("NO");
		
		
		PatientDAOImpl dao = new PatientDAOImpl();
		boolean d = dao.update1(num);
		PrintWriter pw = response.getWriter();
		
		if(d)
		{
			pw.write("<script language='javascript'>alert('呼叫成功！');if(window.confirm)window.location = '/PYCS/Mainpages/patient_manager.jsp';</script>");
		}
		else
		{
			pw.write("<script language='javascript'>alert('呼叫失败！');if(window.confirm)window.location = '/PYCS/Mainpages/patient_manager.jsp';</script>");
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
