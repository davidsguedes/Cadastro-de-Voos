<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Operador</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Operador</h1>    
        <div id="formOperador">
            <div id="centralizaOperador">
                <form action="FrontController?action=GravarOperador" method="post">
                        <fieldset>
                                <legend>Cadastro de Operador</legend>
                                <label>Nome do Operador:</label> 
                                <input type="text" name="nomeOperador" placeholder=""><br /> 
                                <label>Permissões do Operador:</label> 
                                <input type="text" name="permissaoOperador" placeholder=""><br />
                                <label>Nível do Operador:</label> 
                                <input type="text" name="nivelOperador" placeholder=""><br /> 
                                <label>Dias úteis trabalhados:</label> 
                                <input type="text" name="diasUteisTrabalhados" placeholder=""><br />
                                <label>Valor do dia de trabalho:</label> 
                                <input type="text" name="valorDiaTrabalhado" placeholder=""><br />
                                <label>valor do vale transporte por dia:</label> 
                                <input type="text" name="valorValeTransporteDia" placeholder=""><br /> 
                                <button type="submit" class="btn btn-info">Enviar</button>
                        </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>
