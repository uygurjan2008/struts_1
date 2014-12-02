<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<s:i18n name="cn">
		<s:text name="username">

		</s:text>
		<s:text name="userpass">

		</s:text>
		<s:text name="email">

		</s:text>


	</s:i18n>
	
	<s:i18n name="uy">
		<s:text name="username">

		</s:text>
		<s:text name="userpass">

		</s:text>
		<s:text name="email">

		</s:text>


	</s:i18n>
	<p>AAAAAAAAAAAAAAA</p>
	<p>fmt</p>
	<fmt:bundle basename="cn">
	
	<fmt:message key="username"></fmt:message>
	
	</fmt:bundle>
	
	
	<fmt:bundle basename="uy">
	
	<fmt:message key="username"></fmt:message>
	
	</fmt:bundle>

</body>
</html>