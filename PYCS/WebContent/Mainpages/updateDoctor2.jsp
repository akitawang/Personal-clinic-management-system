<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*"   %> 
<%@ page import="cn.sdut.util.*"   %> 
<%@ page import="cn.sdut.Pclass.*"   %> 
<%@ page import="cn.sdut.dao.*"   %> 
<%@ page import="cn.sdut.dao.impl.*"   %>    


<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-病例处方</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="../assets/images/favicon.ico">

        <!-- jvectormap -->
        <link href="../assets/libs/jqvmap/jqvmap.min.css" rel="stylesheet" />

        <!-- DataTables -->
        <link href="../assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css"/>
        <link href="../assets/libs/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css" rel="stylesheet" type="text/css"/>

        <!-- Icons css -->
        <link href="../assets/libs/@mdi/font/css/materialdesignicons.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/dripicons/webfont/webfont.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css" />

        <!-- App css -->
        <!-- build:css -->
        <link href="../assets/css/app.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/new.css" rel="stylesheet" type="text/css" />
        <!-- endbuild -->

    </head>

    <body>

         <!-- 导入导航侧边栏 -->
    	<%@include file="/Mainpages/nav.jsp" %>

		<div class="wrapper">
            <div class="container-fluid">
		
        <!-- Form row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="card-box">
                            <h4 class="m-t-0 header-title">原医生信息</h4>


<%

request.setCharacterEncoding("utf-8");


String num = request.getParameter("username");



  System.out.println(num);



DoctorDAOImpl impl = new DoctorDAOImpl();
doctor data = new doctor();


data=impl.getOneUser(num);

if(data==null) {
	out.print("<script language='javaScript'> alert('医生不存在');</script>");
	response.setHeader("Refresh", "0;URL=updateDoctor1.jsp");
	}

else
{
%>
                                           <form action="/PYCS/UpdateDoctor" method="post" onsubmit="return verify()">
                                <div class="form-row">
                                    <div class="form-group col-md-3">
                                        <label for="name" class="col-form-label">姓名<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control"  required name="name1" readOnly="true" value=<%=data.getDoctor_name()%>>
                                    </div>
    
                                   
                                    <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">电话号码<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="phone1" required readOnly="true" name="phone1"  value=<%=data.getDoctor_phone()%>  >
                                    </div>
                                      <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">账号<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="username3" required readOnly="true" name="username3" value=<%=data.getDoctor_num()%>  >
                                    </div>
                                    
                                     <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">密码<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="password1" required  readOnly="true" name="password1" value=<%=data.getDoctor_password()%>  >
                                    </div>
                                </div>
                                <div class="form-row">
                                <div class="form-group col-md-3">
                                   <label for="inputPassword4" class="col-form-label">入职时间<span class="text-danger">*</span></label>
                                  <input type="text" class="form-control" id="birth1" required  readOnly="true" name="birth1" value=<%=data.getDoctor_time()%>  >
                                </div>
                                <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">科室<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="dep1" readOnly="true" required  name="dep1" value=<%=data.getDoctor_dep()%>>
                                    </div>
                                 <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">员工编号</span></label>
                                        <input type="text" class="form-control" id="id1" readOnly="true" required  name="id1" value=<%=data.getDoctor_id()%>>
                                    </div>
								</div> 
                                
                             
                         
                           
                           
                            <h4 class="m-t-0 header-title">可修改医生信息</h4>

                                 <div class="form-row">
                                    <div class="form-group col-md-3">
                                        <label for="name" class="col-form-label">姓名<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value=<%=data.getDoctor_name()%> required name="name" placeholder="请输入医生姓名">
                                    </div>
    
                                   
                                    <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">电话号码<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value=<%=data.getDoctor_phone()%> id="phone" required  name="phone" placeholder="请输入医生电话号码" pattern="^[0-9]{11,11}$" title="只能是11位数字" >
                                    </div>
                                      <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">账号<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="username2" value=<%=data.getDoctor_num()%> required  name="username2" placeholder="请输入医生账号" pattern="^[a-zA-Z0-9_]{6,16}$" title="只能是6-11位字母、数字、_" >
                                    </div>
                                    
                                     <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">密码<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="password" required value=<%=data.getDoctor_password()%> name="password" placeholder="请输入医生密码" pattern="^[a-zA-Z0-9_]{6,16}$" title="只能是6-11位字母、数字、_" >
                                    </div>
                                </div>
                                <div class="form-row">
                                <div class="form-group col-md-3">
                                   <label>入职时间<span class="text-danger">*</span></label>
                                   <div>
                                       <div class="input-group">
                                           <input type="inputPassword4" class="form-control"  value=<%=data.getDoctor_time()%> required  placeholder="mm/dd/yyyy" name="birth" id="datepicker">
                                           <div class="input-group-append">
                                           		<span class="input-group-text"><i class="mdi mdi-calendar"></i></span>
                                           </div>
                                       </div>
                                    </div>
                                </div>
                                <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">科室<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="dep" required value=<%=data.getDoctor_dep()%> name="dep" placeholder="请输入医生科室">
                                    </div>
                                 <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">员工编号<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="id" required  value=<%=data.getDoctor_id()%>  name="id" placeholder="请输入医生员工编号">
                                    </div>
								</div> 
                                
                                <div class="form-group">
                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input class="form-check-input" id="check" value="a" type="checkbox"> 我已对上述信息复核
                                        </label>
                                    </div>
                                </div>
                                <button type="submit"  class="btn btn-primary waves-light waves-effect btn-sm" id="toastr-four">提交</button>
                         </form>
                           
                           
                           
                           
                        </div> <!-- end card-box -->
                    </div> <!-- end col -->
                </div>
                <!-- end row -->
			</div><!-- end container -->
			
			</div> <!-- end wrapper -->
			
			
        <!-- end contain1(from wrapper) -->

<%  } %>
      




        <!-- jQuery  -->
        <script src="../assets/libs/jquery/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- select2 js -->
        <script src="../assets/libs/select2/js/select2.min.js"></script>
        <script src="../assets/libs/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>
        <script src="../assets/libs/mohithg-switchery/switchery.min.js"></script>
        <script src="../assets/libs/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
        <!-- Mask input -->
        <script src="../assets/libs/jquery-mask-plugin/jquery.mask.min.js"></script>
        <!-- Bootstrap Select -->
        <script src="../assets/libs/bootstrap-select/js/bootstrap-select.min.js"></script>

        <script src="../assets/libs/bootstrap-timepicker/js/bootstrap-timepicker.min.js"></script>

        <script src="../assets/libs/bootstrap-colorpicker/js/bootstrap-colorpicker.min.js"></script>

        <script src="../assets/libs/moment/moment.js"></script>

        <script src="../assets/libs/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>

        <script src="../assets/libs/bootstrap-daterangepicker/daterangepicker.js"></script>
		<!-- Parsley js -->
        <script type="text/javascript" src="assets/libs/parsleyjs/parsley.min.js"></script>

        <!-- Init Js file -->
        <script src="../assets/js/jquery.form-advanced.js"></script>

        <!-- App js -->
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>
        
        <!-- Toastr js -->
        <script src="assets/libs/jquery-toast-plugin/jquery.toast.min.js"></script>
        <script src="assets/js/jquery.toastr.js"></script>
        

        <script>
        	
        	 function verify() {
        		 
        		 var isChecked = $('#check').prop('checked');
        		 if(isChecked){
        			 return true;
        		 }
        		 else{
        			 alert("请勾选‘我已对上述信息复核’选择框");
        			 return false;
        		 }
        		 
        		
        	 }
        	 
            $(document).ready(function() {
                // Default Datatable
                $('#datatable').DataTable({
                    "pageLength": 5,
                    "searching": false,
                    "lengthChange": false
                });
            } );
            
            
          
        </script>
</body>
</html>