<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="cn.sdut.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统</title>
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
    	
		<%
		session = request.getSession();
		admin usera = (admin)session.getAttribute("user");
		doctor userd = (doctor)session.getAttribute("user1");
    	
    	if(usera==null){
    		
		%>
         

		
        <div class="contain1">
                <div class="wrapper">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-sm-12">
                        <div class="text-center">
                            <i class="h1 mdi mdi-comment-multiple-outline text-muted"></i>
                            <h3>我的资料</h3>
                        </div>
                    </div><!-- end col -->
                </div><!-- end row -->


                <div class="row mt-4">
                    <div class="col-lg-6">
                        <div id="accordion" class="mb-3">

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingOne">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseOne" aria-expanded="true">
                                           <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                      		    编号
                                        </a>
                                    </h5>
                                </div>
                    
                                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                                    <div class="card-body">
                                       <li><%=userd.getDoctor_num() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card-->

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingTwo">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseTwo" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	姓名
                                        </a>
                                    </h5>
                                </div>
                                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                                    <div class="card-body">
                                       <li><%=userd.getDoctor_name() %></li>
                                    </div>
                                </div>
                            </div>

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingThree">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseThree" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	身份证号
                                        </a>
                                    </h5>
                                </div>
                                <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                                    <div class="card-body">
                                       <li><%=userd.getDoctor_id() %></li>
                                    </div>
                                </div>
                            </div>

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingFour">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseFour" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	科室
                                        </a>
                                    </h5>
                                </div>
                                <div id="collapseFour" class="collapse" aria-labelledby="collapseFour" data-parent="#accordion">
                                    <div class="card-body">
                                      <li><%=userd.getDoctor_dep() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card-->
                        </div> <!-- end #accordion -->
                    </div> <!-- end col -->

                    <div class="col-lg-6">
                        <div id="accordion1" class="mb-3">

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingOne">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseFive" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	手机号码
                                        </a>
                                    </h5>
                                </div>
                    
                                <div id="collapseFive" class="collapse" aria-labelledby="headingOne" data-parent="#accordion1">
                                    <div class="card-body">
                                       <li><%=userd.getDoctor_phone() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card -->

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingTwo">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseSix" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	入职时间
                                        </a>
                                    </h5>
                                </div>
                                <div id="collapseSix" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion1">
                                    <div class="card-body">
                                       <li><%=userd.getDoctor_time() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card -->

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingThree">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseSeven" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	登录密码
                                        </a>
                                    </h5>
                                </div>
                                <div id="collapseSeven" class="collapse" aria-labelledby="headingThree" data-parent="#accordion1">
                                    <div class="card-body">
                                       <li><%=userd.getDoctor_password() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card -->

                            
                        </div> <!-- end #accordion1-->
                    </div> <!-- end col -->
                </div> <!-- end row -->

                
    <%
    	}
    	else{
    %>
    
    <div class="contain1">
                <div class="wrapper">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-sm-12">
                        <div class="text-center">
                            <i class="h1 mdi mdi-comment-multiple-outline text-muted"></i>
                            <h3>我的资料</h3>
                        </div>
                    </div><!-- end col -->
                </div><!-- end row -->


                <div class="row mt-4">
                    <div class="col-lg-6">
                        <div id="accordion" class="mb-3">

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingOne">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseOne" aria-expanded="true">
                                           <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                      		   用户名
                                        </a>
                                    </h5>
                                </div>
                    
                                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                                    <div class="card-body">
                                       <li><%=usera.getAdmin_num() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card-->

                            

                            <!-- FAQ Question-->
                            <div class="card">
                                <div class="card-header" id="headingThree">
                                    <h5 class="m-0">
                                        <a class="text-dark" data-toggle="collapse" href="#collapseSeven" aria-expanded="false">
                                            <i class="mdi mdi-help-circle mr-1 text-primary"></i> 
                                            	登录密码
                                        </a>
                                    </h5>
                                </div>
                                <div id="collapseSeven" class="collapse" aria-labelledby="headingThree" data-parent="#accordion1">
                                    <div class="card-body">
                                       <li><%=usera.getAdmin_password() %></li>
                                    </div>
                                </div>
                            </div> <!-- end card -->

                            
                        </div> <!-- end #accordion1-->
                    </div> <!-- end col -->
                </div> <!-- end row -->

                
    
    
    
    <% } %>

            </div> <!-- end container -->
        </div>  
                

        </div>
        
        <!-- end contain1(from wrapper) -->


        




        <!-- jQuery  -->
        <script src="../assets/libs/jquery/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- KNOB JS -->
        <script src="../assets/libs/jquery-knob/jquery.knob.min.js"></script>
        <!-- Chart JS -->
        <script src="../assets/libs/chart.js/Chart.bundle.min.js"></script>

        <!-- Jvector map -->
        <script src="../assets/libs/jqvmap/jquery.vmap.min.js"></script>
        <script src="../assets/libs/jqvmap/maps/jquery.vmap.usa.js"></script>

        <!-- Datatable js -->
        <script src="../assets/libs/datatables.net/js/jquery.dataTables.min.js"></script>
        <script src="../assets/libs/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
        <script src="../assets/libs/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
        <script src="../assets/libs/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>

        <!-- Dashboard Init JS -->
        <script src="../assets/js/jquery.dashboard.js"></script>

        <!-- App js -->
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>
        <script>
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