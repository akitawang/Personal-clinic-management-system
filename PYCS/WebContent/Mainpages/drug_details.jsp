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

	<div class="contain1" align="center">
		<div class="card-box">
		
			<c:forEach var="p" varStatus="status" items="${list}">

				<div class="row" align="left">
					<div class="col-sm-6 m-t-20">
						<h4 class="m-t-0 header-title">药品信息</h4>
						<dl class="row">
							<dt class="col-sm-3">药品名称</dt>
							<dd class="col-sm-9">${p.drug_name}</dd>

							<dt class="col-sm-3">批准文号</dt>
							<dd class="col-sm-9">${p.drug_number}</dd>

							<dt class="col-sm-3">药品分类</dt>
							<dd class="col-sm-9">
								<p>${p.drug_class}</p>

							</dd>

							<dt class="col-sm-3">药品功效</dt>
							<dd class="col-sm-9">${p.drug_function}</dd>

							<dt class="col-sm-3 text-truncate">药品说明</dt>
							<dd class="col-sm-9">${p.drug_instruction}</dd>

							<dt class="col-sm-3">药品生产日期</dt>
							<dd class="col-sm-9">
								<dl class="row">
									<dd class="col-sm-8">${p.drug_date}</dd>
								</dl>
							</dd>
							<dt class="col-sm-3">药品失效日期</dt>
							<dd class="col-sm-9">
								<dl class="row">
									<dd class="col-sm-8">${p.drug_expdate}</dd>
								</dl>
							</dd>
							<dt class="col-sm-3">药品库存</dt>
							<dd class="col-sm-9">
								<dl class="row">
									<dd class="col-sm-8">${p.drug_stock}</dd>
								</dl>
							</dd>
							<dt class="col-sm-3">药品价格</dt>
							<dd class="col-sm-9">
								<dl class="row">
									<dd class="col-sm-8">${p.drug_price}</dd>
								</dl>
							</dd>
							<dt class="col-sm-3"></dt>
							<dd class="col-sm-9">
								<dl class="row">
									<dd class="col-sm-8">
										<a href="/PYCS/drug_modify_a?id=${p.drug_id}"
											class="btn btn-info"> <i class="dripicons-document"></i>
											<span>修改药品信息</span>
										</a>
										<a href="/PYCS/drug_delete_servlet?id=${p.drug_id}" onclick="return sures()"
											class="btn btn-danger waves-effect m-l-5"> <i class="dripicons-document"></i>
											<span>删除药品信息</span>
										</a>
										
									</dd>
								</dl>
							</dd>

						</dl>

					</div>

					<!-- end col-->
				</div>
			</c:forEach>
			<!-- end row -->

		</div>

		<!-- end card-box-->

	</div>
	<!-- end contain1(from wrapper) -->

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
	function sures() 
	{ 
		if(confirm('确定继续？'))
		{ 
			return true; 
		}
		else
		{ 
			return false; 
		} 
	}
	</script>

	<script>
		$(document).ready(function() {
			// Default Datatable
			$('#datatable').DataTable({
				"pageLength" : 5,
				"searching" : false,
				"lengthChange" : false
			});
		});
	</script>
</body>
</html>