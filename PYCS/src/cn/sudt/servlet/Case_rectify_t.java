package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.Pclass.cases;
import cn.sdut.dao.impl.CasesDAOImpl;
import cn.sdut.dao.impl.LogDaoImpl;

/**
 * Servlet implementation class Case_rectify_t
 */
public class Case_rectify_t extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Case_rectify_t() {
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

		PrintWriter pw = response.getWriter();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		
		String case_num = request.getParameter("num");
		String Case_phone = request.getParameter("phone");
		String Case_weight = request.getParameter("weight");
		String Case_address = request.getParameter("address");
		String Case_allergy = request.getParameter("allergy");
		String Case_height = request.getParameter("height");
		String Case_symptom = request.getParameter("symptom");
		String Case_info = request.getParameter("info");
		String Case_advice = request.getParameter("advice");
		String Case_item = request.getParameter("item");
		String Case_pre = request.getParameter("pre");
		String Case_name = request.getParameter("name");
		if(Case_weight=="") {
			Case_weight="null";
		}
		if(Case_address=="") {
			Case_address="null";
		}
		if(Case_height=="") {
			Case_height="null";
		}
		
		
		/*System.out.println(Case_weight);
		System.out.println(Case_address);
		System.out.println(Case_allergy);
		*/
		cases newcase = new cases();
		newcase.setCase_num(case_num);
		newcase.setCase_phone(Case_phone);
		newcase.setCase_weight(Case_weight);
		newcase.setCase_address(Case_address);
		newcase.setCase_height(Case_height);
		newcase.setCase_allergy(Case_allergy);
		newcase.setCase_symptom(Case_symptom);
		newcase.setCase_info(Case_info);
		newcase.setCase_advice(Case_advice);
		newcase.setCase_item(Case_item);
		newcase.setCase_pre(Case_pre);
		
		CasesDAOImpl dao = new CasesDAOImpl();
		boolean verify = dao.update(newcase);
		
		
		LogDaoImpl logdao = new LogDaoImpl();
		boolean verify2 = logdao.add_case_rec(Case_name, date);
		
		
		if(verify&&verify2) {
			pw.write("<script language='javascript'>alert('修改成功！');if(window.confirm)window.location = '/PYCS/Allcases_search';</script>");
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
