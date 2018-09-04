<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>

	<form action="updatecustomer">
		<h1>Update details below:</h1>
		Customer Name: <input type="text" name="customerName"><br>
		Type:<input type="text" name="customerType"><br> 
		<input type="submit" value="Update">
		<%
			out.print(request.getAttribute("update"));
		%>
		<a href="dashboard.jsp"> Dashboard</a>
	</form>

</body>
</html>