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

public class AlteraEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");
		Date dataAbertura = null;
		
		System.out.println("Altera Empresa: " + id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaById(id);
		
		if (data != "" && nome != "") {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
				dataAbertura = sdf.parse(data);
			} catch (ParseException e) {
				throw new ServletException(e);
			}
			empresa.setNome(nome);
			empresa.setDataAbertura(dataAbertura);
		}
		else {
			throw new IOException("Parametro vazio!");
		}
		
		return "redirect:entrada?acao=ListaEmpresas";
	}
}