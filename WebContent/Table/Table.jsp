<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!doctype html>
<html class="no-js" lang="">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Data Table | Notika - Notika Admin Template</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/bootstrap.min.css">
    <!-- font awesome CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/font-awesome.min.css">
    <!-- owl.carousel CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/owl.carousel.css">
    <link rel="stylesheet" href="Table/css/owl.theme.css">
    <link rel="stylesheet" href="Table/css/owl.transitions.css">
    <!-- meanmenu CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/meanmenu/meanmenu.min.css">
    <!-- animate CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/animate.css">
    <!-- normalize CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/normalize.css">
	<!-- wave CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/wave/waves.min.css">
    <link rel="stylesheet" href="Table/css/wave/button.css">
    <!-- mCustomScrollbar CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/scrollbar/jquery.mCustomScrollbar.min.css">
    <!-- Notika icon CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/notika-custom-icon.css">
    <!-- Data Table JS
		============================================ -->
    <link rel="stylesheet" href="Table/css/jquery.dataTables.min.css">
    <!-- main CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/main.css">
    <!-- style CSS
		============================================ -->
    <link rel="stylesheet" href="Table/style.css">
    <!-- responsive CSS
		============================================ -->
    <link rel="stylesheet" href="Table/css/responsive.css">
    <!-- modernizr JS
		============================================ -->
    <script src="Table/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <!-- Data Table area Start-->
    <div class="data-table-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="data-table-list">
                        <div class="basic-tb-hd">
                            <h2>Basic Example</h2>
                            <p>It's just that simple. Turn your simple table into a sophisticated data table and offer your users a nice experience and great features without any effort.</p>
                        </div>
                        <div class="table-responsive">
							<form action  = "TableHandler" method = "POST" name = "filtered-form">
							<div class="dataTables_wrappe">
								<div id="data-table-basic_filter" class="dataTables_filter">
									<label>
										Search:
										<input type="text" class="" name = "filter" placeholder="Search" aria-controls="data-table-basic" value = "" onchange = "document.filtered-form.submit();">
									</label>
								</div>
							</div>
							
							
							
							</form>
                            <table id="data-table-basic" class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Name</th>
                                        <th>Email</th>
                                        <th>Phone</th>
                                        <th>Message</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                               
      							<c:forEach items="${forms}" var="form">
      							   <tr>
                                        <td> <c:out value = "${form.getName()}"/></td>
                                        <td>  <c:out value = "${form.getEmail()}"/></td>
                                        <td> <c:out value = "${form.getPhone()}"/></td>
                                        <td><c:out value = "${form.getMessage()}"/></td>
                                        
                                    </tr>
      							
    							
								</c:forEach>
                                  
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Data Table area End-->
    
    <!-- jquery
		============================================ -->
    <script src="Table/js/vendor/jquery-1.12.4.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="Table/js/bootstrap.min.js"></script>
    <!-- wow JS
		============================================ -->
    <script src="Table/js/wow.min.js"></script>
    <!-- price-slider JS
		============================================ -->
  
</body>

</html>