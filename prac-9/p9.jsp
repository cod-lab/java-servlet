<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">

    <style>
        table, td {
            /* border-bottom: 1px solid black; */
            border-collapse: collapse;
            background-color: #E8E8E8;
        }
        td { padding: 15px; }
        body { font-family: sans-serif; }
    </style>

    <title>server</title>
</head>
<body>
    <h3><u>details:</u></h3>
    <table>
        <tbody>
            <tr>
                <td>name: </td>
                <td><b>|</b></td>
                <td><i><b><% out.println(request.getParameter("i1")); %></b></i></td>
            </tr>

            <tr>
                <td>gender: </td>
                <td><b>|</b></td>
                <td>
                    <i><b><% 
                        String g=request.getParameter("i2");
                        if(g != null) out.println(g); 
                    %></b></i>
                </td>
            </tr>

            <tr>
                <td>email: </td>
                <td><b>|</b></td>
                <td><i><b><% out.println(request.getParameter("i3")); %></b></i></td>
            </tr>

            <tr>
                <td>phone: </td>
                <td><b>|</b></td>
                <td><i><b><% out.println(request.getParameter("i4")); %></b></i></td>
            </tr>

            <tr>
                <td>course: </td>
                <td><b>|</b></td>
                <td><i><b><% out.println(request.getParameter("i5")); %></b></i></td>
            </tr>

            <tr>
                <td>interested area: </td>
                <td><b>|</b></td>
                <% 
                    String a=request.getParameter("i6_a");
                    String b=request.getParameter("i6_b");
                    String c=request.getParameter("i6_c");
                %>
                <td>
                    <i><b>
                        <% if(a != null) { out.println(a); %> <br> <% } %>
                        <% if(b != null) { out.println(b); %> <br> <% } %>
                        <% if(c != null) out.println(c); %>
                    </b></i>
                </td>
            </tr>

            <tr>
                <td>address: </td>
                <td><b>|</b></td>
                <td><i><b><% out.println(request.getParameter("i7")); %></b></i></td>
            </tr>

            <tr>
                <td>photo: </td>
                <td><b>|</b></td>
                <td><i><b><% out.println(request.getParameter("i8")); %></b></i></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
