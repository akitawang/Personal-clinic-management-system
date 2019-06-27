<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="cn.sdut.Pclass.*"   %> 
<%@ page import="cn.sdut.dao.*"   %> 
<%@ page import="cn.sdut.dao.impl.*"   %> 
<%@ page import="cn.sdut.servlet.*"   %> 

    
     <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>登陆个人门诊管理系统 </title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />

        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- Icons css -->
        <link href="../assets/libs/@mdi/font/css/materialdesignicons.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/dripicons/webfont/webfont.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css" />

        <!-- App css -->
        <!-- build:css -->
        <link href="../assets/css/app.css" rel="stylesheet" type="text/css" />
        <!-- endbuild -->

    </head>

    <body class="bg-account-pages">

        <!-- Login -->
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-12">

                        <div class="wrapper-page">
                            <div class="account-pages">
                                <div class="account-box">

                                    <!-- Logo box-->
                                    <div class="account-logo-box">
                                        <h2 class="text-uppercase text-center">
                                            <a  class="text-success">
                                                <span>登录</span>
                                            </a>
                                        </h2>
                                    </div>

                                    <div class="account-content">
                                  <!--   <form action="/PYCS/Admin_login" method="post">
                                            <div class="form-group mb-3">
                                                <label for="emailaddress" class="font-weight-medium">用户名</label>
                                                <input class="form-control" type="username" id="username" required="" placeholder="请输入您的用户名">
                                            </div>

                                            <div class="form-group mb-3">
                                                <a href="auth-recoverpassword.html" class="text-muted float-right"><small>Forgot your password?</small></a>
                                                <label for="password" class="font-weight-medium">密码</label>
                                                <input class="form-control" type="password" required="" id="password" placeholder="请输入您的密码">
                                            </div>
                                            
											<p class="text-muted font-12 mt-3 mb-2">请选择您的身份</p>
                                            <div class="form-group mb-3">
                                                <div class="radio radio-info form-check-inline">
			                                        <input type="radio" id="inlineRadio1" value="option1" name="radioInline" checked>
			                                        <label for="inlineRadio1">系统管理员 </label>
		                                    	</div>
		                                    	<div class="radio form-check-inline">
			                                        <input type="radio" id="inlineRadio2" value="option2" name="radioInline">
			                                        <label for="inlineRadio2"> 医生 </label>
		                                   		</div>

                                            </div>

                                            <div class="form-group row text-center">
                                                <div class="col-12">
                                                    <button class="btn btn-block btn-success waves-effect waves-light" type="submit">登陆</button>
                                                </div>
                                            </div>
                                        </form> 
 -->




<!-- <form action="/PYCS/Admin_login" method="post"> -->

<!-- 		<input type="text"  name="username" placeholder="请输入学号" required="required" pattern="^[a-zA-Z0-9_]{6,16}$" title="只能是6-11位字母、数字、_" /> -->
<!-- 		<input type="password" name="password" placeholder="请输入密码"  required="required" pattern="^[a-zA-Z0-9_]{6,16}$" title="只能是6-16位字母、数字、_" /> -->
<%-- 		${requestScope.error } --%>
<!-- 		<input type="submit" value="登录" /> -->
<!-- 	</form> -->









 <form action="/PYCS/Admin_login" method="post">
<div class="form-group mb-3">
		<input class="form-control" type="text"  name="username" placeholder="请输入用户名" required="required" pattern="^[a-zA-Z0-9_]{6,16}$" title="只能是6-11位字母、数字、_" />
 		</div>
 		<div class="form-group mb-3">
 		<input class="form-control" type="password" name="password" placeholder="请输入密码"  required="required" pattern="^[a-zA-Z0-9_]{6,16}$" title="只能是6-16位字母、数字、_" /> 
		</div>
		
		<div class="form-group mb-3">
                                                <div class="radio radio-info form-check-inline">
			                                        <input type="radio" id="inlineRadio1" value="option1" name="radioInline" checked>
			                                        <label for="inlineRadio1">系统管理员 </label>
		                                    	</div>
		                                    	<div class="radio form-check-inline">
			                                        <input type="radio" id="inlineRadio2" value="option2" name="radioInline">
			                                        <label for="inlineRadio2"> 医生 </label>
		                                   		</div>

                                            </div>
		
		${requestScope.error } 
 		 <div class="col-12">
                                                    <button class="btn btn-block btn-success waves-effect waves-light" type="submit">登陆</button>
                                                </div>
 	</form>











                                        
                                    </div> <!-- end account-content -->

                                </div> <!-- end account-box -->
                            </div>
                            <!-- end account-page-->
                        </div>
                        <!-- end wrapper-page -->

                    </div> <!-- end col -->
                </div> <!-- end row -->
            </div> <!-- end container -->
        </section>
        <!-- END HOME -->    


        <!-- jQuery  -->
        <script src="../assets/libs/jquery/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- App js -->
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>

    </body>
</html>
