package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.Pclass.drug;
import cn.sdut.dao.impl.*;

/**
 * Servlet implementation class drug_modify_b
 */
public class drug_modify_b extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int Drug_id = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drug_modify_b() {
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
		
		String drugid = request.getParameter("drugid");
		String amount = request.getParameter("amount");
		String pri = request.getParameter("price");
		String ins = request.getParameter("explain");
		String fun = request.getParameter("effect");
		
		DrugDAOImpl dd = new DrugDAOImpl();
		
		int did = Integer.parseInt(drugid);
		double price = Double.parseDouble(pri);
		int stock = Integer.parseInt(amount);
		
		try {

			boolean b = dd.update(did, ins, fun, price, stock);
			
			if(b) {
				pw.write("<script language='javascript'>alert('修改成功！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
			}
			else
			{
				pw.write("<script language='javascript'>alert('修改失败！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
			}
			
		} catch (Exception e) {
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
