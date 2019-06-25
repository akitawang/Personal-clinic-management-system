<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="cn.sdut.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-门诊处方</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="../assets/images/favicon.ico">

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
		<c:forEach items="${list}" var="p" varStatus="status">
        <!-- Form row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="card-box">
                            <h4 class="m-t-0 header-title">药品添加</h4>
                            <p class="text-muted m-b-30 font-13">
                                	请准确填写 <code class="highlighter-rouge">药品</code> 的 <code class="highlighter-rouge">名称编号等信息</code>，带有*标记的内容必须填写，其他可不填。
                            </p>

                            <form action="/PYCS/drug_modify_b" method="post" onsubmit="return verify()">
                                <div class="form-row">
                                
                                	 <div class="form-group col-md-3">
                                        <label for="name" class="col-form-label">药品编号<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value="${p.drug_id}" placeholder="${p.drug_id}" id="drugid" readonly unselectable="on" required name="drugid" placeholder="请输入药品编号">
                                    </div>
                                	
                                    <div class="form-group col-md-3">
                                        <label for="name" class="col-form-label">药品名称<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value="${p.drug_name}" id="dname" readonly unselectable="on" required name="dname" placeholder="请输入药品名称">
                                    </div>
                                    
                                     <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">批准文号<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value="${p.drug_number}" id="apnumber" readonly unselectable="on" required name="apnumber" placeholder="请输入药品批准文号">
                                    </div>
                                    
                                    
                                </div>
                                
                                <div class="form-row">
                                <div class="form-group col-md-3">
                                        <label for="bloodtype" class="col-form-label">数量(单位：千克)<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value="${p.drug_stock}" id="amount" required name="amount" placeholder="请输入药品数量">
                                </div>
                                <div class="form-group col-md-3">
                                        <label for="bloodtype" class="col-form-label">价格(单位：元)<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" value="${p.drug_price}" id="price" required name="price" placeholder="请输入药品价格">
                                </div>
                                
                              
                               
                                
								</div>
								 <div class="form-group">
                                            <label>药品日期<span class="text-danger">*</span></label>
                                            <div>
                                                <div class="input-daterange input-group" id="date-range">
                                                    <input type="text" class="form-control" value="${p.drug_date}" readonly unselectable="on" required name="start" placeholder="请输入药品生产日期"/>
                                                    <input type="text" class="form-control" value="${p.drug_expdate}" readonly unselectable="on" required name="end" placeholder="请输入药品失效日期"/>
                                                </div>
                                            </div>
                                        </div>
								
								<div class="form-group">
                                    <label for="inputAddress" class="col-form-label">生产厂家<span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" value="${p.drug_factory}" readonly unselectable="on" id="manufacturer" required name="manufacturer" placeholder="请输入生产厂家">
                                </div>  
                                
                                <div class="form-group">
                                <p class="mb-1 mt-4 font-weight-medium text-muted">药品说明<span class="text-danger">*</span></p>
                                  <textarea id="explain" name="explain"  required class="form-control" maxlength="200" rows="3" placeholder="请简要说明药品信息（200字以内）">${p.drug_instruction}</textarea>
                                </div>
                                <div class="form-group">
                                <p class="mb-1 mt-4 font-weight-medium text-muted">药品功效<span class="text-danger">*</span></p>
                                  <textarea id="effect" name="effect" required class="form-control" maxlength="200" rows="3" placeholder="请输入药品功效（200字以内）">${p.drug_function}</textarea>
                                </div>
                                
                                <div class="form-row">
                                
                                </div>
                                
                                <div class="form-group">
                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input class="form-check-input" value="a" id="check" type="checkbox"> 我已对上述信息复核
                                        </label>
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary">提交</button>
                            </form>
                            
                        </div> <!-- end card-box -->
                    </div> <!-- end col -->
                </div>
                </c:forEach>
                <!-- end row -->
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

        <!-- Init Js file -->
        <script src="/PYCS/assets/js/jquery.form-advanced.js"></script>

        <!-- App js -->
        <script src="/PYCS/assets/js/jquery.core.js"></script>
        <script src="/PYCS/assets/js/jquery.app.js"></script>
        <!-- Toastr js -->
        <script src="/PYCS/assets/libs/jquery-toast-plugin/jquery.toast.min.js"></script>
        <script src="/PYCS/assets/js/jquery.toastr.js"></script>
        
       <script>
        	
        	 function verify() {
        		 
        		 var isChecked = $('#check').prop('checked');
        		 if(isChecked){
        			 return true;
        		 }
        		 else{
        			 
        			 $.NotificationApp.send("发生错误！", "您未勾选‘我已对上述信息复核’选择框", 'top-right', '#bf441d', 'error');
        			 return false;
        		 }
        		 
        		
        	 }
        	 
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