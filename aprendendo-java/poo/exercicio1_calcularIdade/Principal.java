package exercicio1_calcularIdade;

import java.time.LocalDate;

public class Principal {
	/*
	 * Enunciado: Crie uma classe para representar uma Pessoa com os atributos
	 * privados de nome, data de nascimento e altura. Crie os métodos públicos
	 * necessários para getters e setters e também um método para imprimir todos
	 * dados de uma pessoa. Crie um método para calcular a idade da pessoa.
	 */
	public static void main(String[] args) {

		// <<< Fazendo pelo os métodos getters e setters >>>
		Pessoa p1 = new Pessoa();
		p1.setNome("Daniel");
		p1.setDataNascimento(LocalDate.of(1987, 12, 17));
		p1.setAltura(1.73);

		p1.imprimirDados();

		System.out.println("-------------------------");
		
		// <<< Ou pode fazer pelo construtor >>>

		Pessoa p2 = new Pessoa("Vanessa", LocalDate.of(2000, 5, 21), 1.64);

		p2.imprimirDados();

	}
}
