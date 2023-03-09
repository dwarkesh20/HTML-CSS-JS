<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Movie</title>
</head>
<body style="text-align: center;">
	<h1><a href="/">Home</a></h1>
	<h1>Update</h1>
	<form action="update" method="post">
		Id:<input type="text" name="id" value="${id}" disabled><br><br>
		Name:<input type="text" name="name" value="${name}"><br><br>
		Director:<input type="text" name="director" value="${director}"><br><br>
		Language:<input type="text" name="lang" value="${lang}"><br><br>
		<input type="submit">
	</form>
</body>
</html>