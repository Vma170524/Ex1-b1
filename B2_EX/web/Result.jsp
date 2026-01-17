<%-- 
    Document   : Result
    Created on : 17/01/2026, 1:03:21 AM
    Author     : Minh Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result Page</title>
  </head>
  <body>
    <h1>Result: </h1>
    <%
   String result =(String) request.getAttribute("Result");   %>
   <%= result %>
  </body>
</html>
