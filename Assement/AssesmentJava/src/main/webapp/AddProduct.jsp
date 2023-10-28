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
<form action="ProductController" method="post" enctype="multipart/form-data">
                             <div class="col-lg-3">
                                    <input type="text" placeholder="Name" name="Name">
                                </div>
                                      <div class="col-lg-3">
                                    <input type="text" placeholder="Category" name="Category">
                                </div>
                                
                                <div class="col-lg-6">
                                    <input type="text" placeholder="Model" name="Model">
                                </div>
                              
                                <div class="col-lg-3">
                                    <input type="text" placeholder="Price" name="Price">
                                </div>
                              
                               
                                <div class="col-lg-3">
                                    <input type="text" placeholder="Description" name="Description">
                                </div>
                               <center>  
                                <div class="col-lg-3">
                                    <input type="file" placeholder="Image" name="Image">
                                </div></center>
                              
                                     <button type="submit" class="site-btn" name="action" value="submit">Submit</button>
                                </div>
                        </form>
</center>
</body>
</html>