package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.dao.impl.CasesDAOImpl;
import cn.sdut.dao.impl.LogDaoImpl;

/**
 * Servlet implementation class Log_del
 */
public class Log_del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Log_del() {
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
		
		String id = request.getParameter("id");
		int parseInt = Integer.parseInt(id);
		
		LogDaoImpl logdao = new LogDaoImpl();
		boolean d2 = logdao.del_log(parseInt);
		
		PrintWriter pw = response.getWriter();
		
		if(d2)
		{
			pw.write("<script language='javascript'>alert('删除成功！');if(window.confirm)window.location = '/PYCS/Log_drug_details';</script>");
		}
		else
		{
			pw.write("<script language='javascript'>alert('修改失败！');if(window.confirm)window.location = '/PYCS/Log_drug_details';</script>");
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
