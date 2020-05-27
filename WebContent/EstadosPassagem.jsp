<%-- 
    Document   : EstadosPassagem
    Created on : 08/10/2014, 00:46:11
    Author     : Guedes
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Status da Passagem</title>
        <!-- Fontes -->
        <link href="http://fonts.googleapis.com/css?family=Ubuntu"
                rel="stylesheet" type="text/css" />
        <!-- Fontes -->
        <link href="bootstrap/css/estiloAdaptado.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Status da Passagem</h1>
        <div id="formEstadosPassagem">
            <div id="centralizaEstadosPassagem">
                <ul class="nav nav-pills">
                    <li class="#">
                        <a href="FrontController?action=ListarDisponibilizarPassagem">Disponibilizar Passagem</a>
                    </li>
                </ul>
            </div>
        </div>
    </body>
</html>
