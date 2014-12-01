<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<title>Sistema da Escola</title>
	<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen"/>
	<link href="../css/bootstrap-responsive.min.css" rel="stylesheet" media="screen"/>
	<script type='text/javascript' src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script type='text/javascript'>
            jQuery(document).ready(function(){
                // Executa o evento CLICK em todos os links do menu
                jQuery('#menu a').click(function(e){
		    e.preventDefault();
                    // Faz o carregamento da página de acordo com o COD da página, que vai pegar os valores da página page.php.
		    if (jQuery(this).attr('href') != "#") {
			jQuery('#corpo').load(jQuery(this).attr('href'));
		    }	   
                    });
                });
     </script>
</head>

<body>
	<div class="container">
		<div id="menu" class="navbar navbar-static">
			<div class="navbar-inner">
				<ul role="navigation" class="nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Curso<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li role="presentation"><a role="menuitem" tabindex="-1"
								href="incluirCurso.html">Novo</a></li>
							<li role="presentation"><a role="menuitem" tabindex="-1"
								href="pesquisarCurso.html">Pesquisar</a></li>
						</ul></li>
					<li><a href="ajuda.html">Ajuda</a></li>
					<li><a id="linkSair" href="encerraSessao.jsp">Sair</a></li>
				</ul>
			</div>
		</div>

		<div id="corpo">
			<h3>Bem vindo!</h3>
		</div>

		<div id="rodape">
			<p>Faculdade Metodista Granbery</p>
			<p>Laboratório de Programação IV</p>
		</div>
	</div>
</body>
</html>