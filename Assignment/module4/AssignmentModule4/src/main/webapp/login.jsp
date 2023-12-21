<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Emale</th>
     <th>mobile</th>
    <th>Gender</th>
    <th>Password</th>
  </tr>
  <tr>
    <td>${param.firstname}</td>
    <td>${param.lastname}</td>
    <td>${param.email}</td>
     <td>${param.mobile}</td>
    <td>${param.gender}</td>
    <td>${param.password}</td>
  </tr>
  
</table>
	
	
	
	
	
	
	

	
</body>
</html>