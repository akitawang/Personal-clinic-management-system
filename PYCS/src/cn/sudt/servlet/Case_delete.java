package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cn.sdut.dao.impl.CasesDAOImpl;

/**
 * Servlet implementation class Case_delete
 */
public class Case_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Case_delete() {
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
		String cases_num = request.getParameter("num");
		
		CasesDAOImpl dao = new CasesDAOImpl();
		boolean d = dao.delete(cases_num);
		PrintWriter pw = response.getWriter();
		
		if(d)
		{
			pw.write("<script language='javascript'>alert('删除成功！');if(window.confirm)window.location = '/PYCS/Allcases_search';</script>");
		}
		else
		{
			pw.write("<script language='javascript'>alert('修改失败！');if(window.confirm)window.location = '/PYCS/Allcases_search';</script>");
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
