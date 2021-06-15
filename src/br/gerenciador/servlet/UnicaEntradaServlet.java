package br.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String paramAcao = request.getParameter("acao");
		
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoLogado = ( sessao.getAttribute("usuarioLogado") == null);
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
//		
//		if ( ehUmaAcaoProtegida && usuarioNaoLogado ) {
//			response.sendRedirect("redirect:entrada?acao=LoginForm");
//			return;
//		}
		
//		String nome = null;
//		try {
//			String nomeClasse = "br.gerenciador.acao." + paramAcao;
//			@SuppressWarnings("rawtypes")
//			Class classe = Class.forName(nomeClasse);
//			Acao acao = (Acao) classe.newInstance();
//			nome = acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			throw new ServletException(e);
//		}
		
//		if (paramAcao.equals("ListaEmpresas")) {
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request, response);
//		}
//		else if (paramAcao.equals("RemoveEmpresa")) {
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//		}
//		else if (paramAcao.equals("MostraEmpresa")) {
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(request, response);
//		}
//		else if (paramAcao.equals("AlteraEmpresa")) {
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//		}
//		else if (paramAcao.equals("NovaEmpresa")) {
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request, response);
//		}
//		else if (paramAcao.equals("NovaEmpresaForm")) {
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome = acao.executa(request, response);
//		}
//		else {
//			nome = "redirect:entrada?acao=ListaEmpresas";
//		}
		
//		String [] tipo = nome.split(":");
//		if (tipo[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipo[1]);
//			rd.forward(request, response);
//		} 
//		else if (tipo[0].equals("redirect")) {
//			response.sendRedirect(tipo[1]);
//		}
	}
}