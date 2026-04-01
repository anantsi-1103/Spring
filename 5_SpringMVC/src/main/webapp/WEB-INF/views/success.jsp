<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>

	<h1>${heads}</h1>
	<h2>${para}</h2>
	
	<hr>


	<h1>Your name is ${user.username }</h1>
	<h2>Your email is ${user.email}</h2>
	<h2>Your Password is ${user.password}</h2>
</body>
</html>