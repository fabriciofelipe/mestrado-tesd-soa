package br.com.publicacao.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.publicacao.webservice.Publicacao;
import br.com.publicacao.webservice.PublicacoesWebService;
import br.com.publicacao.webservice.PublicacoesWebServiceService;
@SpringBootApplication
@Controller
public class PublicacaoController {


	//@Autowired
	//PublicacoesWebService service;

	@RequestMapping(value = "/")
	public String index(){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Publicacao publicacao = service.getPublicacoesWebServicePort().buscarPublicacoes("Architecture");
		System.out.println(publicacao);
		return "index";
	}

	@RequestMapping("/publicacoes")
	public String publicacoes(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Publicacao publicacao = service.getPublicacoesWebServicePort().buscarPublicacoes(httpServletRequest.getParameter("titulo"));
		model.addAttribute("publicacao", publicacao);
		return "publicacoes";
	}

	@RequestMapping("/cadastrarPublicacao")
	public String cadastrarPublicacao(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Publicacao publicacao = service.getPublicacoesWebServicePort().buscarPublicacoes(httpServletRequest.getParameter("titulo"));
		List<Publicacao> publicacoes = new ArrayList<Publicacao>();
		publicacoes.add(publicacao);
		model.addAttribute("publicacao", publicacao);
		return "cadastrarPublicacao";
	}

	@RequestMapping("/alterarPublicacao")
	public String alterarPublicacao(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Publicacao publicacao = service.getPublicacoesWebServicePort().buscarPublicacoes(httpServletRequest.getParameter("titulo"));
		List<Publicacao> publicacoes = new ArrayList<Publicacao>();
		publicacoes.add(publicacao);
		model.addAttribute("publicacao", publicacao);
		return "alterarPublicacao";
	}
	
	@RequestMapping("/excluirPublicacao")
	public String excluirPublicacao(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Publicacao publicacao = service.getPublicacoesWebServicePort().buscarPublicacoes(httpServletRequest.getParameter("titulo"));
		List<Publicacao> publicacoes = new ArrayList<Publicacao>();
		publicacoes.add(publicacao);
		model.addAttribute("publicacao", publicacao);
		return "excluirPublicacao";
	}
	
	@RequestMapping(value = "/addPublicacao", method = RequestMethod.POST)
	public String addPublicacao(@ModelAttribute("SpringWeb") Publicacao publicacao, ModelMap model, HttpServletRequest request) {
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
			int ret = service.getPublicacoesWebServicePort().inserirPublicacao(publicacao);
			request.setAttribute("incluir", ret);
		return "cadastrarPublicacao";

	}
	
	@RequestMapping(value = "/alterPublicacao", method = RequestMethod.POST)
	public String alterPublicacao(@ModelAttribute("SpringWeb") Publicacao publicacao, ModelMap model, HttpServletRequest request) {
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
			int ret = service.getPublicacoesWebServicePort().alterarPublicacao(publicacao);
			request.setAttribute("alterar", ret);
		return "alterarPublicacao";

	}
	
	@RequestMapping(value = "/excPublicacao", method = RequestMethod.POST)
	public String excPublicacao(@ModelAttribute("SpringWeb") Publicacao publicacao, ModelMap model, HttpServletRequest request) {
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
			int ret = service.getPublicacoesWebServicePort().excluirPublicacao(publicacao.getId());
			request.setAttribute("excluir", ret);
		return "excluirPublicacao";

	}
}
