<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="font-family: verdana; background: darkgray; padding: 10px;">Cadastro de Cliente</h1>
    <form action="FrontController?action=GravarCliente" method="post" style="font-family: verdana;">
      Nome:
      <input type="nome" name="nome" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      CPF:
      <input type="cpf" name="cpf" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Email:
      <input type="email" name="email" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      Telefone:
      <input type="telefone" name="telefone" style="border: 1px solid #CCC; border-radius: 3px;">
      <br>
      <a href="index.jsp">Voltar</a>
      <input type="submit">
    </form>
    </body>
</html>
