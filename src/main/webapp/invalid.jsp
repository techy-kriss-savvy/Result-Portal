<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Portal</title>
</head>
<body>
<form action="Loginmanager" method="post">
<div>
<center>
<h1>Welcome !</h1>
<hr>
<h3>Login to continue</h3>
Email  : <input type="email" placeholder="Enter the Email" name="email"><br><br>
Password  : <input type="password" placeholder="Enter the Password" name="pass"><br><br>
          <input type="submit" value="Login">
</center>
</div>
</form>

<% 
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
       <center> <p style="color:red;"><%= errorMessage %></p></center>
    <% 
        } 
    %>
</body>
</html>