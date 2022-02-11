<%-- 
    Document   : newStation
    Created on : 11 févr. 2022, 15:01:11
    Author     : Ambroise
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Créer Station</title>
        <style>
            #mainContainer {
                display: grid;
                width: 500px;
                margin: 0 auto;
            }
            .gridItem{
                display: grid;
                margin: 10px;
            }
        </style>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <div id="mainContainer">
            <h1>TP3 Servlet/JSP</h1>

            <h3>Création d'une nouvelle station</h3>
            <form method="post" action="NewStation">
                <div class="gridItem">
                    <label for="nomStation">Nom de la station :</label>
                    <input class="form-control" type="text" id="nomStation" name="nomStation" required>
                </div>

                <div class="gridItem">
                    <label for="prixStation">Prix de la station (en €) :</label>
                    <input class="form-control" type="number" id="prixStation" name="prixStation" required>
                </div>

                <div class="gridItem">
                    <label>Ligne de la station :</label>
                    <select class="form-select">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                    </select>
                </div>   
                <button class="btn btn-primary" type="submit">Enregistrer</button>
            </form>    
        </div>
    </body>
</html>