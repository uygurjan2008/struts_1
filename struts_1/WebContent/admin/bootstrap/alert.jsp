<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bootstrap alert</title>
<link rel="stylesheet"
	href="../../css/bootstrap-3.2.0/dist/css/bootstrap.min.css" />
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript"
	src="../../css/bootstrap-3.2.0/dist/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="alert alert-success alert-dismissable">

		meassage will appear here <a class="close"
			data-dismiss="alert" aria-hidden="true">&times;</a>
	</div>
	<div class="alert alert-info alert-dismissible">
		info meassage will appear here <a type="button" class="close"
			data-dismiss="alert" aria-hidden="true">&times;</a>
	</div>
	<div class="alert alert-warning">warning</div>
	<div class="alert alert-danger">danger</div>

</body>
</html>