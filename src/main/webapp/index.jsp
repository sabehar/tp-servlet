<%-- 
    Document   : index
    Created on : 4 janv. 2022, 15:17:48
    Author     : sabehar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            <%String username = (String)request.getAttribute("user");
            if (username != null) {%>
                <li><a href="/tpservlet/Logout">Logout page</a></li>
            <%}%>

            <li><a href="/tpservlet/Hello">Hello</a></li>
            <li><a href="/tpservlet/Login">Login page</a></li>
        </ul>
    </body>
</html>
