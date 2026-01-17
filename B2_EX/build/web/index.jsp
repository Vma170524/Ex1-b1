<%-- 
    Document   : newjsp
    Created on : 17/01/2026, 12:35:43 AM
    Author     : Minh Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculator Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <form action="Calculate" method="GET">
      Number 1: <input type="text" name="num1" value="" /><br>
      Number 2: <input type="text" name="num2" value="" /><br>
      Operation: <select name="operation">
	<option value="+">+</option>
	<option value="-">-</option>
	<option value="x">x</option>
	<option value="/">/</option>
      </select><br>
      <input type="submit" value="Calculate" />
      
    </form>
    
     <%
   String Error =(String) request.getAttribute("error");   %>
     <% if(Error != null && Error.length()>0 ){ %>
     <%= Error %>
     <% } %>
  </body>
</html>
