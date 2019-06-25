<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="cn.sudt.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-药品信息</title>
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
                            <h4 class="header-title">药品信息</h4>

                            <table id="datatable-buttons" class="table table-striped table-bordered dt-responsive nowrap">
                                <thead>
                                    <tr>
                                        <th>编号</th>
                                        <th>名称</th>
                                        <th>分类</th>
                                        <th>剂型</th>
                                        <th>批准文号</th>
                                        <th>价格</th>
                                        <th>生产日期</th>
                                        <th>失效日期</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>

                                <tbody>
                                <c:forEach var="p" items="${list}" varStatus="status"> 
                                <tr>
                                    <td>${p.drug_id}</td>
                                    <td>${p.drug_name}</td>
                                    <td>${p.drug_class}</td>
                                    <td>${p.drug_type}</td>
                                    <td>${p.drug_number}</td>
                                    <td>${p.drug_price}</td>
                                    <td>${p.drug_date}</td>
                                    <td>${p.drug_expdate}</td>
                                   
                                    <td>
                                   		<a href="/PYCS/drug_detail_servlet?id=${p.drug_id}" class="btn btn-info">
											<i class="dripicons-document"></i> <span>详细</span>
										</a>
										<a href="/PYCS/cart_servlet_a?id2=${p.drug_id}" class="btn btn-info" onclick="return sures()">
											<i class="dripicons-document"></i> <span>售出</span>
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
        <script src="/PYCS/assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- KNOB JS -->
        <script src="/PYCS/assets/libs/jquery-knob/jquery.knob.min.js"></script>
        <!-- Chart JS -->
        <script src="/PYCS/assets/libs/chart.js/Chart.bundle.min.js"></script>

        <!-- Jvector map -->
        <script src="/PYCS/assets/libs/jqvmap/jquery.vmap.min.js"></script>
        <script src="/PYCS/assets/libs/jqvmap/maps/jquery.vmap.usa.js"></script>

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
        <script type="text/javascript"> 
	function sures() 
	{ 
		if(confirm('您将会售出一件药品，确认继续？'))
		{ 
			return true; 
		}
		else
		{ 
			return false; 
		} 
	}
	</script>
</body>
</html>