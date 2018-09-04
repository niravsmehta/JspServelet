<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>

	<h1>Customer Dashboard:</h1>
	
	<form action="customerchoice">
  		<input type="radio" name="choice" value="create"> Create<br>
  		<input type="radio" name="choice" value="read"> Read<br>
  		<input type="radio" name="choice" value="update"> Update<br>
  		<input type="radio" name="choice" value="delete"> Delete
	</form>

</body>
</html>