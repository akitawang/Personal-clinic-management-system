package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.Pclass.drug;
import cn.sdut.dao.impl.DrugDAOImpl;
import cn.sdut.dao.impl.LogDaoImpl;

/**
 * Servlet implementation class cart_servlet_a
 */
public class cart_servlet_a extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cart_servlet_a() {
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
		Date t = new Date();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String dated = df.format(t);
		PrintWriter pw = response.getWriter();
		
		String drugid = request.getParameter("id2");
		
		String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");

		int did = Integer.parseInt(drugid);
		
		DrugDAOImpl impl = new DrugDAOImpl();
		
		try {
			
			drug find = impl.find(did);
			int sto = find.getDrug_stock();
			String ins = find.getDrug_instruction();
			String fun = find.getDrug_function();
			
			double price = find.getDrug_price();
			
			LogDaoImpl dao2 = new LogDaoImpl();
			
			
			if(sto > 0)
			{
				int stock = sto - 1;
				boolean b = impl.update(did, ins, fun, price, stock);
				boolean judge2 = dao2.add_drug_sell(name, dated);
				if(b&&judge2) {
					pw.write("<script language='javascript'>alert('您售出了一件药品！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
				}
				else
				{
					pw.write("<script language='javascript'>alert('操作失败！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
				}
			}
			else
			{
				pw.write("<script language='javascript'>alert('无库存，请及时补充！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
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
