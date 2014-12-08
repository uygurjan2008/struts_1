<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:optiontransferselect label="你虚幻的图书" name="cnbooks" leftTitle="中文图书"
		rightTitle="外文图书" list="{'AAA','BBB','CCC','DDD'}" multiple="true"
		addToLeftLabel="向左移动 " addToRightLabel="向右移动"   selectAllLabel="全部选择" 
		addAllToRightLabel="全部右移"
		addAllToLeftLabel="全部左移"
		headerKey="cnkey" headerValue="--选择中文图书--" emptyOption="true"
		doubleList="{'EEE','FFF','HHH'}" doubleName="enbook"
		doubleHeaderKey="enkey"
		 doubleHeaderValue="--select a forign book--"
		 doubleEmptyOption="true"
		 doubleMultiple="true"
		 ></s:optiontransferselect>


</body>
</html>