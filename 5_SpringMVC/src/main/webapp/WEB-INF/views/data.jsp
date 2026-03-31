<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data</title>
</head>
<body>
	<h1>Data Page</h1>


	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	%>
	
	<h1>Your name is <%= name %></h1>
	
	<h1>Your ID is <%= id %></h1>
	
</body>
</html>