package br.com.autor.webservice;

import java.text.ParseException;

import br.com.autor.dao.AutorDaoImpl;
import br.com.autor.vo.Autor;

public class teste {
	
	public static void main(String[] args) throws ParseException {
		
		AutorDaoImpl dao = new AutorDaoImpl();
		Autor autor = new Autor();
		autor.setCpf("08907925771");
		autor.setNome("Fabricio Felipe");
		autor.setNomeCitacao("Computadores s�o in�teis. Eles s� podem dar respostas.PICASSO, P.");
		autor.getEndereco().setCep(26553240);
		autor.getEndereco().setBairro("Centro");
		autor.getEndereco().setCidade("Mesquita");
		autor.getEndereco().setId(10);
		autor.getEndereco().setUf("RJ");
		autor.getEndereco().setEndereco("Rua virtude");
		dao.incluirAutor(autor);
		//autor.setId(1);
		//autor.getEndereco().setId(1);
		//autor.getEndereco().setIdAutor(autor.getId());
		//dao.alterarAutor(autor);
		
		//dao.excluirAutor(autor);
		
		
		
	}
	
}
