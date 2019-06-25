package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.dao.impl.DrugDAOImpl;

/**
 * Servlet implementation class drug_delete_servlet
 */
public class drug_delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drug_delete_servlet() {
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

		PrintWriter pw = response.getWriter();
		
		String drugid = request.getParameter("id");
		
		int did = Integer.parseInt(drugid);
		
		DrugDAOImpl impl = new DrugDAOImpl();
		
		boolean b = impl.delete(did);
		
		if(b) {
			pw.write("<script language='javascript'>alert('删除成功！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
		}
		else
		{
			pw.write("<script language='javascript'>alert('删除失败！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
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
