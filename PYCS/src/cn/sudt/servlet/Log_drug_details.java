package cn.sudt.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.Pclass.*;
import cn.sdut.dao.impl.CasesDAOImpl;
import cn.sdut.dao.impl.LogDaoImpl;

/**
 * Servlet implementation class Log_drug_details
 */
public class Log_drug_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Log_drug_details() {
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
		
		
		
		LogDaoImpl dao = new LogDaoImpl();
		List<logs> list = new ArrayList<logs>();
		list = dao.getOneLog();
		
			//将数据库中查询到的信息封装在user对象中，use对象保存在request中，之后将通过request对象将数据传递到页面
			//需要的话也可以只传递一个参数request.setAttribute("id", user.getId());
			

			request.setAttribute("list", list);
			//这里是转发，从Servlet跳转到showinfo.jsp页面，并且带上request和response对象中原有的参数
			request.getRequestDispatcher("/Mainpages/Log_drug.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
