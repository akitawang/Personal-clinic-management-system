package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.dao.impl.DrugDAOImpl;
import cn.sdut.dao.impl.LogDaoImpl;

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
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		PrintWriter pw = response.getWriter();
		
		String drugid = request.getParameter("id");
		String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
		
		int did = Integer.parseInt(drugid);
		
		DrugDAOImpl impl = new DrugDAOImpl();
		boolean b = impl.delete(did);
		
		LogDaoImpl logdao = new LogDaoImpl();
		boolean d2 = logdao.add_drug_del(name,date);
		
		if(b && d2) {
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
