<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="s" uri="/struts-tags" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="input">

name:<input type="text" name="name" />
price:<input type="text" name="price" />
<input type="submit" />

</form>

name :${name}
price :${price}

<s:debug></s:debug>
s:<s:property value="name"></s:property>
s:<s:property value="price"></s:property>

</body>
</html>