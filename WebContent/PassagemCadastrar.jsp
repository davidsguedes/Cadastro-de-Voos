<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Passagem</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Passagem</h1>
        <div id="formPassagem">
            <div id="centralizaPassagem">
                <form action="FrontController?action=GravarPassagem" method="post">
                    <fieldset>
                        <legend>Cadastro de Passagem</legend>
                        <label>Número:</label> 
                        <input type="text" name="numeroPassagem" placeholder=""><br /> 
                        <label>Valor:</label> 
                        <input type="text" name="valorPassagem" placeholder=""><br />
                        <label>Status:</label> 
                        <select class="form-control" id="situacaoSelecionada" name="situacaoSelecionada">
                            <option value="#">
                                <c:out value="Selecione" />
                            </option>
                            <option value="Disponivel">
                                <c:out value="Disponivel" />
                            </option>
                            <option value="Indisponivel">
                                <c:out value="Indisponivel" />
                            </option>
                        </select> 
                        <button type="submit" class="btn btn-info">Enviar</button>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>