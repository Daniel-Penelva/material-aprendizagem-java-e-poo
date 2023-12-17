package modelo.diagrama.de.classe;

public class Analista extends Funcionario {

	@Override
	public double calcularSalario() {
		return getSalario() + (getSalario() * 5 / 100);
	}

	public Analista() {
		super(); // este super é do Funcionario
	}

	public Analista(String nome, String cpf, Double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}
}
