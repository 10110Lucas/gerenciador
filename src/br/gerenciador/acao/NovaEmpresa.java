package br.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gerenciador.model.Banco;
import br.gerenciador.model.Empresa;

public class NovaEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Nova Empresa");
		
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");
		Date dataAbertura = null;
		
		Banco banco = new Banco();
		
		if (data != "") {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
				dataAbertura = sdf.parse(data);
			} catch (ParseException e) { 
				throw new ServletException(e);
			}
			banco.adiciona(new Empresa(banco.novaChave(), nome, dataAbertura));
		} 
		else {
			banco.adiciona(new Empresa(banco.novaChave(), nome));
		}
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
