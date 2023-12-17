package modificadores.de.acesso;

public class Professor {
	
	String nome;
	
	String materia_de_ensino;
	
	void exibirDadosProfessor(String nome, String materia_de_ensino) {
		System.out.println("Nome professor(a) é " + nome + " e ensina " + materia_de_ensino);
	}

}
