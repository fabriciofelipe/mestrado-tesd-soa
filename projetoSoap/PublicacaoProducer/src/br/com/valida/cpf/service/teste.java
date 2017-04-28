package br.com.valida.cpf.service;

public class teste {

	public static void main(String[] args) {
		
		ValidaCpfFacadeImpl cpfService = new ValidaCpfFacadeImpl();
		if(cpfService.isCPF("08907925771")){
			System.out.println("CPF valido");
		}else{
			System.out.println("CPF invalido");
		}
		
		// Scanner ler = new Scanner(System.in);

		//   String CPF;

		//    System.out.printf("Informe um CPF: ");
		//  CPF = ler.next();

		//System.out.printf("\nResultado: ");
		// usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
		//if (ValidaCpf.isCPF(CPF) == true)
		// System.out.printf("%s\n", ValidaCpf.imprimeCPF(CPF));
		//else System.out.printf("Erro, CPF invalido !!!\n");
	}

}
