package br.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gerenciador.model.Banco;

public class RemoveEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Removendo Empresa");
		
		Integer idEmpresa = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		banco.removeEmpresa(idEmpresa);
		
		return "redirect:entrada?acao=ListaEmpresas";
	}
}