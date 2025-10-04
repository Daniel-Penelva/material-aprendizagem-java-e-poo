package exercicio15_funcionario;

import java.util.Scanner;

public class FuncionarioTeste {
/*Enunciado: 
 * Crie uma classe chamada Funcionário que inclui três atributos:
 * a. nome (String);
 * b. sobrenome (String);
 * c. salário mensal (double).
 * A classe deve ter um construtor, métodos getters e setters para cada atributo da classe. Escreva uma classe chamada 
 * FuncionarioTeste (que contenha o método main) que cria dois objetos da classe Funcionario e exibe o salário de cada 
 * objeto. Então dê a cada Funcionario um aumento de 10% e exiba novamente o salário anual de cada um deles. Introduza na 
 * classe Funcionario uma variável de classe capaz de contabilizar o numero de funcionarios que passaram pela empresa até 
 * a data.
 * 
 * */
	public static void main(String[] args) {
		
		// Criando dois funcionários
        Funcionario f1 = new Funcionario("João", "Silva", 3000);
        Funcionario f2 = new Funcionario("Maria", "Oliveira", 4000);

        // Exibindo salário anual antes do aumento
        System.out.println(f1.getNome() + " " + f1.getSobrenome() + " - Salário anual: R$ " + f1.salarioAnual());
        System.out.println(f2.getNome() + " " + f2.getSobrenome() + " - Salário anual: R$ " + f2.salarioAnual());

        System.out.println("------------------------------------------------");

        // Exibindo salário anual após aumento
        System.out.println(f1.getNome() + " " + f1.getSobrenome() + " - Salário anual com aumento: R$ " + f1.salarioAnualComAumento());
        System.out.println(f2.getNome() + " " + f2.getSobrenome() + " - Salário anual com aumento: R$ " + f2.salarioAnualComAumento());

        System.out.println("------------------------------------------------");

        // Exibindo total de funcionários já criados
        System.out.println("Total de funcionários na empresa até o momento: " + Funcionario.getTotalDeFuncionarios());

	}

}
