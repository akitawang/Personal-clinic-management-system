package cn.sdut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.sdut.Pclass.*;
import cn.sdut.dao.impl.*;


/**
 * Servlet implementation class  AddPatient
 */
public class AddPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPatient() {
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
		
		
		
		 String Patient_name= request.getParameter("name");     
		 String Patient_sex= request.getParameter("gender");     
		 String Patient_birth= request.getParameter("birth");   
		 String Patient_weight = request.getParameter("weight"); 
		 String Patient_id= request.getParameter("id");      
		 String Patient_phone= request.getParameter("phone");     
		 String Patient_address= request.getParameter("address");
		 String Patient_zt=new String("YES");
		 
		
			Date t = new Date();
	
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String dated = df.format(t);
		
		
		
		PatientDAOImpl impl = new PatientDAOImpl();
		patient data = new patient();
		
		data.setPatient_sex(Patient_sex);
		data.setPatient_address(Patient_address);
		data.setPatient_birth(Patient_birth);
		data.setPatient_id(Patient_id);
//		data.setPatient_list(Patient_list);
		data.setPatient_name(Patient_name);
		data.setPatient_phone(Patient_phone);
		data.setPatient_weight(Patient_weight);
		data.setPatient_zt(Patient_zt);
	
	
		boolean judge = impl.add(data);
		
		LogDaoImpl dao2 = new LogDaoImpl();
		boolean judge2 = dao2.add_patient_add(Patient_name, dated);
		
		
		if(judge && judge2) {
			pw.write("<script language='javascript'>alert('添加成功！');if(window.confirm)window.location = '/PYCS/Mainpages/add_patient.jsp';</script>");
		}
		else {
			pw.write("<script language='javascript'>alert('添加失败');if(window.confirm)window.location = '/PYCS/Mainpages/add_patient.jsp';</script>");
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
