<%-- 
    Document   : PassagensDisponibilizar
    Created on : 05/11/2014, 19:03:35
    Author     : david.guedes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disponibilizar Passagens</title>
    </head>
    <body>
        <h1>Selecionar Passagem</h1>
        <form action="FrontController?action=AtualizarPassagem" method="post">
            <select name="selectPassagens">
                <option selected="selected">Selecione</option>
                <c:forEach items="${passagens}" var="voo">
                    <option value="${passagem.idPassagem}">
                        <c:out value="${passagem.idPassagem}"/>
                    </option>
                </c:forEach>
            </select>
            <a href="index.jsp">Voltar</a>
            <input type="submit" value="Selecionar!"/>
        </form>
    </body>
</html>
