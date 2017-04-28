package br.com.publicacao.webservice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.publicacao.dao.PublicacaoDaoImpl;
import br.com.publicacao.vo.Publicacao;

public class teste {
	
	public static void main(String[] args) throws ParseException {
		PublicacaoDaoImpl service = new PublicacaoDaoImpl();
		Publicacao publicacao = service.buscarListaPiblicacoes("Architecture");
		System.out.println(publicacao);
		Publicacao publicacao1 = new Publicacao();
		publicacao1.setTitulo(" ResearchOps: The case for DevOps in scientific applications.");
		publicacao1.setPagInicial(1398);
		publicacao1.setPagFinal(1404);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = (Date)formatter.parse("01/01/2015");
		publicacao1.setDataPublicacao(date);
		publicacao1.setId(6);
		service.incluirPublicacao(publicacao1);
		//service.alterarPublicacao(publicacao1);
		//service.excluirPublicacao(6);
		//System.out.println("teste com autowired " + webService.buscarPublicacoes("Architecture"));
	}
	
}