/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autor.dao;

import br.com.autor.vo.Autor;

/**
 *
 * @author labccet
 */
public interface AutorDao {
    
     public Autor buscarAutor(String nome);
     
     public int incluirAutor(Autor autor);
     
     public int alterarAutor(Autor autor);

     public int excluirAutor(Autor autor);
}