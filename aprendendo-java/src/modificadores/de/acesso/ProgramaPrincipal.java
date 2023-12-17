package modificadores.de.acesso;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO INSTANCIANDO PROFESSOR - package (padrão) <<<<<<<<<<<<<<<<<<<<<<< */
		
		Professor professor = new Professor();
		
		professor.nome = "Juliana";
		professor.materia_de_ensino = "Programação";
		
		System.out.println("Nome: " + professor.nome + " | Ensina a matéria: " + professor.materia_de_ensino);
		
		professor.exibirDadosProfessor(professor.nome, professor.materia_de_ensino);
		
		// ou pode gerar um outro valor
		professor.exibirDadosProfessor("Magali", "Português");
		
		
		System.out.println("\n");
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO INSTANCIANDO CLIENTE - public <<<<<<<<<<<<<<<<<<<<<<< */
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Daniel";
		cliente.idade = 30;
		
		System.out.println("Nome: " + cliente.nome + " | Idade: " + cliente.idade);
		
		cliente.exibirDadosCliente(cliente.nome, cliente.idade); 
		
		
		System.out.println("\n");
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO INSTANCIANDO GERENTE - protected <<<<<<<<<<<<<<<<<<<<<<< */
		
		Gerente gerente = new Gerente();
		gerente.nome = "Davi";
		gerente.funcao = "Analista de sistema";
		
		System.out.println("Nome: " + gerente.nome + " | Função: " + gerente.funcao);
		
		gerente.exibirDadosProtegidosGerente(gerente.nome, gerente.funcao);
		
		
		System.out.println("\n");
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO INSTANCIANDO GERENTE - private <<<<<<<<<<<<<<<<<<<<<<< */
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Vanessa");
		funcionario.setFuncao("Programadora");
		
		System.out.println("Nome: " + funcionario.getNome() + " | Função: " + funcionario.getFuncao());
		
		funcionario.exibirDadosProtegidosFuncionario(funcionario.getNome(), funcionario.getFuncao());
	}
}

/**
 * 1) package-private (padrão): 
 * Quando nenhum modificador de acesso é especificado, o padrão é considerado como "package-private". Os membros são visíveis apenas dentro do mesmo pacote.
 * 
 * 2) public:
 * Os membros (classes, métodos, variáveis) marcados como public são acessíveis de qualquer lugar, tanto dentro quanto fora do pacote em que estão definidos.
 * 
 * 3) protected:
 *  Membros marcados como protected são visíveis para a própria classe, classes no mesmo pacote e classes subclasses (mesmo que estejam em pacotes diferentes).
 *  
 *  4) private:
 *  Membros marcados como private são visíveis apenas dentro da própria classe. Eles não são acessíveis fora da classe, nem mesmo por subclasses.
 * */ 
 