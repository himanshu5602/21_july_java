<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="RegistrationController">
<table>
<tr>
	<td>FirstName : </td>
	<td><input type="text" name="fname" required="required"></td>
</tr>
<tr>
	<td>LastName : </td>
	<td><input type="text" name="lname"></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="email" name="email"></td>
</tr>
<tr>
	<td>Mobile : </td>
	<td><input type="text" name="mobile"></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td><input type="submit" name="Register"></td>
</tr>
</table>
</form>
</body>
</html>