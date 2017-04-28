/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autor.webservice;


import br.com.autor.dao.AutorDaoImpl;
import br.com.autor.vo.Autor;

/**
 *
 * @author labccet
 */
public class AutorWebService {


	
	public Autor buscarAutor(String nome) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.buscarAutor(nome);
	}

	public int inserirAutor(Autor autor) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.incluirAutor(autor);
	}
	
	public int alterarAutor(Autor autor) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.alterarAutor(autor);
	}
	
	public int excluirAutor(Autor autor) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.excluirAutor(autor);
	}
}
