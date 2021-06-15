package br.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gerenciador.model.Banco;
import br.gerenciador.model.Empresa;

public class MostraEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando dados da Empresa");
		
		Integer empresaId = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresaById(empresaId);
		
		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";
	}
}