<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统-门诊挂号</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="../assets/images/favicon.ico">

        <!-- jvectormap -->
        <link href="../assets/libs/jqvmap/jqvmap.min.css" rel="stylesheet" />

        <!-- DataTables -->
        <link href="../assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.min.css" rel="stylesheet" type="text/css"/>
        <link href="../assets/libs/datatables.net-responsive-bs4/css/responsive.bootstrap4.min.css" rel="stylesheet" type="text/css"/>

        <!-- Icons css -->
        <link href="../assets/libs/@mdi/font/css/materialdesignicons.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/dripicons/webfont/webfont.css" rel="stylesheet" type="text/css" />
        <link href="../assets/libs/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css" />

        <!-- App css -->
        <!-- build:css -->
        <link href="../assets/css/app.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/new.css" rel="stylesheet" type="text/css" />
        <!-- endbuild -->

    </head>

    <body>

         <!-- 导入导航侧边栏 -->
    	<%@include file="/Mainpages/nav.jsp" %>

		<div class="wrapper">
            <div class="container-fluid">
		
        <!-- Form row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="card-box">
                            <h4 class="m-t-0 header-title">挂号</h4>
                            
                            <p class="text-muted m-b-30 font-13">
                                	请准确填写 <code class="highlighter-rouge">病人</code> 的 <code class="highlighter-rouge">个人信息</code>，带有*标记的内容必须填写，其他可不填。
                            </p>

                            <form action="/PYCS/AddPatient" method="post" onsubmit="return verify()">
                                <div class="form-row">
                                    <div class="form-group col-md-3">
                                        <label for="name" class="col-form-label">姓名<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control"  required name="name" placeholder="请输入 姓名">
                                    </div>
                                    <div class="form-group col-md-2">
                                        <label for="gender" class="col-form-label">性别<span class="text-danger">*</span></label>
                                    <div class="col-sm-15">
                                        <select id="gender" name="gender" class="form-control">
                                            <option>男</option>
                                            <option>女</option>
                                        </select>
									</div>
									</div>
                                   
                                    <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">电话号码<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="phone" required  onkeyup="value=value.replace(/[^\d]/g,'')" name="phone" placeholder="请输入 电话号码">
                                    </div>
                          
                                </div>
                                <div class="form-row">
                                <div class="form-group col-md-3">
                                   <label>出生日期<span class="text-danger">*</span></label>
                                   <div>
                                       <div class="input-group">
                                           <input type="text" class="form-control" required   placeholder="mm/dd/yyyy" name="birth" id="datepicker">
                                           <div class="input-group-append">
                                           		<span class="input-group-text"><i class="mdi mdi-calendar"></i></span>
                                           </div>
                                       </div>
                                    </div>
                                </div>
                                <div class="form-group col-md-2">
                                        <label for="bloodtype" class="col-form-label">体重(单位：千克)</label>
                                        <input type="text" class="form-control" id="weight" onkeyup="value=value.replace(/[^\d]/g,'')" name="weight" placeholder="请输入体重">
                                </div>
                                <div class="form-group col-md-2">
                                        <label for="bloodtype" class="col-form-label">身高(单位：厘米)</label>
                                        <input type="text" class="form-control" id="height" onkeyup="value=value.replace(/[^\d]/g,'')" name="height" placeholder="请输入身高">
                                </div>
                                
                                    <div class="form-group col-md-3">
                                        <label for="inputPassword4" class="col-form-label">身份证号<span class="text-danger">*</span></label>
                                        <input type="text" class="form-control" id="id" required   name="id" placeholder="请输入 15位或18位身份证">
                                    </div>
                                
								</div>

                                
                                <div class="form-group">
                                    <label for="inputAddress" class="col-form-label">家庭住址</label>
                                    <input type="text" class="form-control" id="address" name="address" placeholder="请输入 家庭住址">
                                </div>
                               
                           
                                <div class="form-group">
                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input class="form-check-input" id="check" value="a" type="checkbox"> 我已对上述信息复核
                                        </label>
                                    </div>
                                </div>
                                <button type="submit"  class="btn btn-primary waves-light waves-effect btn-sm" >提交</button>
                            </form>
                           
                        </div> <!-- end card-box -->
                    </div> <!-- end col -->
                </div>
                <!-- end row -->
			</div><!-- end container -->
			
			</div> <!-- end wrapper -->
			
			
        <!-- end contain1(from wrapper) -->


        




        <!-- jQuery  -->
        <script src="../assets/libs/jquery/jquery.min.js"></script>
        <script src="../assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="../assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>

        <!-- select2 js -->
        <script src="../assets/libs/select2/js/select2.min.js"></script>
        <script src="../assets/libs/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>
        <script src="../assets/libs/mohithg-switchery/switchery.min.js"></script>
        <script src="../assets/libs/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
        <!-- Mask input -->
        <script src="../assets/libs/jquery-mask-plugin/jquery.mask.min.js"></script>
        <!-- Bootstrap Select -->
        <script src="../assets/libs/bootstrap-select/js/bootstrap-select.min.js"></script>

        <script src="../assets/libs/bootstrap-timepicker/js/bootstrap-timepicker.min.js"></script>

        <script src="../assets/libs/bootstrap-colorpicker/js/bootstrap-colorpicker.min.js"></script>

        <script src="../assets/libs/moment/moment.js"></script>

        <script src="../assets/libs/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>

        <script src="../assets/libs/bootstrap-daterangepicker/daterangepicker.js"></script>
		<!-- Parsley js -->
        <script type="text/javascript" src="assets/libs/parsleyjs/parsley.min.js"></script>

        <!-- Init Js file -->
        <script src="../assets/js/jquery.form-advanced.js"></script>

        <!-- App js -->
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>
        
       <!-- Toastr js -->
        <script src="/PYCS/assets/libs/jquery-toast-plugin/jquery.toast.min.js"></script>
        <script src="/PYCS/assets/js/jquery.toastr.js"></script>
        

        <script>
        	
        	 function verify() {
        		 
        		 var isChecked = $('#check').prop('checked');
        		 var id = document.getElementById("id").value;
        		 if(id.length == 18 ||id.length == 15)
        		{
        			 if(isChecked){
            			 return false;
            		 }
            		 else{
            			 
            			 $.NotificationApp.send("发生错误！", "您未勾选‘我已对上述信息复核’选择框", 'top-right', '#bf441d', 'error');
            			 return false;
            		 }
        		}
        		 else{
        			 $.NotificationApp.send("您的输入有误！", "身份证有效位数为15或18位", 'top-right', '#bf441d', 'error');
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