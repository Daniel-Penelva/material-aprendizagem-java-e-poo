package exercicio5_aluno;

public class Aluno {

	private String matricula;
	private String nome;
	private double nota1; // peso 2.5
	private double nota2; // peso 2.5
	private double notaTrabalho; // peso 2

	// Construtores
	public Aluno() {

	}

	public Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaTrabalho = notaTrabalho;
	}

	// Métodos Getters e Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}

	public double media() {
		double calculandoPeso = (nota1 * 2.5) + (nota2 * 2.5) + (notaTrabalho * 2); // peso = 2.5 + 2.5 + 2 = 7
		double mediaFinal = calculandoPeso / 7;
		return mediaFinal;
	}

	public double provaFinal(double mediaMínima) {
		// OBS. Média Mínima define a média de aprovação

		double mediaFinal = media();

		if (mediaMínima >= mediaFinal) {
			double notaNecessaria = (mediaMínima * 2) - mediaFinal;
			return notaNecessaria;
		}

		return 0;
	}

}
