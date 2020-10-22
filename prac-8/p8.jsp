<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>server</title>
</head>
<body>
    sum: 
    <u><% out.println(Integer.parseInt(request.getParameter("n1")) + Integer.parseInt(request.getParameter("n2"))); %></u>
    
    <br>
    
    difference: 
    <u><% out.println(Integer.parseInt(request.getParameter("n1")) - Integer.parseInt(request.getParameter("n2"))); %></u>

    <br>
    
    product: 
    <u><% out.println(Integer.parseInt(request.getParameter("n1")) * Integer.parseInt(request.getParameter("n2"))); %></u>

    <br>
    
    division: 
    <u><% out.println(Integer.parseInt(request.getParameter("n1")) / Integer.parseInt(request.getParameter("n2"))); %></u>
</body>
</html>
