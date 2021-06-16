<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-BR">
	<head>
		<meta charset="utf-8">	
	</head>
	<body>
		
		<br/>
			<c:if test="${ empty usuarioLogado.login }">
				&emsp; Gerenciador de Empresas &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; <a href="/gerenciador/entrada?acao=LoginForm">Fazer Login</a>
			</c:if>
		<br/>
		<hr/>
		
		<br/>
		<h2>Bem vindo ao gerenciador de Empresas!</h2>
		
		<br/>
		<br/>
		<c:if test="${ not empty usuarioLogado.login }">
			<a href="/gerenciador/entrada?acao=ListaEmpresas">Listar Empresas</a>
		</c:if>
		
	</body>
</html>