package modelo.diagrama.de.classe;

public class Aluno extends PessoaFisica {

	private String matricula;

	private static int qtdAluno = 0;

	public Aluno() {
		qtdAluno++;
	}

	public static int getQtdAluno() {
		return qtdAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}