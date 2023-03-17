<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking Form</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
</head>
<body>
        <h2>Movie Details</h2>
    <div>
        <form action="check" method="post">
           
            <table>
            	<tr>
                    <th><label for="" >Mobile Number</label></th>
                    <td><input type="text" name="mobileNumber" placeholder="mobile Number"></td>
                </tr>
                <tr>
                    <th> <label for="">Movie Name</label></th>
                    <td>
                        <select name="moviename" id="">
                            <option value="Avenger">Screen1 Avenger</option>
                            <option value="Spider Man">Screen2 Spider Man</option>
                            <option value="venom">Screen3 venom</option>
                            <option value="The way of water">Screen4 The way of water</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th><label for="" >Show Date</label></th>
                    <td><input type="date" name="showdate" id="showdate" placeholder="Show Date"></td>
                </tr>
                <tr>
                    <th><label for="">Show Time</label></th>
                    <td>
                        <select name="showtime" id="">
                            <option value="10AM">morning(10 AM)</option>
                            <option value="2.30PM">Noon Show (2.30 PM)</option>
                            <option value="6PM">Evening (6 PM) </option>
                            <option value="10PM">night show (10PM)</option>
                        </select>
                    </td>
                </tr>
                <tr>
                	<th><label for="">Ticket Type</label></th>
                    <td><input type="radio" name="movietype" id="" value="150"><label for="movietype">Economic Rs.150</label></td>
                    <td><input type="radio" name="movietype" id="" value="250"><label for="movietype">Platinum    Rs.250</label></td> 
                </tr>
                <tr>
                    <th><label for="">Number Of Tickets</label></th>
                    <td><input type="number" name="numberOfTickets" placeholder="Number"></td>
                </tr>
                <tr>
                <th></th>
                    <td><input type="submit" value="Check Availability"></td>
                </tr>
                <tr>
                <td></td>
                	<td>
                		<%
                		String check = String.valueOf(request.getAttribute("check"));
                    	
                		if(check.equals("null")){
                			
                		}
                		else if(check.equals("false")){
                			out.print("Seat not available");                			
                		}
                		%>
                	</td>
                </tr>
            </table>
           

        </form>
    </div>
</body>
<script>
    //for date control
    var today = new Date();

    var dd = String(today.getDate()).padStart(2, '0');
    var dd5 = String(today.getDate()+4).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0');
    var yyyy = today.getFullYear();
    today = yyyy + '-' + mm + '-' + dd;
    today5 = yyyy + '-' + mm + '-' + dd5;

    $('#showdate').attr('min',today);
    $('#showdate').attr('max',today5);
    
</script>
</html>