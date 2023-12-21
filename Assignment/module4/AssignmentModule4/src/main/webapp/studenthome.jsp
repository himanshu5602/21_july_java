<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question 7</title>
</head>
<style>
   body
   {
   	background:linear-gradient(#8bb8f3,#badce4);
   	background-repeat:no-repeat;
   	background-size:cover;
   	height:100vh;
   }
   button
   {
   	height:30px; 
   	width:100px;
   }
</style>
<body>
<center>
  <form action="Studentcontroller" method="get">
                            <div class="row">
                                <div class="col-lg-3">
                                  Firstname  <input type="text" placeholder="firstame" name="firstname">
                                </div><br>
                                
                                
                                <div class="col-lg-3">
                                  Lastname  <input type="text" placeholder="lastname" name="lastname">
                                </div><br>
                                
                                <div class="col-lg-3">
                                  Email  <input type="email" placeholder="email" name="email">
                                </div><br>
                                
                                <div class="col-lg-3">
                                   Mobile <input type="text" placeholder="mobile" name="mobile">
                                </div><br>
                                

							<div class="col-lg-3">
                                  <label for="gender">Gender : </label>
                                    Male:<input type="radio" name="gender" value="male">
                                    Female:<input type="radio" name="gender" value="female">
                                </div><br>
                              
                                 <div class="col-lg-3">
                                   Password <input type="password" placeholder="password" name="password"><br><br>
                                     <button type="submit" class="site-btn" value="submit" name="action">Submit</button>
                                </div>      
                            </div>
                        </form>
                        </center>
</body>
</html>