<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:url value="/entrada" var="novaEmpresa" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>FormNovaEmpresa</title>
	</head>
	<body>
	
		<h4>Criar Empresa</h4>
		<br/>
		<br/>
		<br/>
		<form action="${ novaEmpresa }" method="post">
		
			<label for="login">Login:</label>
			<input id="login" type="text" name="login" />
			<br/>
			<br/>
			<label for="senha">Senha:</label>
			<input id="senha" type="password" name="senha" />
			
			<input type="hidden" name="acao" value="Login"/>
			<button type="submit" >Login</button>
		</form>
		<br/>
		<br/>
		<a href="/gerenciador">Home</a>
	</body>
</html>