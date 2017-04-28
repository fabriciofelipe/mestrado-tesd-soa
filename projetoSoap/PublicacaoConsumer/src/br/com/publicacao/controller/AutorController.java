package br.com.publicacao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.publicacao.webservice.Autor;
import br.com.publicacao.webservice.PublicacoesWebServiceService;
import br.com.publicaco.correios.AtendeClienteService;
import br.com.publicaco.correios.EnderecoERP;
import br.com.publicaco.correios.SQLException_Exception;
import br.com.publicaco.correios.SigepClienteException;
@Controller
public class AutorController {



	@RequestMapping("/consultarAutores")
	public String consultarAutores(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Autor autor  = service.getPublicacoesWebServicePort().buscarAutor(httpServletRequest.getParameter("titulo"));
		model.addAttribute("autor", autor);
		return "autores";
	}

	@RequestMapping("/autores")
	public String autores(Model model, HttpServletRequest httpServletRequest){
		return "autores";
	}
	
	@RequestMapping("/cadastrarAutor")
	public String cadastrarAutor(Model model, HttpServletRequest httpServletRequest){
		return "cadastrarAutor";
	}
	
	@RequestMapping(value = "/buscaEndereco", method = RequestMethod.POST)
	public String buscaEndereco(@ModelAttribute("SpringWeb") Autor autor, ModelMap model, HttpServletRequest request) throws SigepClienteException, SQLException_Exception {
				AtendeClienteService buscarEndereco = new AtendeClienteService();
				EnderecoERP enderecoERP = buscarEndereco.getAtendeClientePort().consultaCEP(autor.getEndereco().getCep().toString());
				autor.getEndereco().setBairro(enderecoERP.getBairro());
				autor.getEndereco().setCidade(enderecoERP.getCidade());
				autor.getEndereco().setEndereco(enderecoERP.getEnd());
				autor.getEndereco().setUf(enderecoERP.getUf());
				model.addAttribute("autor", autor);
			return "cadastrarAutor";
	}
	
	@RequestMapping(value = "/addAutor", method = RequestMethod.POST)
	public String addAutor(@ModelAttribute("SpringWeb") Autor autor, ModelMap model, HttpServletRequest request) throws SigepClienteException, SQLException_Exception {
			if(autor.getCpf() != null && autor.getEndereco().getEndereco().isEmpty()){
				PublicacoesWebServiceService service = new PublicacoesWebServiceService();
				boolean ret = service.getPublicacoesWebServicePort().isCPF(autor.getCpf());
				if(ret == true){
					request.setAttribute("cpfValido", ret);
					model.addAttribute("autor", autor);
				} else{
					request.setAttribute("cpfInvalido", true);
				}
			} else if(autor.getEndereco().getEndereco().equals("buscarEndereco,") && autor.getCpf() != null){
				AtendeClienteService buscarEndereco = new AtendeClienteService();
				EnderecoERP enderecoERP = buscarEndereco.getAtendeClientePort().consultaCEP(autor.getEndereco().getCep().toString());
				autor.getEndereco().setBairro(enderecoERP.getBairro());
				autor.getEndereco().setCidade(enderecoERP.getCidade());
				autor.getEndereco().setEndereco(enderecoERP.getEnd());
				autor.getEndereco().setUf(enderecoERP.getUf());
				model.addAttribute("autor", autor);
			} else{
				PublicacoesWebServiceService service = new PublicacoesWebServiceService();
				int ret = service.getPublicacoesWebServicePort().inserirAutor(autor);
				request.setAttribute("incluir", ret);
				request.setAttribute("cpfValido", false);
				
			}
		return "cadastrarAutor";

	}
	
	@RequestMapping("/alterarAutor")
	public String alterarAutor(Model model, HttpServletRequest httpServletRequest){
		return "alterarAutor";
	}
	
	@RequestMapping("/consultarAlterarAutores")
	public String consultarAlterarAutores(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Autor autor  = service.getPublicacoesWebServicePort().buscarAutor(httpServletRequest.getParameter("titulo"));
		model.addAttribute("autor", autor);
		return "alterarAutor";
	}
	
	@RequestMapping(value = "/alterAutor", method = RequestMethod.POST)
	public String alterAutor(@ModelAttribute("SpringWeb") Autor autor, ModelMap model, HttpServletRequest request) {
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
			int ret = service.getPublicacoesWebServicePort().alterarAutor(autor);
			request.setAttribute("alterar", ret);
		return "alterarAutor";

	}
	
	@RequestMapping("/consultarExcluirAutores")
	public String consultarExcluirAutores(Model model, HttpServletRequest httpServletRequest){
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
		Autor autor  = service.getPublicacoesWebServicePort().buscarAutor(httpServletRequest.getParameter("titulo"));
		model.addAttribute("autor", autor);
		return "excluirAutor";
	}
	
	@RequestMapping("/excluirAutor")
	public String excluirAutor(Model model, HttpServletRequest httpServletRequest){
		return "excluirAutor";
	}
	
	@RequestMapping(value = "/excluirAutor", method = RequestMethod.POST)
	public String excluirAutor(@ModelAttribute("SpringWeb") Autor autor, ModelMap model, HttpServletRequest request) {
		PublicacoesWebServiceService service = new PublicacoesWebServiceService();
			int ret = service.getPublicacoesWebServicePort().excluirAutor(autor);
			request.setAttribute("excluir", ret);
		return "excluirAutor";

	}
	
}