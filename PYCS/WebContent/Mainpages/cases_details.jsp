<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="cn.sdut.Pclass.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-病例处方</title>
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
    
    	<c:forEach var="U" items="${list}" varStatus="status"> 

         <!-- 导入导航侧边栏 -->
    	<%@include file="/Mainpages/nav.jsp" %>

		<div class="wrapper">
            <div class="container-fluid">
		
        <!-- Form row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="card-box">
                            <h4 class="m-t-0 header-title">${U.case_name}的病例</h4>
                            
                            <p class="text-muted m-b-30 font-13">
                                	本页面展示患者单个病例。
                            </p>

                           
                                <div class="form-row">
                                    <div class="form-group col-md-3">
                                        <label for="name" class="col-form-label">姓名<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control"  required name="name" disabled="" placeholder="${U.case_name}">
                                    </div>
                                    <div class="form-group col-md-2">
                                        <label for="gender" class="col-form-label">性别<span class="text-danger">*</span></label>
                                    	<input type="text" class="form-control"  required name="name" disabled="" placeholder="${U.case_sex}">
									</div>
                                   
                                    <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">电话号码<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="phone" required  disabled="" name="phone" placeholder="${U.case_phone}">
                                    </div>
                                    <div class="form-group col-md-3">
                                        <label for="bloodtype" class="col-form-label">血型</label>
                                        <input type="text" class="form-control" id="bloodtype"  disabled="" name="bloodtype" placeholder="${U.case_type}">
                                    </div>
                                </div>
                                <div class="form-row">
                                <div class="form-group col-md-3">
                                   <label>出生日期<span class="text-danger">*</span></label>
                                   <div>
                                       <div class="input-group">
                                           <input type="text" class="form-control" required  disabled="" placeholder="${U.case_birth}" name="birth" >
                                           <div class="input-group-append">
                                           		<span class="input-group-text"><i class="mdi mdi-calendar"></i></span>
                                           </div>
                                       </div>
                                    </div>
                                </div>
                                <div class="form-group col-md-3">
                                   <label>建档日期<span class="text-danger">*</span></label>
                                   <div>
                                       <div class="input-group">
                                           <input type="text" class="form-control" required  disabled="" placeholder="${U.case_currentdate}" name="birth" >
                                           <div class="input-group-append">
                                           		<span class="input-group-text"><i class="mdi mdi-calendar"></i></span>
                                           </div>
                                       </div>
                                    </div>
                                </div>
                                <div class="form-group col-md-2">
                                        <label for="bloodtype" class="col-form-label">体重(单位：千克)</label>
                                        <input type="text" class="form-control" id="weight" disabled="" name="weight" placeholder="${U.case_weight}">
                                </div>
                                <div class="form-group col-md-2">
                                        <label for="bloodtype" class="col-form-label">身高(单位：厘米)</label>
                                        <input type="text" class="form-control" id="height" disabled="" name="height" placeholder="${U.case_height}">
                                </div>
								</div>

                                
                                <div class="form-group">
                                    <label for="inputAddress" class="col-form-label">家庭住址</label>
                                    <input type="text" class="form-control" id="address" disabled="" name="address" placeholder="${U.case_address}">
                                </div>
                                <div class="form-group">
                                    <label for="allergy" class="col-form-label">过敏史<span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" required id="allergy" disabled="" name="allergy" placeholder="${U.case_allergy}">
                                </div>
                                <div class="form-group">
                                <p class="mb-1 mt-4 font-weight-medium text-muted">患者症状<span class="text-danger">*</span><span class="text-danger">*</span></p>
                                  <textarea id="symptom" name="symptom" required disabled="" class="form-control" maxlength="200" rows="3" placeholder="${U.case_symptom}"></textarea>
                                </div>
                                <div class="form-group">
                                <p class="mb-1 mt-4 font-weight-medium text-muted">诊断信息<span class="text-danger">*</span></p>
                                  <textarea id="info" name="info" required disabled="" class="form-control" maxlength="200" rows="3" placeholder="${U.case_info}"></textarea>
                                </div>
                                
                                <div class="form-row">
                                
                                <div class="col-md-4">
	                        		<div class="card m-b-30">
		                            	<div class="card-header">
		                                	检查项目<span class="text-danger">*</span>
		                            	</div>
		                            	<div class="card-body">
			                                <div class="card-body">
				                                <blockquote class="card-bodyquote mb-2">
				                                    <textarea required id="item" disabled="" name="item" class="form-control" maxlength="200" rows="3" placeholder="${U.case_item}"></textarea>
				                                    <footer>请务必仔细填写本区域内容
				                                    </footer>
				                                </blockquote>
		                            		</div>
		                            	</div>
	                        		</div> <!-- end card-box-->
                    			</div> <!-- end col -->
                                
                                <div class="col-md-4">
	                        		<div class="card m-b-30">
		                            	<div class="card-header">
		                                	处方<span class="text-danger">*</span>
		                            	</div>
		                            	<div class="card-body">
			                                <div class="card-body">
			                                <blockquote class="card-bodyquote mb-2">
			                                    <textarea required id="pre" name="pre" disabled="" class="form-control" maxlength="200" rows="3" placeholder="${U.case_pre}"></textarea>
			                                    <footer>请务必仔细填写本区域内容
			                                    </footer>
			                                </blockquote>
		                            		</div>
		                            	</div>
	                        		</div> <!-- end card-box-->
                    			</div> <!-- end col -->
                                
                                <div class="col-md-4">
	                        		<div class="card m-b-30">
		                            	<div class="card-header">
		                                	医嘱<span class="text-danger">*</span>
		                            	</div>
		                            	<div class="card-body">
		                            		<div class="card-body">
			                                <blockquote class="card-bodyquote mb-2">
			                                    <textarea required id="advice" name="advice" disabled="" class="form-control" maxlength="200" rows="3" placeholder="${U.case_advice}"></textarea>
			                                    <footer>请务必仔细填写本区域内容
			                                    </footer>
			                                </blockquote>
			                                </div>
		                            	</div>
	                        		</div> <!-- end card-box-->
                    			</div> <!-- end col -->
                                
                                </div>
                                <div class="form-group row">
                                    <div class="col-8 offset-5">
                                    	<a href="/PYCS/Case_rectify_index?num=${U.case_num}" class="btn btn-primary waves-effect waves-light">
											<span> 修改该病例</span>
										</a>
										<a href="/PYCS/Case_delete?num=${U.case_num}" onclick="return verify()"class="btn btn-danger waves-effect m-l-5">
											<span> 删除该病例</span>
										</a>
                                        
                                    </div>
                                </div>
                                
                                
                          
                           
                        </div> <!-- end card-box -->
                    </div> <!-- end col -->
                </div>
                <!-- end row -->
                
				</div><!-- end container -->
			
			</div> <!-- end wrapper -->
			
			</c:forEach>
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

        <!-- App js -->
        <script src="/PYCS/assets/js/jquery.core.js"></script>
        <script src="/PYCS/assets/js/jquery.app.js"></script>
        
        <!-- Sweet Alert Js  -->
        <script src="/PYCS/assets/libs/sweetalert2/sweetalert2.min.js"></script>
        <script src="/PYCS/assets/js/jquery.sweet-alert.init.js"></script>
        
        <!-- Toastr js -->
        <script src="/PYCS/assets/libs/jquery-toast-plugin/jquery.toast.min.js"></script>
        <script src="/PYCS/assets/js/jquery.toastr.js"></script>
        

        <script>
        
        	function verify(){
        		if(confirm("该操作不可恢复，您确认删除该条记录？")){
        			return true;
        		}
        		else{
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