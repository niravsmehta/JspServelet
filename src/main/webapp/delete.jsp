<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>

	<form action="deletecustomers">
		<h1>Select the customer to delete:</h1>
		Customer Id: <input type="text" name="customerId" /><br> <input
			type="submit" value="Delete" />
		<%
			out.print(request.getAttribute("delete"));
		%>
		<a href="dashboard.jsp"> Dashboard</a>
	</form>

</body>
</html>