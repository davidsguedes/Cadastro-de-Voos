<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Vôos</title>
        <!-- Fontes -->
        <link href="http://fonts.googleapis.com/css?family=Ubuntu"
                rel="stylesheet" type="text/css" />
        <!-- Fontes -->
        <link href="bootstrap/css/estiloAdaptado.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="jquery-2.1.4.min.js"></script>
    </head>
    <body>
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Vôos</h1>
        <div id="formVoo">
            <div id="centralizaVoo">
                <form action="FrontController?action=GravarVoo" method="post">
                        <fieldset>
                                <legend>Cadastro de Vôos</legend>
                                <label>Código do vôo:</label> 
                                <input type="text" name="itiCod" placeholder=""><br />
                                <label>Selecione Aeroporto:</label> 
                                <select name="selectAeroportos">
                                    <option selected="selected">Selecione</option>
                                        <c:forEach items="${aeroportos}" var="aeroporto">
                                            <option value="${aeroporto.idAeroporto}">
                                                <c:out value="${aeroporto.aerlocalizacao}"/>
                                            </option>
                                        </c:forEach>
                                </select>
                                <label>Selecione Itinerário:</label>
                                <select name="selectItinerarios">
                                    <option selected="selected">Selecione</option>
                                        <c:forEach items="${itinerarios}" var="itinerario">
                                            <option value="${itinerario.idItinerario}">
                                                <c:out value="${itinerario.itiOrigem}"/> - <c:out value="${itinerario.itiDestino}"/>
                                            </option>
                                        </c:forEach>
                                </select>
                                <label>Selecione Aeronave:</label>
                                <select name="selectAeronaves" id="selectAeronaves">
                                    <option selected="selected"  update="selectEmpresas">Selecione</option>
                                        <c:forEach items="${aeronaves}" var="aeronave">
                                            <option value="${aeronave.aeroId}">
                                                <c:out value="${aeronave.aeroModelo}"/> - <c:out value="${aeronave.aeroCapacidade}"/>
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
