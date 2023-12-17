package modelo.diagrama.de.classe;

public class Diretor extends Funcionario {

	@Override
	public double calcularSalario() {
		return getSalario() + (getSalario() * 0.10);
	}

	// Construtor
	public Diretor() {
		super(); // Este super é do Funcionario
	}

	public Diretor(String nome, String cpf, Double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}

}
