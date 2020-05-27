<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro de Itinerário</title>
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
        <h1 style="background: rgb(0, 136, 204); padding: 10px;color: #FFF;">Cadastro de Itinerário</h1>        
        <div id="formItinerario">
            <div id="centralizaItinerario">
                <form action="FrontController?action=GravarItineario" method="post">
                        <fieldset>
                                <legend>Cadastro de Itinerário</legend>
                                <label>Código:</label> 
                                <input type="text" name="itiCod" placeholder=""><br /> 
                                <label>Origem:</label> 
                                <input type="text" name="itiOrigem" placeholder=""><br />
                                <label>Destino:</label> 
                                <input type="text" name="itiDestino" placeholder=""><br /> 
                                <button type="submit" class="btn btn-info">Enviar</button>
                        </fieldset>
                </form>
            </div>
        </div>
</html>
