<%-- 
    Document   : voo
    Created on : 09/09/2014, 16:41:50
    Author     : david.guedes
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="font-family: verdana; background: darkgray; padding: 10px;">Cadastro de Vôos</h1>
    <form action="FrontController?action=GravarVoo" method="post" style="font-family: verdana;">
      Código do vôo:
      <input type="text" name="codigoVoo" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Aeroporto Origem:
      <input type="text" name="aeroportoOrigem" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Aeroporto Destino:
      <input type="text" name="aeroportoDestino" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Data:
      <input type="date" name="dataVoo" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Hora:
      <input type="time" name="horaVoo" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      <a href="index.jsp">Voltar</a>
      <input type="submit">
    </form>
    </body>
</html>
