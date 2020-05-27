<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Confirmar Vôo</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Venda da passagem</h1>
        <div id="formVendaPassagem">
            <div id="centralizaVendaPassagem">
                <form action="FrontController?action=GravarVenda" method="post">
                    <fieldset>
                        <legend>Venda da passagem</legend>
                            <label>Vôo:</label> 
                            <select name="selectVoos">
                                <option selected="selected">Selecione</option>
                                    <c:forEach items="${voos}" var="voo">
                                        <option value="${voo.idVoo}">
                                            <c:out value="${voo.codigoVoo}"/> - <c:out value="${voo.codigoVoo}"/>
                                        </option>
                                    </c:forEach>
                            </select> 
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
                            <label>Promoção:</label> 
                            <select class="form-control" id="promocaoSelecionada" name="promocaoSelecionada">
                                <option value="#">
                                    <c:out value="Selecione" />
                                </option>
                                <option value="ClienteAssiduo">
                                    <c:out value="Cliente Assíduo" />
                                </option>
                                <option value="Gestante">
                                    <c:out value="Gestante" />
                                </option>
                                <option value="Idoso">
                                    <c:out value="Idoso" />
                                </option>
                                <option value="Milha">
                                    <c:out value="Milha" />
                                </option>
                                <option value="Crianca">
                                    <c:out value="Criança" />
                                </option>
                            </select>
                        <button type="submit" class="btn btn-info">Enviar</button>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
