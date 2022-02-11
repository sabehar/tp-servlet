<%-- 
    Document   : newLigne
    Created on : 11 févr. 2022, 14:59:48
    Author     : Ambroise
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Créer Ligne</title>
        <style>
            #mainContainer {
                display: grid;
                width: 500px;
                margin: 0 auto;
            }
        </style>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div id="mainContainer">
            <h1>TP3 Servlet/JSP</h1>

            <h3>Création d'une nouvelle ligne</h3>
             <form method="post" action="NewLigne">
                <div class="gridItem">
                    <label for="numero">Numero de ligne :</label>
                    <input class="form-control" type="text" id="numero" name="numero" required>
                </div>
              
                <button class="btn btn-primary" type="submit">Créer une nouvelle ligne</button>
            </form> 
        </form>    
    </div>
</body>
</html>
