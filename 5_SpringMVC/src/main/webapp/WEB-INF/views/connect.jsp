<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${heads}</h1>
	<h2>${para}</h2>

	<hr>


	<form action="processForm" method="post">
		<label for="usern">Username: </label> <input type="text" id="usern"
			name="username"> <br> <br> <label for="email">Email:
		</label> <input type="email" id="email" name="email"> <br> <br>

		<label for="pass">Password: </label> <input type="password" id="pass"
			name="password"> <br> <br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>