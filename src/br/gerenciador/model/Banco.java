package br.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chave = 1;
	
	static {
		lista.add(new Empresa(chave++, "Tesla"));
		lista.add(new Empresa(chave++, "Google"));
		lista.add(new Empresa(chave++, "Amazon"));
		listaUsuarios.add(new Usuario("lucas", "123456"));
		listaUsuarios.add(new Usuario("malu", "123456"));
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
	public Integer novaChave() {
		return Banco.chave++;
	}
	
	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaById(Integer id) {
		for (Empresa emp: lista) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario: listaUsuarios) {
			if (usuario.igual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}