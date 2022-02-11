<%-- 
    Document   : newVoyage
    Created on : 11 févr. 2022, 15:01:39
    Author     : Ambroise
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Créer Voyage</title>
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

            <h3>Création d'un nouveau voyage</h3>
            <form>
                <div class="gridItem">
                    <label>Station de départ :</label>
                    <select class="form-select">
                        <option value="1">Lyon</option>
                        <option value="2">Paris</option>
                        <option value="3">Marseille</option>
                    </select>
                </div>

                <div class="gridItem">
                    <label>Station d'arrivée :</label>
                    <select class="form-select">
                        <option value="1">Lyon</option>
                        <option value="2">Paris</option>
                        <option value="3">Marseille</option>
                    </select>
                </div> 
                <button class="btn btn-primary" type="submit">Enregistrer</button>
            </form>    
        </div>
    </body>
</html>
