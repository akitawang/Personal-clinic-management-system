package cn.sudt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sdut.Pclass.cases;
import cn.sdut.dao.impl.CasesDAOImpl;


/**
 * Servlet implementation class Create_prescription_servlet
 */
public class Create_prescription_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create_prescription_servlet() {
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
		
		String Case_name = request.getParameter("name");
		String Case_sex = request.getParameter("gender");
		String Case_birth = request.getParameter("birth");
		String Case_phone = request.getParameter("phone");
		String Case_weight = request.getParameter("weight");
		String Case_address = request.getParameter("address");
		String Case_allergy = request.getParameter("allergy");
		String Case_height = request.getParameter("height");
		String Case_type = request.getParameter("bloodtype");
		String Case_symptom = request.getParameter("symptom");
		String Case_info = request.getParameter("info");
		String Case_advice = request.getParameter("advice");
		String Case_item = request.getParameter("item");
		String Case_pre = request.getParameter("pre");
		
		/* 查看输入情况
		 * System.out.println(Case_name);
		 * System.out.println(Case_sex);
		 * System.out.println(Case_birth);
		 * System.out.println(Case_phone);
		 * System.out.println(Case_weight);
		 * System.out.println(Case_address);
		 * System.out.println(Case_allergy);
		 * System.out.println(Case_height);
		 * System.out.println(Case_type);
		 * System.out.println(Case_symptom);
		 * System.out.println(Case_info);
		 * System.out.println(Case_advice);
		 * System.out.println(Case_item);
		 * System.out.println(Case_pre);
		 */
		
		CasesDAOImpl impl = new CasesDAOImpl();
		cases data = new cases();
		data.setCase_name(Case_name);
		data.setCase_phone(Case_phone);
		data.setCase_sex(Case_sex);
		data.setCase_address(Case_address);
		data.setCase_allergy(Case_allergy);
		data.setCase_height(Case_height);
		data.setCase_weight(Case_weight);
		data.setCase_type(Case_type);
		data.setCase_birth(Case_birth);
		data.setCase_advice(Case_advice);
		data.setCase_info(Case_info);
		data.setCase_item(Case_item);
		data.setCase_pre(Case_pre);
		data.setCase_symptom(Case_symptom);
		boolean judge = impl.add(data);
		if(judge) {
			pw.write("<script language='javascript'>alert('添加成功！');if(window.confirm)window.location = '/PYCS/Mainpages/create_prescription.jsp';</script>");
		}
		else {
			pw.write("<script language='javascript'>alert('添加不成功！');if(window.confirm)window.location = '/PYCS/Mainpages/create_prescription.jsp';</script>");
		}
		
		
		/*ManageService dao = new ManageService();
		
		int i;
		i = dao.register(username,userpassword,userphone,useremail);
		if(i == 1)
		{
			pw.write("<script language='javascript'>alert('注册成功！');if(window.confirm)window.location = '/mydoor/searchservlet';</script>");
		}
		else
		{
			pw.write("<script language='javascript'>alert('注册失败！');if(window.confirm)window.location = '/mydoor/back-page/forms/new_onemanage.jsp'</script>");
		} */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
