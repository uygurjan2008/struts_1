<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user=(String)session.getAttribute("user");
System.out.print(user);

if(user!=null){
	%>
	
	

<div align="center">
<div>
<label for="">username=<%=user %>
</label>
</div>
<div align="center" style="border: 1px solid;box-shadow:0 0 0 2px #000;width:70%;height:750px;">

</div>
</div>
	
	
	<%
	
}else{
	
	
	response.sendRedirect("login.jsp");
	
	
}

%>

</body>
</html>