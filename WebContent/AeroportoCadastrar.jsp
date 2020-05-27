<%-- 
    Document   : AeroportoCadastrar
    Created on : 10/05/2015, 22:51:07
    Author     : Guedes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Aeroporto</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Aeroporto</h1>        
        <div id="formAeroporto">
            <div id="centralizaAeroporto">
                <form action="FrontController?action=GravarAeroporto" method="post">
                        <fieldset>
                                <legend>Cadastro de Aeroporto</legend>
                                <label>Código:</label> 
                                <input type="text" name="aercod" placeholder=""><br /> 
                                <label>Sigla:</label> 
                                <input type="text" name="aerSigla" placeholder=""><br />
                                <label>Localização:</label> 
                                <input type="text" name="aerlocalizacao" placeholder=""><br /> 
                                <button type="submit" class="btn btn-info">Enviar</button>
                        </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
