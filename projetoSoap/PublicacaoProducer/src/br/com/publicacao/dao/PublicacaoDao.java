/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacao.dao;

import br.com.publicacao.vo.Publicacao;

/**
 *
 * @author labccet
 */
public interface PublicacaoDao {
    
     public Publicacao buscarListaPiblicacoes(String titulo);
     
     public int incluirPublicacao(Publicacao publicacao);
     
     public int alterarPublicacao(Publicacao publicacao);

     public int excluirPublicacao(int id);
}
