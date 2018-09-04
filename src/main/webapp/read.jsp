<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Customers</title>
</head>
<body>
	
	<form action="viewcustomers">
		Enter the Customer Id: <input type="text" name="customerId"><br> 
		<input type="submit" value="Find"/>
		<%
			out.print(request.getAttribute("Customer"));
		%>
		<a href="dashboard.jsp">Dashboard</a>
	</form>

</body>
</html>