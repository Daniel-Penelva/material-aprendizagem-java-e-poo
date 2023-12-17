package modificadores.de.acesso;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO INSTANCIANDO PROFESSOR - package (padr�o) <<<<<<<<<<<<<<<<<<<<<<< */
		
		Professor professor = new Professor();
		
		professor.nome = "Juliana";
		professor.materia_de_ensino = "Programa��o";
		
		System.out.println("Nome: " + professor.nome + " | Ensina a mat�ria: " + professor.materia_de_ensino);
		
		professor.exibirDadosProfessor(professor.nome, professor.materia_de_ensino);
		
		// ou pode gerar um outro valor
		professor.exibirDadosProfessor("Magali", "Portugu�s");
		
		
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
		
		System.out.println("Nome: " + gerente.nome + " | Fun��o: " + gerente.funcao);
		
		gerente.exibirDadosProtegidosGerente(gerente.nome, gerente.funcao);
		
		
		System.out.println("\n");
		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO INSTANCIANDO GERENTE - private <<<<<<<<<<<<<<<<<<<<<<< */
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Vanessa");
		funcionario.setFuncao("Programadora");
		
		System.out.println("Nome: " + funcionario.getNome() + " | Fun��o: " + funcionario.getFuncao());
		
		funcionario.exibirDadosProtegidosFuncionario(funcionario.getNome(), funcionario.getFuncao());
	}
}

/**
 * 1) package-private (padr�o): 
 * Quando nenhum modificador de acesso � especificado, o padr�o � considerado como "package-private". Os membros s�o vis�veis apenas dentro do mesmo pacote.
 * 
 * 2) public:
 * Os membros (classes, m�todos, vari�veis) marcados como public s�o acess�veis de qualquer lugar, tanto dentro quanto fora do pacote em que est�o definidos.
 * 
 * 3) protected:
 *  Membros marcados como protected s�o vis�veis para a pr�pria classe, classes no mesmo pacote e classes subclasses (mesmo que estejam em pacotes diferentes).
 *  
 *  4) private:
 *  Membros marcados como private s�o vis�veis apenas dentro da pr�pria classe. Eles n�o s�o acess�veis fora da classe, nem mesmo por subclasses.
 * */ 
 