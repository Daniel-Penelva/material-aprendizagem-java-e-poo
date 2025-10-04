package exercicio7_funcionario;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

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
		if (salario <= 0) {
			this.salario = 0.0;
		} else {
			this.salario = salario;
		}
	}

	public void salarioAnual() {
		double salarioAnual = salario * 12;
		System.out.println("O funcionário " + nome + " tem um salário anual de R$ " + salarioAnual);
	}

	public void aumentoSalarial() {
		double novoSalario = salario + (salario * 0.1); // 10% = 0.1
		System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario
				+ " recebeu aumento salarial de 10% R$ " + novoSalario);
		;
	}

}
