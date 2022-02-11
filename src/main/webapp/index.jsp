<%-- 
    Document   : index
    Created on : 4 janv. 2022, 15:17:48
    Author     : sabehar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>TP Servlet/JSP</h1>
        <ul>
            Session ID: <%= session.getId() %>   <br/>
            Session creation time: <%= new Date(session.getCreationTime()) %>
            
            <li><a href="/tpservlet/Hello">Hello page</a></li>
            <%String username = (String)session.getAttribute("user");
            if (username != null) {%>
                <li><a href="/tpservlet/Logout">Logout</a></li>
            <%} else {%>
                <li><a href="/tpservlet/Login">Login page</a></li>
            <%}%>    
            <li><a href="/tpservlet/NewLigne">Nouvelle ligne</a></li>   
            <li><a href="/tpservlet/NewStation">Nouvelle station</a></li>    
        </ul>
    </body>
</html>
