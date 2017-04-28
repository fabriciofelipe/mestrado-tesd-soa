package br.com.publicacao.webservice;

import br.com.publicaco.correios.SQLException_Exception;
import br.com.publicaco.correios.SigepClienteException;

public class teste {
	
	public static void main(String[] args) throws SigepClienteException, SQLException_Exception {
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Publicacao publicacao = service.getPublicacoesWebServicePort().buscarPublicacoes("Architecture");
		System.out.println(publicacao);
		
		Autor autor = service.getPublicacoesWebServicePort().buscarAutor("Fabricio");
		System.out.println(autor);
		System.out.println(service.getPublicacoesWebServicePort().buscarPublicacoes("Architecture"));
		//System.out.println("teste com autowired " + webService.buscarPublicacoes("Architecture"));
		///AtendeClienteService cep = new AtendeClienteService();
		//System.out.println(cep.getAtendeClientePort().consultaCEP("26553240"));
		
	}
	
}
