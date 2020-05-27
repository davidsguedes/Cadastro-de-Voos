<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Empresa</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Empresa</h1>
        <div id="formEmpresa">
            <div id="centralizaEmpresa">
                <form action="FrontController?action=GravarEmpresa" method="post">
                        <fieldset>
                                <legend>Cadastro de Empresa</legend>
                                <label>Código:</label> 
                                <input type="text" name="EMPCOD" placeholder=""><br /> 
                                <label>Nome:</label> 
                                <input type="text" name="empNome" placeholder=""><br />
                                <label>Razão Social:</label> 
                                <input type="text" name="EMPRAZAOSOCIAL" placeholder=""><br /> 
                                <label>CNPJ:</label> 
                                <input type="text" name="EMPCNPJ" placeholder=""><br />
                                <button type="submit" class="btn btn-info">Enviar</button>
                        </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
