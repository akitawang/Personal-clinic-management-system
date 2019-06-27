package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
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
 * Servlet implementation class drug_addition_servlet
 */
public class drug_addition_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public drug_addition_servlet() {
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
		
		String drugid = request.getParameter("drugid");
		String dname = request.getParameter("dname");
		String apnumber = request.getParameter("apnumber");
		String classification = request.getParameter("classification");
		String amount = request.getParameter("amount");
		String price = request.getParameter("price");
		String dosage = request.getParameter("dosage");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String manufacturer = request.getParameter("manufacturer");
		String explain = request.getParameter("explain");
		String effect = request.getParameter("effect");
		
		int did = Integer.parseInt(drugid);
		double prices = Double.parseDouble(price);
		int stock = Integer.parseInt(amount);
		DrugDAOImpl impl = new DrugDAOImpl();
		
		LogDaoImpl logdao = new LogDaoImpl();
		
		
		try {
			
			drug find = impl.find(did);
			
			if(find == null)
			{

				drug drug = new drug();
				
				drug.setDrug_id(did);
				drug.setDrug_name(dname);
				drug.setDrug_number(apnumber);
				drug.setDrug_class(classification);
				drug.setDrug_stock(stock);
				drug.setDrug_price(prices);
				drug.setDrug_type(dosage);
				drug.setDrug_factory(manufacturer);
				drug.setDrug_instruction(explain);
				drug.setDrug_function(effect);
				drug.setDrug_date(start);
				drug.setDrug_expdate(end);
				
				
				boolean add = impl.add(drug);
				boolean d2 = logdao.add_drug_add(dname,date);
				
				if(add && d2) {
					pw.write("<script language='javascript'>alert('添加成功！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
				}
				else {
					pw.write("<script language='javascript'>alert('添加不成功！');if(window.confirm)window.location = '/PYCS/drug_servlet';</script>");
				}
			}
			else
			{
				pw.write("<script language='javascript'>alert('药品编号已存在，请选择其他编号！');if(window.confirm)window.location = '/PYCS/Mainpages/drug_add.jsp';</script>");
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
