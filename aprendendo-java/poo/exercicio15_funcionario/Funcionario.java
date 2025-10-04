package exercicio15_funcionario;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private double salario;
	
	private static int contador = 0;  // Variável de classe (compartilhada entre todos os objetos)

	// Construtores
	public Funcionario() {
		contador++;   // sempre que criar um funcionário, incrementa
	}

	public Funcionario(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		contador++;   // incrementa sempre que um novo funcionário é criado
	}

	// Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Método para calcular o aumento de 10% (0.1) do salário
	public double aumentoSalarial() {
		return salario + (salario * 0.1);
	}

	// Método para calcular o salario anual
	public double salarioAnual() {
		return salario * 12;
	}
	
	// Método para calcular o salario anual com aumento
	public double salarioAnualComAumento() {
		return aumentoSalarial() * 12;
	}

	// Método para contabilizar o número de funcionários
	public static int getTotalDeFuncionarios() {
		return contador;
	}

}
