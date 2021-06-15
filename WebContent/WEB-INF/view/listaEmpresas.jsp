<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.List, br.gerenciador.model.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista Empresas</title>
	</head>
	<body>
		
		<c:import url="logout-parcial.jsp" />
	
		<c:if test="${ not empty empresa }">
			<h1>Empresa ${ empresa } cadastrada com sucesso!</h1>
		</c:if>
	
		<h3>Empresas</h3>
		<ul>
			<c:forEach items="${ empresas }" var="empresa" >
				<li>
					${ empresa.id } - ${ empresa.nome } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy hh:mm:ss" /> --- 
					<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${ empresa.id }">Editar</a> --- 
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${ empresa.id }">Deletar</a>
				</li>
			</c:forEach>
		</ul>
		
		<br/>
		<br/> 
		<a href="/gerenciador/entrada?acao=NovaEmpresaForm">Nova Empresa</a> ---- 
		<a href="/gerenciador/home">Home</a>
		
	</body>
</html>