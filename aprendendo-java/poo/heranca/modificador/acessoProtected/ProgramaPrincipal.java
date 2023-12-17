package heranca.modificador.acessoProtected;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A Classe Funcionário vão herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cpf e rg da classe PessoaFisica e vão acessar 
* as suas próprias propriedades específicas (cargo e salário).
* Vão herdar todas as propriedades!!!*/
		
		Funcionario funcionario = new Funcionario();
		
		// As propriedades pertencentes a classe Pessoa - usando protected
		funcionario.nome = "Daniel";
		
		Cidade cidadeSP = new Cidade();
		cidadeSP.cidade = "São Paulo";
		cidadeSP.estado = "SP";
		
		funcionario.cidade = cidadeSP;
		
		// Propriedades Pertencente a classe Pessoa Física
		funcionario.cpf = "11111111111";
		funcionario.rg = "2222222222";
		
		// Propriedades específica da classe Funcionario
		funcionario.cargo = "Analista de Dados";
		funcionario.salario = 3000D;
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Funcionário");
		System.out.println("Nome: " + funcionario.nome + " - Cidade: " + funcionario.cidade.cidade + " - Estado: " + funcionario.cidade.estado 
				 + " - CPF: " + funcionario.cpf + " RG: " + funcionario.rg + " - Cargo: " + funcionario.cargo + " - Salário: " + funcionario.salario);
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A Classe Fornecedor vão herdar as propriedades nome e cidade da Classe Pessoa e as propriedades cnpj e razao social da classe PessoaJuridica e 
* vão acessar as suas próprias propriedades específicas (cargo e salário).
* Vão herdar todas as propriedades!!!*/
		
		Fornecedor fornecedor = new Fornecedor();
		
		// As propriedades pertencentes a classe Pessoa - usando protected
		fornecedor.nome = "Pedro";
				
		Cidade cidadeRJ = new Cidade();
		cidadeRJ.cidade = "Rio de Janeiro";
		cidadeRJ.estado = "RJ";
				
		fornecedor.cidade = cidadeRJ;
		
		// Propriedades Pertencente a classe Pessoa Juridica
		fornecedor.cnpj = "79.178.777/0001-09";
		fornecedor.razaoSocial = "Empresa X";
		
		// Propriedades específica da classe Fornecedor
		List<String> produtoFornecidos = new ArrayList<String>();
		
		produtoFornecidos.add("Notebook Samsung");
		produtoFornecidos.add("impressora 3D");
		
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Fornecedor");
		System.out.println("Nome: " + fornecedor.nome + " - Cidade: " + fornecedor.cidade.cidade + " - Estado: " + fornecedor.cidade.estado 
				 + " - CNPJ: " + fornecedor.cnpj + " Razão Social: " + fornecedor.razaoSocial);
		
		System.out.println("Produtos Fornecidos");
		for(String produtos : produtoFornecidos) {
			System.out.println(produtos + " :: ");
		}
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
/** A Classe PessoaFisica vão herdar as propriedades nome e cidade da Classe Pessoa e vão acessar as suas próprias propriedades específicas (cpf e rg). */
		
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		// As propriedades pertencentes a classe Pessoa - usando protected
		pessoaFisica.nome = "Pablo";
		
		Cidade cidadeMG = new Cidade();
		cidadeMG.cidade = "Minas Gerais";
		cidadeMG.estado = "MG";
		
		pessoaFisica.cidade = cidadeMG;
		
		// Propriedades específica da classe PessoaFisica
		pessoaFisica.cpf = "3455678932";
		pessoaFisica.rg = "9993332212";
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Pessoa Física");
		System.out.println("Nome: " + pessoaFisica.nome + " - Cidade: " + pessoaFisica.cidade.cidade + " - Estado: " + pessoaFisica.cidade.estado 
				+ " - CPF: " + pessoaFisica.cpf + " RG: " + pessoaFisica.rg);
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		/** A Classe Pessoa vão acessar as suas próprias propriedades específicas (nome e cidade). */
		
		
		Pessoa pessoa = new Pessoa();
		
		// Propriedades específica da classe Pessoa - usando protected
		pessoa.nome = "Joelma";
		
		Cidade cidadeES = new Cidade();
		cidadeES.cidade = "Espirito Santos";
		cidadeES.estado = "ES";
		
		pessoa.cidade = cidadeES;
		
		// Imprimir Resultado - usando protected
		System.out.println("Acessando Pessoa Física");
		System.out.println("Nome: " + pessoa.nome + " - Cidade: " + pessoa.cidade.cidade + " - Estado: " + pessoa.cidade.estado);

	}

}
