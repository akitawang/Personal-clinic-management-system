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
 * Servlet implementation class UpdatePatient
 */
public class UpdatePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePatient() {
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
		
		
		
		 String Patient_name= request.getParameter("name");     
		 String Patient_sex= request.getParameter("gender");     
		 String Patient_birth= request.getParameter("birth");   
		 String Patient_weight = request.getParameter("weight"); 
		 String Patient_id= request.getParameter("id");      
		 String Patient_phone= request.getParameter("phone");     
		 String Patient_address= request.getParameter("address");
		 String Patient_zt=request.getParameter("zt");
		 String num=request.getParameter("list");  
		 int Patient_list=Integer.valueOf(num);
				
			
		
		PatientDAOImpl impl = new PatientDAOImpl();
		patient data = new patient();
		
	
		data.setPatient_sex(Patient_sex);
		data.setPatient_address(Patient_address);
		data.setPatient_birth(Patient_birth);
		data.setPatient_id(Patient_id);
		data.setPatient_list(Patient_list);
		data.setPatient_name(Patient_name);
		data.setPatient_phone(Patient_phone);
		data.setPatient_weight(Patient_weight);
		data.setPatient_zt(Patient_zt);
	
		boolean judge = impl.update(data);
		
		LogDaoImpl logdao = new LogDaoImpl();
		boolean d2 = logdao.add_patient_rec(Patient_name,date);
		
		if(judge&&d2) {
			pw.write("<script language='javascript'>alert('修改成功！');if(window.confirm)window.location = '/PYCS/Mainpages/index.jsp';</script>");
		}
		else {
			pw.write("<script language='javascript'>alert('修改失败');if(window.confirm)window.location = '/PYCS/Mainpages/index.jsp';</script>");
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
