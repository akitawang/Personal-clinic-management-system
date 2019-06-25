<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<link href="../assets/libs/jqvmap/jqvmap.min.css" rel="stylesheet" />

<!-- DataTables -->
<link
	href="../assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets/libs/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css"
	rel="stylesheet" type="text/css" />

<!-- Icons css -->
<link href="../assets/libs/@mdi/font/css/materialdesignicons.min.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/libs/dripicons/webfont/webfont.css"
	rel="stylesheet" type="text/css" />
<link href="../assets/libs/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet" type="text/css" />

<!-- App css -->
<!-- build:css -->
<link href="../assets/css/app.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/new.css" rel="stylesheet" type="text/css" />
<!-- endbuild -->

</head>

<body>

	<!-- 导入导航侧边栏 -->
	<%@include file="/Mainpages/nav.jsp"%>


	<div class="contain1">
		<div class="wrapper">
			<div class="container-fluid">
				<div class="card-box">
					<h4 class="m-t-0 m-b-30 header-title">密码修改</h4>
					<form action="/PYCS/password_servlet" method="post" onsubmit="return verify()"  class="form-horizontal">
					
						<div class="form-group row">
							<label for="inputPassword3" class="col-sm-3 col-form-label">原密码</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="inputPassword1" name="inputPassword1"
									placeholder="Password">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPassword3" class="col-sm-3 col-form-label">新密码</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="inputPassword3" name="inputPassword3"
									placeholder="Password">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPassword5" class="col-sm-3 col-form-label">确认密码</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="inputPassword5" 
									placeholder="Retype Password">
							</div>
						</div>

						<div class="form-group mb-0 justify-content-end row">
							<div class="col-sm-9">
								<button type="submit"
									class="btn btn-info waves-effect waves-light" >确认</button>
							</div>
						</div>
					</form>
				</div>
				<!-- end card-box -->

			</div>
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
	<script
		src="../assets/libs/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="../assets/libs/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="../assets/libs/datatables.net-responsive-bs4/js/responsive.bootstrap4.min.js"></script>

	<!-- Dashboard Init JS -->
	<script src="../assets/js/jquery.dashboard.js"></script>
	 <!-- Toastr js -->
        <script src="/PYCS/assets/libs/jquery-toast-plugin/jquery.toast.min.js"></script>
        <script src="/PYCS/assets/js/jquery.toastr.js"></script>
	<!-- App js -->
	<script src="../assets/js/jquery.core.js"></script>
	<script src="../assets/js/jquery.app.js"></script>
	<script>
		function verify(){
			
			var psw=document.getElementById("inputPassword3").value;
			var pswv=document.getElementById("inputPassword5").value;
			
			if(psw==pswv){
				
				return true;
			}
			else{
				 $.NotificationApp.send("发生错误！", "两次密码输入不一致", 'top-right', '#bf441d', 'error');
    			 return false;
			}
			

		}
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