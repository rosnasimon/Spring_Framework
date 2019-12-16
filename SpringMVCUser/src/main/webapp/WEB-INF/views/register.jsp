<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="registerProcess">
<table>
	<tr><td>Username</td><td><input type="text" name="username" id="username"></td></tr>
	<tr><td>Password</td><td><input type="password" name="password" id="password"></td></tr>
	<tr><td>Firstname</td><td><input type="text" name="firstname" id="firatname"></td></tr>
	<tr><td>Lastname</td><td><input type="text" name="lastname" id="lastname"></td></tr>
	<tr><td>Email</td><td><input type="email" name="email" id="email"></td></tr>
	<tr><td>Address</td><td><input type="text" name="address" id="address"></td></tr>
	<tr><td>Phone Number</td><td><input type="text" name="phone" id="phone"></td></tr>
	<tr><td><input type="submit" value="Register"></td></tr>
</table>
</form>	
</body>
</html>