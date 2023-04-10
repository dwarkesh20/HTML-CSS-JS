<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Food Register</h1>
	<form action="insertfood" method="post" enctype="multipart/form-data">
			Hotel Name: <input type="text" name="hotelName"><br><br>
			Food Name: <input type="text" name="foodName"><br><br>
			Food Category: 
			<select name="foodCategory">
				<option value="">Break Fast</option>
				<option value="Dinner">Dinner</option>
				<option value="Lunch">Lunch</option>
			</select> <br><br>
			Description: <input type="text" name="description"><br><br>
			Price: <input type="number" name="price"><br><br>
			Image: <input type="file" name="image"><br><br>
			<input type="submit" value="Submit">
	</form>
	</center>
</body>
</html>