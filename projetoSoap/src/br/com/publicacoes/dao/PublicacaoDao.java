/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacoes.dao;

import br.com.publicacoes.vo.Publicacao;

/**
 *
 * @author labccet
 */
public interface PublicacaoDao {
    
     public Publicacao buscarListaPiblicacoes(String titulo);
}
