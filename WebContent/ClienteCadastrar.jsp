<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Cliente</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Cliente</h1>
        <div id="formCliente">
            <div id="centralizaCliente">
                <form action="FrontController?action=GravarCliente" method="post">
                        <fieldset>
                                <legend>Cadastro de Cliente</legend>
                                <label>Nome:</label> 
                                <input type="text" name="nome" placeholder=""><br /> 
                                <label>Idade:</label> 
                                <input type="text" name="idade" placeholder=""><br />
                                <label>CPF:</label> 
                                <input type="text" name="cpf" placeholder=""><br /> 
                                <label>E-mail:</label> 
                                <input type="text" name="email" placeholder=""><br />
                                <label>Telefone:</label> 
                                <input type="text" name="telefone" placeholder=""><br />
                                <label>Cidade:</label> 
                                <input type="text" name="cidade" placeholder=""><br />
                                <label>Estado:</label> 
                                <input type="text" name="estado" placeholder=""><br />
                                <label>Pais:</label> 
                                <input type="text" name="pais" placeholder=""><br />
                                <button type="submit" class="btn btn-info">Enviar</button>
                        </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
