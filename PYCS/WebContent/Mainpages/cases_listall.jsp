<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="cn.sudt.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-查询所有病例</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="/PYCS/assets/images/favicon.ico">

        <!-- jvectormap -->
        <link href="/PYCS/assets/libs/jqvmap/jqvmap.min.css" rel="stylesheet" />

        <!-- DataTables -->
        <link href="/PYCS/assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css"/>
        <link href="/PYCS/assets/libs/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css" rel="stylesheet" type="text/css"/>

        <!-- Icons css -->
        <link href="/PYCS/assets/libs/@mdi/font/css/materialdesignicons.min.css" rel="stylesheet" type="text/css" />
        <link href="/PYCS/assets/libs/dripicons/webfont/webfont.css" rel="stylesheet" type="text/css" />
        <link href="/PYCS/assets/libs/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css" />

        <!-- App css -->
        <!-- build:css -->
        <link href="/PYCS/assets/css/app.css" rel="stylesheet" type="text/css" />
        <link href="/PYCS/assets/css/new.css" rel="stylesheet" type="text/css" />
        <!-- endbuild -->

    </head>

    <body>

         <!-- 导入导航侧边栏 -->
    	<%@include file="/Mainpages/nav.jsp" %>

		<div class="wrapper">
            <div class="container-fluid">
			<div class="row">
                    <div class="col-12">
                        <div class="card-box">
                            <h4 class="header-title">当前所有病例</h4>
                            <p class="text-muted font-13 m-b-50">
                                	本页面显示当前数据库内所有已添加的病例，您可以对其进行更改，删除，查看等操作。
                            </p>
							<table id="datatable" class="table table-bordered dt-responsive nowrap">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>手机号码</th>
                                    <th>出生日期</th>
                                    <th>建档日期</th>
                                    <th>详细</th>
                                </tr>
                                </thead>


                                <tbody>
                                <c:forEach var="U" items="${list}" varStatus="status"> 
                                <tr>
                                    <td>${U.case_num}</td>
                                    <td>${U.case_name}</td>
                                    <td>${U.case_sex}</td>
                                    <td>${U.case_phone}</td>
                                    <td>${U.case_birth}</td>
                                    <td>${U.case_currentdate}</td>
                                    <td>
                                    	<a href="/PYCS/Case_details?id=${U.case_num}" class="btn btn-info">
											<i class="dripicons-document"></i> <span>详细</span>
										</a>
									</td>
                                </tr>
                               </c:forEach>
                                </tbody>
                            </table>
							

                        </div>
                    </div>
                </div> <!-- end row -->
			
        
			</div><!-- end container -->
			
			</div> <!-- end wrapper -->
			
			
        <!-- end contain1(from wrapper) -->


        




        <!-- jQuery  -->
        <script src="/PYCS/assets/libs/jquery/jquery.min.js"></script>
        <script src="/PYCS/assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="/PYCS/assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- select2 js -->
        <script src="/PYCS/assets/libs/select2/js/select2.min.js"></script>
        <script src="/PYCS/assets/libs/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>
        <script src="/PYCS/assets/libs/mohithg-switchery/switchery.min.js"></script>
        <script src="/PYCS/assets/libs/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
        <!-- Mask input -->
        <script src="/PYCS/assets/libs/jquery-mask-plugin/jquery.mask.min.js"></script>
        <!-- Bootstrap Select -->
        <script src="/PYCS/assets/libs/bootstrap-select/js/bootstrap-select.min.js"></script>

        <script src="/PYCS/assets/libs/bootstrap-timepicker/js/bootstrap-timepicker.min.js"></script>

        <script src="/PYCS/assets/libs/bootstrap-colorpicker/js/bootstrap-colorpicker.min.js"></script>

        <script src="/PYCS/assets/libs/moment/moment.js"></script>

        <script src="/PYCS/assets/libs/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>

        <script src="/PYCS/assets/libs/bootstrap-daterangepicker/daterangepicker.js"></script>
		<!-- Parsley js -->
        <script type="text/javascript" src="/PYCS/assets/libs/parsleyjs/parsley.min.js"></script>

        <!-- Init Js file -->
        <script src="/PYCS/assets/js/jquery.form-advanced.js"></script>

        <!-- Datatable js -->
        <script src="/PYCS/assets/libs/datatables.net/js/jquery.dataTables.min.js"></script>
        <script src="/PYCS/assets/libs/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
        <script src="/PYCS/assets/libs/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
        <script src="/PYCS/assets/libs/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>
        <!-- Buttons examples -->
        <script src="/PYCS/assets/libs/datatables.net-buttons/js/dataTables.buttons.min.js" type="text/javascript"></script>
        <script src="/PYCS/assets/libs/datatables.net-buttons/js/buttons.html5.min.js" type="text/javascript"></script>
        <script src="/PYCS/assets/libs/datatables.net-buttons/js/buttons.flash.min.js" type="text/javascript"></script>
        <script src="/PYCS/assets/libs/datatables.net-buttons/js/buttons.print.min.js" type="text/javascript"></script>
        <script src="/PYCS/assets/libs/datatables.net-buttons/js/buttons.colVis.min.js" type="text/javascript"></script>
        <script src="/PYCS/assets/libs/datatables.net-buttons-bs4/js/buttons.bootstrap4.min.js" type="text/javascript"></script>
        <!-- Key Tables -->
        <script src="/PYCS/assets/libs/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
        <!-- Selection table -->
        <script src="/PYCS/assets/libs/datatables.net-select/js/dataTables.select.min.js"></script>

        
        <!-- Toastr js -->
        <script src="/PYCS/assets/libs/jquery-toast-plugin/jquery.toast.min.js"></script>
        <script src="/PYCS/assets/js/jquery.toastr.js"></script>
        

        <script>
        	
        $(document).ready(function() {


            // Multi Selection Datatable
            // Default Datatable
                $('#datatable').DataTable({
                    keys: true
                });


            table.buttons().container()
                    .appendTo('#datatable-buttons_wrapper .col-md-6:eq(0)');
        } );

            
            
          
        </script>
</body>
</html>