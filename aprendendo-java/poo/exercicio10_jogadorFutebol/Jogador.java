package exercicio10_jogadorFutebol;

import java.time.LocalDate;

public class Jogador {

	private String nome;
	private String posicao;
	private Data dataNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;

	// Construtores
	public Jogador() {

	}

	public Jogador(String nome, String posicao, Data dataNascimento, String nacionalidade, double altura, double peso) {
		super();
		this.nome = nome;
		this.posicao = posicao;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}

	// Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Método para imprimir dos dados do jogador
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Posição do jogador: " + posicao);
		System.out.println("Data Nascimento: " + dataNascimento.getDia() + "/" + dataNascimento.getMes() + "/"
				+ dataNascimento.getAno());
		System.out.println("Nacionalidade: " + nacionalidade);
		System.out.println("Altura: " + altura + " cm");
		System.out.println("Peso: " + peso + " kg");
	}

	// Método para retornar a idade do jogador
	public int idadeJogador() {
		LocalDate dataAtual = LocalDate.now();

		int idade = dataAtual.getYear() - dataNascimento.getAno();
		return idade;
	}

	// Método para saber aposentadoria
	public void aposentar() {
		int idadeAposentar = idadeJogador();

		switch (posicao) {
		case "DEFESA":
			if (idadeAposentar >= 40) {
				System.out.println("APOSENTADO!");
			} else {
				System.out.println("NÃO está aposentado!");
			}
			break;
		case "MEIO-CAMPO":
			if (idadeAposentar >= 38) {
				System.out.println("APOSENTADO!");
			} else {
				System.out.println("NÃO está aposentado!");
			}
			break;
		case "ATACANTE":
			if (idadeAposentar >= 35) {
				System.out.println("APOSENTADO!");
			} else {
				System.out.println("NÃO está aposentado!");
			}
			break;
		default:
			System.out.println("Opção Inválida para posição do jogador!");
			break;
		}
	}

}
