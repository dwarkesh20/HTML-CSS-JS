<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All</title>
</head>
<body>
	<%@ page import="com.einfo.demodatajpa.model.Movie" %>
	<%@ page import="java.util.*" %>
	<%
	if(request.getAttribute("li")!=null){
	List<Movie> li = (ArrayList<Movie>) request.getAttribute("li");
		for(Movie m : li)
		{
	%>
			<form action="updatebyid">
			<input type="text" name="id" value="<%=m.getMovieId()%>" hidden>
	<%
			out.print(m+"\t<input type=\'submit\' value=\'Update\'>"+
			"<br></form>");
		}
	}
	%>
	
	
	
	<%
	if(request.getAttribute("mli")!=null){
	List<Movie> li = (ArrayList<Movie>) request.getAttribute("mli");
		for(Movie m : li)
		{
			out.print(m+"<br>");
		}
	}
	%>
	${m}
</body>
</html>