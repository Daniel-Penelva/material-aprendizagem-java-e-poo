package exception.exemplo4.excecao.personalizada;

public class ValidacaoUtilCPFeCNPJ {

	public static void validarCpf(String cpf) throws CPFInvalidaException
	 {
		 System.out.println("Testando valida��o");
		 cpf = cpf.replace(".",""); //replace substitui os pontos e o tra�o
		 cpf = cpf.replace("-","");
		 
		  if(cpf.length() != 11){ // para ser CPF v�lido n�o pode ser diferente de 11 caracteres.
			  throw new CPFInvalidaException(); 
		  }
	 }
	 
	 
	public static void validaCnpj(Long cnpj) { // Essa exce��o n�o precisa ser tratada, pois pertence a classe da RuntimeException
		System.out.println("Validando Cnpj: " + cnpj);
		throw new IllegalArgumentException();
	}
	
	
	public static void validandoCNPJ(String CNPJ) throws CNPJInvalidaException {
		
		System.out.println("Validando Cnpj: " + CNPJ);
		CNPJ = CNPJ.replace(".","");
		CNPJ = CNPJ.replace("/","");
		CNPJ = CNPJ.replace(".","");
		
		if(CNPJ.length() != 14){
		  throw new CNPJInvalidaException();
		}
	}
}
