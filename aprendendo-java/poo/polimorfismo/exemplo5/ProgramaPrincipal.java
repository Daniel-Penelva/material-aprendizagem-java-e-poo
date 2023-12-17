package polimorfismo.exemplo5;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/**A classe Pessoa por ser a classe base só irá enxergar as propriedades da classe Pessoa. */
		Pessoa pessoa = new Funcionario();
		
		Cidade cidadeRJ = new Cidade();
		cidadeRJ.setCidade("Rio de Janeiro");
		cidadeRJ.setEstado("RJ");
		
		pessoa.setCidade(cidadeRJ);
		pessoa.setNome("Daniel");
		
		System.out.println("Nome: " + pessoa.getNome() + " Cdiade: " + pessoa.getCidade().getCidade() + " Estado: " + pessoa.getCidade().getEstado());
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A classe PessoaFisica por ser a classe base irá enxergar tanto as propriedades da sua classe quanto as propriedades da Pessoa que a extende. */
		PessoaFisica pessoaFisica = new Funcionario();
		
		pessoaFisica.setNome("Pedro");
		
		Cidade cidadeMG = new Cidade();
		cidadeMG.setCidade("Minas Gerais");
		cidadeMG.setEstado("MG");
		
		pessoaFisica.setCidade(cidadeMG);
		pessoaFisica.setCpf("11123455433");
		pessoaFisica.setRg("2222222222");
		
		System.out.println("Nome: " + pessoaFisica.getNome() + " Cdiade: " + pessoaFisica.getCidade().getCidade() + " Estado: " + pessoaFisica.getCidade().getEstado()
				+ " CPF: " + pessoaFisica.getCpf() + " RG" + pessoaFisica.getRg());

	}
}
