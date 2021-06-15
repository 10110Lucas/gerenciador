<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="alteraEmpresa" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>FormAlteraEmpresa</title>
	</head>
	<body>
		
		<c:import url="logout-parcial.jsp" />
		
		<h4>Editar Empresa</h4>
		<br/>
		<br/>
		<form action="${ alteraEmpresa }" method="post" style="margin: auto;">
			
			<!-- <label for="id">ID:</label> -->
			<%-- <input id="id" type="hidden" name="id" value="${ empresa.id }" /> --%>
			<!-- <br/>
			<br/> -->
			<label for="nome">Nome:</label>
			<input id="nome" type="text" name="nome" value="${ empresa.nome }" />
			<br/>
			<br/>
			<label for="data">Data Abertura:</label>
			<input id="data" type="text" name="data" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy hh:mm:ss" />" />
			
			<input type="hidden" name="acao" value="AlteraEmpresa" />
			<button type="submit" name="id" value="${ empresa.id }" >Alterar</button>
		</form>
		
		<br/>
		<br/>
		<a href="/gerenciador/entrada?acao=ListaEmpresas">Voltar</a>
		
	</body>
</html>