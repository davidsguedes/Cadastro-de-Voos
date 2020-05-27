<%-- 
    Document   : EstadosVoo
    Created on : 08/10/2014, 00:46:11
    Author     : Guedes
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Status do vôo</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Status do vôo</h1>
        <div id="formEstadosVoo">
            <div id="centralizaEstadosVoo">
                <ul class="nav nav-pills">
                    <li class="active">
                        <a href="FrontController?action=ListarConfirmarVoo">Confirmar Vôos</a>
                    </li>
                    <li><a href="FrontController?action=ListarAdiarVoo">Adiar Vôos</a></li>
                    <li><a href="FrontController?action=ListarAtrasarVoo">Atrasar Vôos</a></li>
                    <li><a href="FrontController?action=ListarCancelarVoo">Cancelar Vôos</a></li>
                </ul>
            </div>
        </div>
    </body>
</html>
