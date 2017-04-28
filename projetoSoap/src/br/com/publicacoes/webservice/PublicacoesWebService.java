/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacoes.webservice;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.publicacoes.dao.PublicacaoDaoImpl;
import br.com.publicacoes.vo.Publicacao;

/**
 *
 * @author labccet
 */
@WebService(serviceName = "PublicacoesWebService")
public class PublicacoesWebService {
      
	@Autowired
	PublicacaoDaoImpl dao;


    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public Publicacao buscarPublicacoes(@WebParam(name="titulo") String titulo) {
       // PublicacaoDaoImpl dao = new PublicacaoDaoImpl();
        Publicacao publicacao = dao.buscarListaPiblicacoes(titulo);
        return publicacao;
    }
}
