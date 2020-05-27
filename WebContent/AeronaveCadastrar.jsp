<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aeronave</title>
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
    <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Aeronave</h1>
    <div id="form">
        <div id="centraliza">
            <form action="FrontController?action=GravarAeronave" method="post">
                    <fieldset>
                            <legend>Cadastro de Aeronaves</legend>
                            <label>Código:</label> 
                            <input type="text" name="aeroCod" placeholder="Código"><br /> 
                            <label>Capacidade:</label> 
                            <input type="text" name="aeroCapacidade" placeholder="Capacidade"><br />
                            <label>Modelo:</label> 
                            <input type="text" name="aeroModelo" placeholder="Modelo"><br /> 
                            <label>Empresa:</label> 
                            <select name="selectEmpresas">
                                    <option selected="selected">Selecione</option>
                                    <c:forEach items="${empresas}" var="empresa">
                                            <option value="${empresa.idEmpresa}">
                                                    <c:out value="${empresa.empNome}" />
                                            </option>
                                    </c:forEach>
                            </select>
                            <br /> 
                            <button type="submit" class="btn btn-info">Enviar</button>
                    </fieldset>
            </form>
        </div>
    </div>
</body>
</html>

