<%-- 
    Document   : index
    Created on : 08/09/2014, 21:59:12
    Author     : david.guedes
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Projeto Vôo</title>
        <link href="bootstrap/css/estiloAdaptado.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Menu</h1>
        <div class="navbar navbar-inverse" style="display: none">
            <p><a href="OperadorCadastrar.jsp">Cadastrar Operador</a></p>
            <p><a href="EmpresaCadastrar.jsp">Cadastrar Empresa</a></p>
            <p><a href="FrontController?action=ListarEmpresaAeronave">Cadastrar Aeronave</a></p>
            <p><a href="ClienteCadastrar.jsp">Cadastrar Cliente</a></p>
            <p><a href="AeroportoCadastrar.jsp">Cadastrar Aeroporto</a></p>
            <p><a href="ItinerarioCadastrar.jsp">Cadastrar Itinerário</a></p>
            <p><a href="FrontController?action=ListarItinerarioAeronaveAeroportoVoo">Cadastrar Vôo</a></p>
            <p><a href="PassagemCadastrar.jsp">Cadastrar Passagem</a></p>
            <p><a href="FrontController?action=ListarClientePassagemReserva">Realizar reserva</a></p>
            <p><a href="FrontController?action=ListarClientePassagemVooVenda">Realizar venda</a></p>
            <p><a href="EstadosVoo.jsp">Estados do Vôo</a></p>
            <p><a href="EstadosPassagem.jsp">Estados da Passagem</a></p>
        </div>
            <div id="formIndex">
                <div id="centralizaIndex">
                    <ul class="nav nav-pills">
                        <li class="active">
                          <a href="OperadorCadastrar.jsp">Cadastrar Operador</a>
                        </li>
                        <li><a href="EmpresaCadastrar.jsp">Cadastrar Empresa</a></li>
                        <li><a href="FrontController?action=ListarEmpresaAeronave">Cadastrar Aeronave</a></li>
                        <li><a href="ClienteCadastrar.jsp">Cadastrar Cliente</a></li>
                        <li><a href="AeroportoCadastrar.jsp">Cadastrar Aeroporto</a></li>
                        <li><a href="ItinerarioCadastrar.jsp">Cadastrar Itinerário</a></li>
                        <li><a href="FrontController?action=ListarItinerarioAeronaveAeroportoVoo">Cadastrar Vôo</a></li>
                        <li><a href="PassagemCadastrar.jsp">Cadastrar Passagem</a></li>
                        <li><a href="FrontController?action=ListarClientePassagemReserva">Realizar Reserva</a></li>
                        <li><a href="FrontController?action=ListarClientePassagemVooVenda">Realizar Venda</a></li>
                        <li><a href="EstadosVoo.jsp">Estados do Vôo</a></li>
                        <li><a href="EstadosPassagem.jsp">Estados da Passagem</a></li>
                    </ul>
                </div>
            </div>
    </body>
</html>
