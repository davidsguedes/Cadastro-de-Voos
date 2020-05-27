<%-- 
    Document   : voosCancelar
    Created on : 05/10/2014, 18:02:41
    Author     : Guedes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cancelar Vôo</title>
    </head>
    <body>
        <h1>Cancelar Vôo</h1>
        <form action="FrontController?action=CancelarVoo" method="post">
            <label>Cancelar Vôo</label>
            <select name="selectVoos">
                <option selected="selected">Selecione</option>
                <c:forEach items="${voos}" var="voo">
                    <option value="${voo.idVoo}">
                        <c:out value="${voo.codigoVoo}"/>
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Selecionar!"/>
        </form>
    </body>
</html>
