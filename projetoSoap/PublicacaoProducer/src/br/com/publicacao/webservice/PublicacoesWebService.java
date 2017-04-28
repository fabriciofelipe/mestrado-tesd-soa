/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacao.webservice;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.autor.dao.AutorDaoImpl;
import br.com.autor.vo.Autor;
import br.com.publicacao.dao.PublicacaoDaoImpl;
import br.com.publicacao.vo.Publicacao;
import br.com.valida.cpf.service.ValidaCpf;
import br.com.valida.cpf.service.ValidaCpfFacadeImpl;

/**
 *
 * @author labccet
 */

@WebService(targetNamespace = "http://webservice.publicacao.com.br/", portName = "PublicacoesWebServicePort", serviceName = "PublicacoesWebServiceService")
public class PublicacoesWebService {




	@WebMethod(operationName = "buscarPublicacoes", action = "urn:BuscarPublicacoes")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.BuscarPublicacoes", localName = "buscarPublicacoes", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.BuscarPublicacoesResponse", localName = "buscarPublicacoesResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public Publicacao buscarPublicacoes(@WebParam(name = "arg0") String titulo) {
		PublicacaoDaoImpl dao = new PublicacaoDaoImpl();
		Publicacao publicacao = dao.buscarListaPiblicacoes(titulo);
		return publicacao;
	}


	@WebMethod(operationName = "inserirPublicacao", action = "urn:InserirPublicacao")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.InserirPublicacao", localName = "inserirPublicacao", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.InserirPublicacaoResponse", localName = "inserirPublicacaoResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public int inserirPublicacao(@WebParam(name = "arg0") Publicacao publicacao) {
		PublicacaoDaoImpl dao = new PublicacaoDaoImpl();
		return dao.incluirPublicacao(publicacao);
	}

	@WebMethod(operationName = "alterarPublicacao", action = "urn:AlterarPublicacao")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.AlterarPublicacao", localName = "alterarPublicacao", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.AlterarPublicacaoResponse", localName = "alterarPublicacaoResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public int alterarPublicacao(@WebParam(name = "arg0") Publicacao publicacao) {
		PublicacaoDaoImpl dao = new PublicacaoDaoImpl();
		return dao.alterarPublicacao(publicacao);
	}


	@WebMethod(operationName = "excluirPublicacao", action = "urn:ExcluirPublicacao")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.ExcluirPublicacao", localName = "excluirPublicacao", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.ExcluirPublicacaoResponse", localName = "excluirPublicacaoResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public int excluirPublicacao(@WebParam(name = "arg0") int id) {
		PublicacaoDaoImpl dao = new PublicacaoDaoImpl();
		return dao.excluirPublicacao(id);
	}

	@WebMethod(operationName = "buscarAutor", action = "urn:BuscarAutor")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.BuscarAutor", localName = "buscarAutor", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.BuscarAutorResponse", localName = "buscarAutorResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public Autor buscarAutor(@WebParam(name = "arg0") String nome) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.buscarAutor(nome);
	}

	@WebMethod(operationName = "inserirAutor", action = "urn:InserirAutor")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.InserirAutor", localName = "inserirAutor", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.InserirAutorResponse", localName = "inserirAutorResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public int inserirAutor(@WebParam(name = "arg0") Autor autor) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.incluirAutor(autor);
	}

	@WebMethod(operationName = "alterarAutor", action = "urn:AlterarAutor")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.AlterarAutor", localName = "alterarAutor", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.AlterarAutorResponse", localName = "alterarAutorResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public int alterarAutor(@WebParam(name = "arg0") Autor autor) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.alterarAutor(autor);
	}

	@WebMethod(operationName = "excluirAutor", action = "urn:ExcluirAutor")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.ExcluirAutor", localName = "excluirAutor", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.ExcluirAutorResponse", localName = "excluirAutorResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public int excluirAutor(@WebParam(name = "arg0") Autor autor) {
		AutorDaoImpl dao = new AutorDaoImpl();
		return dao.excluirAutor(autor);
	}
	
	@WebMethod(operationName = "isCPF", action = "urn:IsCPF")
	@RequestWrapper(className = "br.com.publicacao.webservice.jaxws.IsCPF", localName = "isCPF", targetNamespace = "http://webservice.publicacao.com.br/")
	@ResponseWrapper(className = "br.com.publicacao.webservice.jaxws.IsCPFResponse", localName = "isCPFResponse", targetNamespace = "http://webservice.publicacao.com.br/")
	@WebResult(name = "return")
	public boolean isCPF(@WebParam(name = "arg0") String cpf){
		ValidaCpfFacadeImpl validaCpf = new ValidaCpfFacadeImpl();
		return validaCpf.isCPF(cpf);
	}
}
