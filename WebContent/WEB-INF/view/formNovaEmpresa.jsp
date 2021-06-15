<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:url value="/entrada" var="novaEmpresa" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>FormNovaEmpresa</title>
	</head>
	<body>
		
		<c:import url="logout-parcial.jsp" />
		
		<h4>Criar Empresa</h4>
		<br/>
		<br/>
		<br/>
		<form action="${ novaEmpresa }" method="post">
		
			<label for="nome">Nome:</label>
			<input id="nome" type="text" name="nome" />
			<br/>
			<br/>
			<label for="data">Data Abertura:</label>
			<input id="data" type="text" name="data" />
			
			<input type="hidden" name="acao" value="NovaEmpresa"/>
			<button type="submit" >Cadastrar</button>
		</form>
		<br/>
		<br/>
		<a href="/gerenciador/entrada?acao=ListaEmpresas">Voltar</a>
	</body>
</html>