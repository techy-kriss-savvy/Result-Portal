<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Portal</title>
    <link rel="stylesheet" href="login.css">
    <link rel="icon" type="image/png" href="icons8-authentication-120.png">
</head>
<body>
    <form action="Loginmanager" method="post">
        <div id="container">
        <center>
        <h1>Welcome Back!</h1>
        
        <h3>Login to continue</h3>
        <div id="q">
        <img src="user-svgrepo-com.svg" alt="Email"  width="16px" height="16px">
        <input type="email" placeholder="Enter the Email" name="email" class="box1">
        </div>
        <div id="w">
        <img src="browse-svgrepo-com.svg" alt="Email" width="16px" height="16px">
        <input type="password" placeholder="Enter the Password" name="pass" class="box1">
        </div>
                  <input type="submit" value="Login" id="but1">
        </center>
        </div>
        </form>       
     <% 
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
       <center> <p style="color:red;"><b><%= errorMessage %></b></p></center>
    <% 
        } 
    %>
</body>
</html>