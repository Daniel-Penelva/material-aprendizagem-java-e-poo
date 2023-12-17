package heranca.modificador.acessoPrivate;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A Classe Funcion�rio v�o herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cpf e rg da classe PessoaFisica e v�o acessar 
* as suas pr�prias propriedades espec�ficas (cargo e sal�rio).
* V�o herdar todas as propriedades!!!*/
		
		Funcionario funcionario = new Funcionario();
		
		// As propriedades pertencentes a classe Pessoa - usando protected
		funcionario.setNome("Daniel");
		
		Cidade cidadeSP = new Cidade();
		cidadeSP.setCidade("S�o Paulo");
		cidadeSP.setEstado("SP"); 
		
		funcionario.setCidade(cidadeSP);
		
		// Propriedades Pertencente a classe Pessoa F�sica
		funcionario.setCpf("11111111111"); 
		funcionario.setRg("2222222222");
		
		// Propriedades espec�fica da classe Funcionario
		funcionario.setCargo("Analista de Dados");
		funcionario.setSalario(3000D);
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Funcion�rio");
		System.out.println("Nome: " + funcionario.getNome() + " - Cidade: " + funcionario.getCidade().getCidade() + " - Estado: " + funcionario.getCidade().getEstado() 
				 + " - CPF: " + funcionario.getCpf() + " RG: " + funcionario.getRg() + " - Cargo: " + funcionario.getCargo() + " - Sal�rio: " + funcionario.getSalario());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A Classe Fornecedor v�o herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cnpj e razao social da classe PessoaJuridica e 
* v�o acessar as suas pr�prias propriedades espec�ficas (cargo e sal�rio).
* V�o herdar todas as propriedades!!!*/
		
		Fornecedor fornecedor = new Fornecedor();
		
		// As propriedades pertencentes a classe Pessoa - usando protected
		fornecedor.setNome("Pedro");
				
		Cidade cidadeRJ = new Cidade();
		cidadeRJ.setCidade("Rio de Janeiro");
		cidadeRJ.setEstado("RJ");
				
		fornecedor.setCidade(cidadeRJ);
		
		// Propriedades Pertencente a classe Pessoa Juridica
		fornecedor.setCnpj("79.178.777/0001-09");
		fornecedor.setRazaoSocial("Empresa X");
		
		// Propriedades espec�fica da classe Fornecedor
		List<String> produtoFornecidos = new ArrayList<String>();
		
		produtoFornecidos.add("Notebook Samsung");
		produtoFornecidos.add("impressora 3D");
		
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Fornecedor");
		System.out.println("Nome: " + fornecedor.getNome() + " - Cidade: " + fornecedor.getCidade().getCidade() + " - Estado: " + fornecedor.getCidade().getEstado() 
				 + " - CNPJ: " + fornecedor.getCnpj() + " Raz�o Social: " + fornecedor.getRazaoSocial());
		
		System.out.println("Produtos Fornecidos");
		for(String produtos : produtoFornecidos) {
			System.out.println(produtos + " :: ");
		}
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A Classe PessoaFisica v�o herdar as propriedades nome e cidade da Classe Pessoa e v�o acessar as suas pr�prias propriedades espec�ficas (cpf e rg). */
		
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		// As propriedades pertencentes a classe Pessoa - usando protected
		pessoaFisica.setNome("Pablo");
		
		Cidade cidadeMG = new Cidade();
		cidadeMG.setCidade("Minas Gerais");
		cidadeMG.setEstado("MG");
		
		pessoaFisica.setCidade(cidadeMG);
		
		// Propriedades espec�fica da classe PessoaFisica
		pessoaFisica.setCpf("3455678932");
		pessoaFisica.setRg("9993332212");
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Pessoa F�sica");
		System.out.println("Nome: " + pessoaFisica.getNome() + " - Cidade: " + pessoaFisica.getCidade().getCidade() + " - Estado: " + pessoaFisica.getCidade().getEstado()
				+ " - CPF: " + pessoaFisica.getCpf() + " RG: " + pessoaFisica.getRg());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		/** A Classe Pessoa v�o acessar as suas pr�prias propriedades espec�ficas (nome e cidade). */
		
		
		Pessoa pessoa = new Pessoa();
		
		// Propriedades espec�fica da classe Pessoa - usando protected
		pessoa.setNome("Joelma");
		
		Cidade cidadeES = new Cidade();
		cidadeES.setCidade("Espirito Santos");
		cidadeES.setEstado("ES");
		
		pessoa.setCidade(cidadeES);
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Pessoa F�sica");
		System.out.println("Nome: " + pessoa.getNome() + " - Cidade: " + pessoa.getCidade().getCidade() + " - Estado: " + pessoa.getCidade().getEstado());

	}

}
