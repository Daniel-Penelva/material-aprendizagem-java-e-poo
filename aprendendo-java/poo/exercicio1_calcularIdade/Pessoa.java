package exercicio1_calcularIdade;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private double altura;

	// Construtores
	public Pessoa() {

	}

	public Pessoa(String nome, LocalDate dataNascimento, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	// Getter e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método para calcular idade
	public int calcularIdade() {
		LocalDate hoje = LocalDate.now();
		return Period.between(this.dataNascimento, hoje).getYears();
	}

	// Método para imprimir os dados
	public void imprimirDados() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento.format(formato));
		System.out.println("Altura: " + altura + " m");
		System.out.println("Idade: " + calcularIdade() + " anos");
	}

}
