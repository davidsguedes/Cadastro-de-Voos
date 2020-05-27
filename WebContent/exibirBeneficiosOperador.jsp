<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="font-family: verdana; background: darkgray; padding: 10px;">Exibir Beneficios do Operador</h1>
    <!-- <form action="FrontController?action=exibirBeneficioOperador" method="post" style="font-family: verdana;">  -->

Selecione Operador:
      <select name="selectOperadores">
                        <option selected="selected">Selecione</option>
                        <c:forEach items="${operadores}" var="operador">
                            <option value="${operador.idOperador}">
                                <c:out value="${operador.nomeOperador}"/>
                            </option>
                        </c:forEach>
       </select>
       
       

</body>
</html>