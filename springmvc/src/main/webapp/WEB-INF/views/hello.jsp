<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<h1>Hello from Spring MVC</h1>
	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Double salary = (Double) request.getAttribute("salary");
	out.println("ID : " + id);
	out.println("Name : " + name);
	out.println("Salary : " + salary);
	%>
	
	
	<strong>${id}</strong>
</body>
</html>