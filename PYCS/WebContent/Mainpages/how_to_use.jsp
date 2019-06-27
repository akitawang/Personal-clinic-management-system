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

                <div class="row justify-content-center">
                    <div class="col-xl-9">
                        <div class="text-center">
                            <h3 class="m-b-30 m-t-20">关于我们</h3>
                        </div>

                        <div class="row m-t-50">

                            <!--Pricing Column-->
                            <article class="pricing-column col-lg-4 col-md-4">
                                <div class="inner-box card-box">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">Starter Pack</h3>
                                        <h2 class="plan-price mt-3 mb-3">$19</h2>
                                        <div class="plan-duration">Per Month</div>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>10 GB Storege</li>
                                        <li>500 GB Bandwidth</li>
                                        <li>No Domain</li>
                                        <li>1 User</li>
                                        <li>Email Support</li>
                                        <li>24x7 Support</li>
                                    </ul>

                                    <div class="text-center">
                                        <a href="#" class="btn btn-info btn-rounded w-lg">Choose</a>
                                    </div>
                                </div>
                            </article>


                            <!--Pricing Column-->
                            <article class="pricing-column col-lg-4 col-md-4">
                                <div class="inner-box card-box ribbon-box">
                                    <div class="ribbon-two ribbon-two-primary price-ribbon"><span>POPULAR</span></div>
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">Professional Pack</h3>
                                        <h2 class="plan-price mt-3 mb-3">$29</h2>
                                        <div class="plan-duration">Per Month</div>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>50 GB Storege</li>
                                        <li>900 GB Bandwidth</li>
                                        <li>1 Domain</li>
                                        <li>20 User</li>
                                        <li>Email Support</li>
                                        <li>24x7 Support</li>
                                    </ul>

                                    <div class="text-center">
                                        <a href="#" class="btn btn-danger btn-rounded w-lg">Choose</a>
                                    </div>
                                </div>
                            </article>


                            <!--Pricing Column-->
                            <article class="pricing-column col-lg-4 col-md-4">
                                <div class="inner-box card-box">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">Enterprise Pack</h3>
                                        <h2 class="plan-price mt-3 mb-3">$39</h2>
                                        <div class="plan-duration">Per Month</div>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>100 GB Storege</li>
                                        <li>2000 GB Bandwidth</li>
                                        <li>10 Domain</li>
                                        <li>1000 User</li>
                                        <li>Email Support</li>
                                        <li>24x7 Support</li>
                                    </ul>

                                    <div class="text-center">
                                        <a href="#" class="btn btn-info btn-rounded w-lg">Choose</a>
                                    </div>
                                </div>
                            </article>

                        </div> <!-- end row -->
                    </div><!-- end col -->
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
	
</body>
</html>