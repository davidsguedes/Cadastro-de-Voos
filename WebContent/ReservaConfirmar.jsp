<%-- 
    Document   : ReservaConfirmar
    Created on : 07/10/2014, 20:09:20
    Author     : david.guedes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Realizar Reserva</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Reserva da passagem</h1>
        
        <div id="formReserva">
            <div id="centralizaReserva">
                <form action="FrontController?action=GravarReserva" method="post">
                        <fieldset>
                                <legend>Cadastro da passagem</legend>
                                <label>Cliente:</label> 
                                <select name="selectClientes">
                                    <option selected="selected">Selecione</option>
                                        <c:forEach items="${clientes}" var="cliente">
                                            <option value="${cliente.idCliente}">
                                                <c:out value="${cliente.nome}"/>
                                            </option>
                                        </c:forEach>
                                </select> 
                                <label>Passagem:</label> 
                                <select name="selectPassagens">
                                    <option selected="selected">Selecione</option>
                                        <c:forEach items="${passagens}" var="passagem">
                                            <option value="${passagem.idPassagem}">
                                                <c:out value="${passagem.numeroPassagem}"/> - <c:out value="${passagem.valorPassagem}"/>
                                            </option>
                                        </c:forEach>
                                </select>
                                <button type="submit" class="btn btn-info">Enviar</button>
                        </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
