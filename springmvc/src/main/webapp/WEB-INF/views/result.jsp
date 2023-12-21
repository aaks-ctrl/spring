<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"
	import="com.aayush.spring.springmvc.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registered User Details</title>
</head>
<body>
	<% User user = (User) request.getAttribute("user"); 	
	out.println("ID : "+user.getId());
	out.println("NAME : "+user.getName());
	out.println("EMAIL : "+user.getEmail());
	%>

</body>
</html>