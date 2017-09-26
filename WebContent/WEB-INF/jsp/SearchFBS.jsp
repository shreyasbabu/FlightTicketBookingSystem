<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3> Enter the Following deatils</h3>
<form id="SearchFBS" modelAttribute="SearchFBS" action="http://localhost:8092/MySpringMvc/jsp/searchResults.jsp" method="post">
Deaprture Location <input type="text" name="departure_loc"><br/>
Arrival Location <input type="text" name="arrival_loc"><br/>
Date             <input type="date" name="flight_travel_Date"><br/>
Seat Class         <input type="text" name="seat_class"><br/>
Remaining Seats <input type="text" name="remaining_seats"><br/>
<input type="submit" name="submit"/>
</form>

</body>
</html>