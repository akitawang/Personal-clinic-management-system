package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.Pclass.drug;
import cn.sdut.dao.impl.DrugDAOImpl;

/**
 * Servlet implementation class drug_warning
 */
public class drug_warning extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drug_warning() {
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
		
		DrugDAOImpl impl = new DrugDAOImpl();
		
		try {
			
			List<drug> list = impl.warning();
			if(list != null)
			{
				request.setAttribute("list", list);
				//这里是转发，从Servlet跳转到showinfo.jsp页面，并且带上request和response对象中原有的参数
				request.getRequestDispatcher("/Mainpages/drug_warning.jsp").forward(request, response);
			}
			else
			{
				pw.write("<script language='javascript'>alert('无任何过期药品！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
