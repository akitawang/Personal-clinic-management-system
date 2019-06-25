<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*"   %> 
<%@ page import="cn.sdut.util.*"   %> 
<%@ page import="cn.sdut.Pclass.*"   %> 
<%@ page import="cn.sdut.dao.*"   %> 
<%@ page import="cn.sdut.dao.impl.*"   %>  

<!DOCTYPE html>
<html lang="en">



    <head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-医生信息管理</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />

        <!-- App favicon -->
        <link rel="shortcut icon" href="../assets/images/favicon.ico">

        <!-- DataTables -->
        <link href="../assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css"/>
        <link href="../assets/libs/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css" rel="stylesheet" type="text/css"/>
        <link href="../assets/libs/datatables.net-buttons-bs4/css/buttons.bootstrap4.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/datatables.net-select-bs4/css/select.bootstrap4.min.css" rel="stylesheet" type="text/css" />

        <!-- Icons css -->
        <link href="../assets/libs/@mdi/font/css/materialdesignicons.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/dripicons/webfont/webfont.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css" />

        <!-- App css -->
        <!-- build:css -->
        <link href="../assets/css/app.css" rel="stylesheet" type="text/css" />
        <!-- endbuild -->

    </head>

    <body>

        <!-- Navigation Bar-->
                <!-- 导入导航侧边栏 -->
    	<%@include file="/Mainpages/nav.jsp" %>


        <div class="wrapper">
            <div class="container-fluid">

                


                <div class="row">
                    <div class="col-12">
                        <div class="card-box">
                            <h4 class="header-title">医生信息表</h4>
                            
                   
                            
                            <p class="text-muted font-13 m-b-30">
                                 	本页面显示当前数据库内所有已添加的医生信息。
                                 	  </p>

<%

DoctorDAOImpl dao=new DoctorDAOImpl();

List<doctor> bean1=null;
bean1=dao.getAlldoctor();
System.out.print(bean1.size());
%>

        

                            <table id="datatable" class="table table-bordered dt-responsive nowrap">
                                <thead>
                                <tr>
                                    <th>姓名</th>
                                    <th>账号</th>
                                    <th>科室</th>
                                    <th>入职时间</th>
                                    <th>员工编号</th>
                                    <th>电话号码</th>
                                    
                                   
                                      
                                  
                                           
                                </tr>
                                </thead>


                                <tbody>
                                
                          
                          <%
                          
                          for(int i=0; i<bean1.size();i++)
                  		{
                  			doctor bean = bean1.get(i);
                  			//System.out.println(i);
                  			
                  		
                  	
                  		%>




                                <tr>
                               
                                
                                    <td> <%=bean.getDoctor_name()%></td>
      
                                    <td id="username">
                                     <%=bean.getDoctor_num()%>
                                     </td>
                                    <td> <%=bean.getDoctor_dep()%></td>
                                  <td> <%=bean.getDoctor_time().substring(6,bean.getDoctor_time().length())%>/<%=bean.getDoctor_time().substring(0,5)%></td>
                                    <td><%=bean.getDoctor_id()%></td>
                                      <td><%=bean.getDoctor_phone()%></td>
                    
                                        
                                    
                                        
                                </tr>

 <%
                	}
        %>   	
                               
                                
                          
                             
                                </tbody>
                            </table>
                        </div> <!-- end card-box -->
                    </div> <!-- end col -->
                </div> <!-- end row -->


               

               
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div> <!-- end row -->

            </div> <!-- end container -->
        </div>
        <!-- end wrapper -->


        <!-- Footer -->
        <footer class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 text-center">
                      
                    </div>
                </div>
            </div>
        </footer>
        <!-- End Footer -->


        <!-- Right Sidebar -->
        <div class="right-bar">
            <div class="rightbar-title">
                <a href="javascript:void(0);" class="right-bar-toggle float-right">
                    <i class="dripicons-cross noti-icon"></i>
                </a>
                <h5 class="m-0">Settings</h5>
            </div>
            <div class="slimscroll-menu">
                <!-- User box -->
                <div class="user-box">
                    <div class="user-img">
                        <img src="../assets/images/users/avatar-1.jpg" alt="user-img" title="Mat Helme" class="rounded-circle img-fluid">
                        <a href="" class="user-edit"><i class="mdi mdi-pencil"></i></a>
                    </div>
                    
                    <h5><a href="#">Agnes Kennedy</a> </h5>
                    <p class="text-muted mb-0"><small>Admin Head</small></p>
                </div>

               

            
             


        <!-- jQuery  -->
        <script src="../assets/libs/jquery/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- Datatable js -->
        <script src="../assets/libs/datatables.net/js/jquery.dataTables.min.js"></script>
        <script src="../assets/libs/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
        <script src="../assets/libs/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
        <script src="../assets/libs/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>
        <!-- Buttons examples -->
        <script src="../assets/libs/datatables.net-buttons/js/dataTables.buttons.min.js" type="text/javascript"></script>
        <script src="../assets/libs/datatables.net-buttons/js/buttons.html5.min.js" type="text/javascript"></script>
        <script src="../assets/libs/datatables.net-buttons/js/buttons.flash.min.js" type="text/javascript"></script>
        <script src="../assets/libs/datatables.net-buttons/js/buttons.print.min.js" type="text/javascript"></script>
        <script src="../assets/libs/datatables.net-buttons/js/buttons.colVis.min.js" type="text/javascript"></script>
        <script src="../assets/libs/datatables.net-buttons-bs4/js/buttons.bootstrap4.min.js" type="text/javascript"></script>
        <!-- Key Tables -->
        <script src="../assets/libs/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
        <!-- Selection table -->
        <script src="../assets/libs/datatables.net-select/js/dataTables.select.min.js"></script>

        <!-- App js -->
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>

        <script type="text/javascript">
            $(document).ready(function() {

                // Default Datatable
                $('#datatable').DataTable({
                    keys: true
                });

                //Buttons examples
                var table = $('#datatable-buttons').DataTable({
                    lengthChange: false,
                    buttons: ['copy', 'print']
                });

                // Multi Selection Datatable
                $('#selection-datatable').DataTable({
                    select: {
                        style: 'multi'
                    }
                });

                table.buttons().container()
                        .appendTo('#datatable-buttons_wrapper .col-md-6:eq(0)');
            } );

        </script>
    </body>
</html>
