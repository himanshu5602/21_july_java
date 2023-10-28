<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

<%@page import="com.util.ProductDBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<style>
*{
	box-sizing:border-box;
	margin:0;
	padding:0;
}
   body
   {
   	background:linear-gradient(#8bb8f3,#badce4);
   	background-repeat:no-repeat;
   	background-size:cover;
   	height:100vh;
   }
</style>
<body>
<center>
<h2>Please Fill Below The Data</h2><br>
<table border="1">
<tr>

<th>NAME</th>
<th>CATEGORY</th>
<th>MODEL</th>
<th>PRICE</th>
<th>DESCTRIPTION</th>
<th>IMAGE</th>

</tr>
 <% 
 Connection cn=new ProductDBUtil().getConnectionData();
	String qry="select * from product";
	PreparedStatement st=cn.prepareStatement(qry);
	ResultSet rs=st.executeQuery();
	while(rs.next())
	{
 %>
 <tr>
 	<td><%= rs.getString(2) %></td>
 	<td><%= rs.getString(3) %></td>
 	<td><%= rs.getString(4) %></td>
 	<td><%= rs.getString(5) %></td>
 	<td><%= rs.getString(6) %></td>
 	<td> <img alt="" src="ProductImage\<%= rs.getString(7) %>" height="250px" width="250px"></td>
 
 </tr>
<%
	}
	cn.close();

%>



</table>
</center>
</body>
</html>