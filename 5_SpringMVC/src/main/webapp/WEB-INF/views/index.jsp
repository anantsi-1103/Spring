<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>Home Page</h2>

	<%
	String name = (String) request.getAttribute("name");
	String city = (String) request.getAttribute("city");
	%>

	<h1>
		Your name is
		<%=name%></h1>

	<h1>
		Your city is
		<%=city%></h1>
</body>
</html>