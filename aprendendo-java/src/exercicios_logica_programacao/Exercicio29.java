package exercicios_logica_programacao;

import java.util.Scanner;

public class Exercicio29 {
	/*
	 * Enunciado: 
	 * Escreva um algoritmo para uma empresa que decide dar um reajuste a
	 * seus 584 funcionários de acordo com os seguintes critérios: 
	 * a. 50% para aqueles que ganham menos do que três salários mínimos; 
	 * b. 20% para aqueles que ganham entre três até dez salários mínimos; 
	 * c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
	 * d. 10% para os demais funcionários. Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
	 * 
	 * Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. 
	 * Calcule quanto à empresa vai aumentar sua folha de pagamento;
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        final double valorSalarioMinimo = 1631.00; // valor do salário mínimo
        double totalAumentoFolha = 0; // acumula o aumento total da empresa

        System.out.println("<<< Sistema de Reajuste Salarial >>>");

        System.out.println("Quantos funcionários deseja processar? ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine(); // consumir ENTER

        for (int i = 1; i <= quantidadeFuncionarios; i++) {
            System.out.println("\nFuncionário " + i + ":");

            System.out.print("Nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Salário atual do funcionário R$ ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // consumir ENTER

            // Descobrir a quantidade de salários mínimos
            double qntdSalarioMinimo = salario / valorSalarioMinimo;

            // Determinar percentual de reajuste
            double percentualReajuste;
            if (qntdSalarioMinimo < 3) {
                percentualReajuste = 0.50; // 50%
            } else if (qntdSalarioMinimo <= 10) {
                percentualReajuste = 0.20; // 20%
            } else if (qntdSalarioMinimo <= 20) {
                percentualReajuste = 0.15; // 15%
            } else {
                percentualReajuste = 0.10; // 10%
            }

            // Calcular reajuste e novo salário
            double reajuste = salario * percentualReajuste;
            double novoSalario = salario + reajuste;

            // Acumula o aumento total da folha
            totalAumentoFolha += reajuste;

            // Exibir resultados para o funcionário
            System.out.println("\n--- Resultado ---");
            System.out.printf("Nome: %s%n", nome);
            System.out.printf("Reajuste: R$ %.2f%n", reajuste);
            System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);
        }

        // Exibir resultado final
        System.out.println("\n==============================");
        System.out.printf("Aumento total na folha de pagamento: R$ %.2f%n", totalAumentoFolha);

        scanner.close();
	
	}

}
