<%-- 
    Document   : PassagemCadastrar
    Created on : 07/10/2014, 20:07:08
    Author     : david.guedes
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="font-family: verdana; background: darkgray; padding: 10px;">Cadastro de Passagem</h1>
    <form action="FrontController?action=GravarPassagem" method="post" style="font-family: verdana;">
      Número:
      <input type="numeroPassagem" name="numeroPassagem" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Valor:
      <input type="valorPassagem" name="valorPassagem" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      <a href="index.jsp">Voltar</a>
      <input type="submit">
    </form>
    </body>
</html>
