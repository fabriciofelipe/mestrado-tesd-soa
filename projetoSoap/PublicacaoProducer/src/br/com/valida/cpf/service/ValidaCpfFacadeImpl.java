package br.com.valida.cpf.service;

import org.springframework.stereotype.Service;

@Service
public class ValidaCpfFacadeImpl {
	
	public boolean isCPF(String cpf){
		ValidaCpf validaCpf = new ValidaCpf();
		return validaCpf.isCPF(cpf);
	}

}
