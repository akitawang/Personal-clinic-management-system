<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="cn.sdut.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>个人门诊管理系统</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta
	content="A fully featured admin theme which can be used to build CRM, CMS, etc."
	name="description" />
<meta content="Coderthemes" name="author" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- App favicon -->
<link rel="shortcut icon" href="../assets/images/favicon.ico">

<!-- jvectormap -->
<link href="/PYCS/assets/libs/jqvmap/jqvmap.min.css" rel="stylesheet" />

<!-- DataTables -->
<link
	href="/PYCS/assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="/PYCS/assets/libs/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css"
	rel="stylesheet" type="text/css" />

<!-- Icons css -->
<link href="/PYCS/assets/libs/@mdi/font/css/materialdesignicons.min.css"
	rel="stylesheet" type="text/css" />
<link href="/PYCS/assets/libs/dripicons/webfont/webfont.css"
	rel="stylesheet" type="text/css" />
<link
	href="/PYCS/assets/libs/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet" type="text/css" />

<!-- App css -->
<!-- build:css -->
<link href="/PYCS/assets/css/app.css" rel="stylesheet" type="text/css" />
<link href="/PYCS/assets/css/new.css" rel="stylesheet" type="text/css" />
<!-- endbuild -->
</head>

<body>

	<!-- 导入导航侧边栏 -->
	<%@include file="/Mainpages/nav.jsp"%>

            <div class="wrapper">
            <div class="container-fluid">
  
               <div class="row">
                    <div class="col-12">
                        <div class="card-box">
                            <h4 class="header-title">日志信息</h4>

                            <table id="datatable-buttons" class="table table-striped table-bordered dt-responsive nowrap">
                                <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>操作对象</th>
                                        <th>描述</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>

                                <tbody>
                                <c:forEach var="p" items="${list}" varStatus="status"> 
                                <tr>
                                    <td>${p.log_id}</td>
                                    <td>${p.log_type}</td>
                                    <td>${p.log_description}</td>
                                    <td>
                                   		<a href="/PYCS/Log_del?id=${p.log_id}" class="btn btn-info">
											<i class="dripicons-document"></i> <span>删除记录</span>
										</a>
                                    </td>
                                </tr>
                                </c:forEach>
                           
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!-- end row -->

            </div> <!-- end container -->
        </div>
        <!-- end wrapper -->
                   

	<!-- jQuery  -->
	<script src="/PYCS/assets/libs/jquery/jquery.min.js"></script>
	<script src="/PYCS/assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="../assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

	<!-- KNOB JS -->
	<script src="/PYCS/assets/libs/jquery-knob/jquery.knob.min.js"></script>
	<!-- Chart JS -->
	<script src="/PYCS/assets/libs/chart.js/Chart.bundle.min.js"></script>

	<!-- Jvector map -->
	<script src="/PYCS/assets/libs/jqvmap/jquery.vmap.min.js"></script>
	<script src="/PYCS/assets/libs/jqvmap/maps/jquery.vmap.usa.js"></script>

	<!-- Datatable js -->
	<script
		src="/PYCS/assets/libs/datatables.net/js/jquery.dataTables.min.js"></script>
	<script
		src="/PYCS/assets/libs/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="/PYCS/assets/libs/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="/PYCS/assets/libs/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>

	<!-- Dashboard Init JS -->
	<script src="/PYCS/assets/js/jquery.dashboard.js"></script>

	<!-- App js -->
	<script src="/PYCS/assets/js/jquery.core.js"></script>
	<script src="/PYCS/assets/js/jquery.app.js"></script>
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

        table.buttons().container()
                .appendTo('#datatable-buttons_wrapper .col-md-6:eq(0)');
    } );


	</script>
</body>
</html>