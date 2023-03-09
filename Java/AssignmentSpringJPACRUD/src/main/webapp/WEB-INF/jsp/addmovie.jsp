<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Movie</title>
</head>
<body style="text-align: center;">
<h1><a href="/">Home</a></h1>
<h1>Add Movie</h1>
	<form action="insert" method="post">
		Movie Name: <input type="text" name="name"><br><br>
		Movie Languege: 
		<select name="lang">
			<option value="" disabled selected>----------Select----------</option>
			<option value="Gujarati">Gujarati</option>
			<option value="Hindi">Hindi</option>
			<option value="English">English</option>
		</select> <br><br>
		Movie Director: <input type="text" name="director"><br><br>
		<input type="submit" value="Add">
	</form>
</body>
</html>