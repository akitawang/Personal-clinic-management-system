<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />
        <title>个人门诊管理系统</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="/PYCS/assets/images/favicon.ico">
		<!--calendar css-->
        <link href="/PYCS/assets/libs/fullcalendar/fullcalendar.min.css" rel="stylesheet" />
		
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

		
        <div class="contain1">
         <div class="container-fluid">
         <br/>
                <h1>欢迎使用个人门诊管理系统</h1>   
                 <div class="row">
                    <div class="col-lg-12">

                        <div class="card-box">
                            <div class="row">
                                <div class="col-lg-3">
                                    <a href="#" data-toggle="modal" data-target="#add-category" class="btn btn-lg font-16 btn-primary btn-block waves-effect m-t-20 waves-light">
                                        <i class="mdi mdi-plus-circle-outline"></i> 创建事件
                                    </a>
                                    <div id="external-events" class="m-t-20">
                                        <br>
                                        <p class="text-muted">您可以在本页面创建备忘（当次登陆可用，数据不保存）</p>
                                        <div class="external-event bg-success" data-class="bg-success">
                                            <i class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>普通事件
                                        </div>
                                        <div class="external-event bg-info" data-class="bg-info">
                                            <i class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>特殊事件
                                        </div>
                                        <div class="external-event bg-warning" data-class="bg-warning">
                                            <i class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>强调事件
                                        </div>
                                        <div class="external-event bg-danger" data-class="bg-danger">
                                            <i class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>紧急事件
                                        </div>
                                    </div>

                                    

                                </div> <!-- end col-->
                                <div class="col-lg-9">
                                    <div id="calendar"></div>
                                </div> <!-- end col -->
                            </div>  <!-- end row -->
                        </div> <!-- end card-box-->

                        <!-- BEGIN MODAL -->
                        <div class="modal fade" id="event-modal" tabindex="-1">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header border-bottom-0 d-block">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title">事件</h4>
                                    </div>
                                    <div class="modal-body">

                                    </div>
                                    <div class="modal-footer border-0 pt-0">
                                        <button type="button" class="btn btn-light waves-effect" data-dismiss="modal">关闭</button>
                                        <button type="button" class="btn btn-success save-event waves-effect waves-light">创建</button>
                                        <button type="button" class="btn btn-danger delete-event waves-effect waves-light" data-dismiss="modal">删除</button>
                                    </div> <!-- end modal footer-->
                                </div> <!-- end modal content -->
                            </div> <!-- end modal dialog-->
                        </div>
                        <!-- end modal -->

                        <!-- Modal Add Category -->
                        <div class="modal fade" id="add-category" tabindex="-1">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header border-bottom-0 d-block">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title">创建事件</h4>
                                    </div>
                                    <div class="modal-body p-4">
                                        <form>
                                            <div class="form-group">
                                                <label class="control-label">事件名称</label>
                                                <input class="form-control form-white" placeholder="输入事件名称" type="text" name="category-name"/>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label">选择事件状态</label>
                                                <select class="form-control form-white" data-placeholder="Choose a color..." name="category-color">
                                                    <option value="primary">普通</option>
                                                    <option value="success">完成</option>
                                                    <option value="danger">紧急</option>
                                                    
                                                    <option value="warning">警告</option>
                                                   
                                                </select>
                                            </div>

                                        </form>

                                        <div class="text-right">
                                            <button type="button" class="btn btn-light waves-effect" data-dismiss="modal">关闭</button>
                                            <button type="button" class="btn btn-primary ml-1 waves-effect waves-light save-category" data-dismiss="modal">保存</button>
                                        </div>
                                    </div> <!-- end modal body-->
                                </div> <!-- end modal content -->
                            </div> <!-- end modal dialog-->
                        </div>
                        <!-- END MODAL -->
                    </div>
                    <!-- end col-12 -->
                </div> <!-- end row -->
			</div> <!-- end container -->
        </div>
        <!-- end contain1(from wrapper) -->
 <div class="wrapper">
           

               

               

            
        </div>
        <!-- end wrapper -->


        




        <!-- jQuery  -->
        <script src="/PYCS/assets/libs/jquery/jquery.min.js"></script>
        <script src="/PYCS/assets/libs/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="/PYCS/assets/libs/jquery-slimscroll/jquery.slimscroll.min.js"></script>
		<!-- Jquery-Ui -->
        <script src="/PYCS/assets/libs/jquery-ui/jquery-ui.min.js"></script>

        <!-- SCRIPTS -->
        <script src="/PYCS/assets/libs/moment/moment.js"></script>
        <script src='/PYCS/assets/libs/fullcalendar/fullcalendar.min.js'></script>
        <script src="/PYCS/assets/js/jquery.calendar.js"></script>
		
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

        <!-- Dashboard Init JS -->
        <script src="/PYCS/assets/js/jquery.dashboard.js"></script>

        <!-- App js -->
        <script src="/PYCS/assets/js/jquery.core.js"></script>
        <script src="/PYCS/assets/js/jquery.app.js"></script>
        <script>
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