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
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>


<%
	
// 	List<Book> cart = (List<Book>) session.getAttribute("cart");

	doctor user1 = (doctor)session.getAttribute("user1");
	if(user1==null)
	{
		response.setHeader("refresh", "0;url=/PYCS/loginpages/login.jsp");
	}
	
	
	else
	{
%>




<!-- Navigation Bar-->
        <header id="topnav">
            <nav class="navbar-custom">

                <div class="container-fluid">
                    <ul class="list-unstyled topbar-right-menu float-right mb-0">

    
                        <li class="dropdown notification-list">
                            <a class="nav-link dropdown-toggle nav-user" data-toggle="dropdown" href="#" role="button"
                                aria-haspopup="false" aria-expanded="false">
                                <img src="" alt="user" class="rounded-circle"> <span class="ml-1"> <%=user1.getDoctor_name()%> <i class="mdi mdi-chevron-down"></i> </span>
                            	<!-- 插入用户图片及用户名 -->
                            </a>
                            <div class="dropdown-menu dropdown-menu-right dropdown-menu-animated profile-dropdown ">
                                <!-- item-->
                                <div class="dropdown-item noti-title">
                                    <h6 class="text-overflow m-0">欢迎 !</h6>
                                </div>
    
                                <!-- item-->
                                <a href="javascript:void(0);" class="dropdown-item notify-item">
                                    <i class="dripicons-user"></i> <span>我的账户</span>
                                </a>
    
                                <!-- item-->
                                <a href="javascript:void(0);" class="dropdown-item notify-item">
                                    <i class="dripicons-gear"></i> <span>设置</span>
                                </a>
    
                                <!-- item-->
                                <a href="javascript:void(0);" class="dropdown-item notify-item">
                                    <i class="dripicons-help"></i> <span>支持</span>
                                </a>
    
                                
    
                                <!-- item-->
                                <a href="/PYCS/Doctor_out;" class="dropdown-item notify-item">
                                 <i class="dripicons-power"></i> <span>注销</span>
                                </a>
    
                            </div>
                        </li>
                        
    
                    </ul>
    <!-- 主页最上面一堆没用的东西
                    <ul class="list-inline menu-left mb-0">
                        <li class="float-left">
                            <a href="index.html" class="logo">
                                <span class="logo-lg">
                                    <img src="assets/images/logo.png" alt="" height="20">
                                </span>
                                <span class="logo-sm">
                                    <img src="assets/images/logo_sm.png" alt="" height="28">
                                </span>
                            </a>
                        </li>
		                        
		                        <li class="app-search">
		                            <form>
		                                <input type="text" placeholder="Search..." class="form-control">
		                                <button type="submit" class="sr-only"></button>
		                            </form>
		                        </li> 
		                        
                    </ul>
       -->
                    
                    <ul class="navigation-menu">

                            <li class="has-submenu">
                                <a href="index.jsp"><i class="mdi mdi-view-dashboard"></i>主页</a>
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="mdi mdi-atom"></i>看病就诊</a>
 
                                <ul class="submenu">
                                    <li>
                                        <li><a href="create_prescription.jsp">病例处方</a></li>
                                    </li>      
                                    <li class="has-submenu">
                                        <a href="#">挂号管理</a>
                                        <ul class="submenu">
                                            <li><a href="chart-flot.html">门诊挂号</a></li>
                                            <li><a href="chart-chartist.html">当前排队信息</a></li>
                                            <li><a href="chart-chartjs.html">挂号删除</a></li>
                                        </ul>
                                    </li>    
                                    <li >
                                        <a href="/PYCS/Allcases_search">病例管理</a>
                                        
                                    </li>      
                                </ul>
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class=" mdi mdi-account-location"></i>客户管理</a>
                                <ul class="submenu">
                                    <li><a href="email-inbox.html">客户信息修改</a></li>
                                    <li><a href="email-read.html">客户信息查询</a></li>
                                    <li><a href="email-compose.html">客户删除</a></li>
                                </ul>
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="mdi mdi-cube-outline"></i>药品管理</a>
                                <ul class="submenu">
                                    <li>
                                        <a href="calendar.html">药品添加入库</a>
                                        <a href="calendar.html">药品信息修改</a>
                                        <a href="calendar.html">药品库存查询</a>
                                        <a href="calendar.html">药品下架</a>
                                        <a href="calendar.html">药品预警</a>
                                    </li>      
                                      
                                </ul>
                            </li>

                           

                            <li class="has-submenu">
                                <a href="#"><i class="mdi mdi-file-multiple"></i>数据统计</a>
                                <ul class="submenu">
                                    <li><a href="pages-invoice.html">诊所收支统计</a></li>
                                    <li><a href="pages-pricing.html">门诊日志</a></li>
                                    <li><a href="pages-starter.html">药品销售统计</a></li>
                                </ul>
                            </li>
                            <li class="has-submenu">
                                <a href="#"><i class="mdi mdi-airplay"></i>关于系统</a>
                                <ul class="submenu">
                                    <li><a  href="pages-invoice.html">系统使用指南</a></li>
                                    <li><a  href="pages-pricing.html">关于我们</a></li>
                                </ul>
                            </li>
                            

                        </ul>
               
				</div>
            </nav>
            </header>
            <!-- end topbar-main -->
		
		<!-- Footer -->
        <footer class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 text-center">
                        2019 © PCMS. - 个人诊所管理系统   软件工程项目
                    </div>
                </div>
            </div>
        </footer>
        <!-- End Footer -->

<%} %>


</body>
</html>