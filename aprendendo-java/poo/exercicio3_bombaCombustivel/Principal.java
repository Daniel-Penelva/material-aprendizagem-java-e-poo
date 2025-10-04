package exercicio3_bombaCombustivel;

import java.util.Scanner;

/*
 * Enunciado:
 * Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os seguintes atributos: tipo de 
 * combustível, valor por litro e quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.
 * 
 * a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo.
 * b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
 * c. alterarValor; //altera o valor do litro do combustível.
 * d. alterarCombustivel; //altera o tipo do combustível.
 * e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
 * */
public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Cadastro inicial
		System.out.println("Configuração inicial da bomba:");
		System.out.print("Tipo de combustível (ALCOOL/GASOLINA): ");
		String tipo = scanner.nextLine().toUpperCase();

		if (tipo.equals("ALCOOL") || tipo.equals("GASOLINA")) {

			System.out.print("Valor por litro: ");
			double precoLitro = scanner.nextDouble();

			System.out.print("Quantidade de combustível disponível na bomba (em litros): ");
			double quantidadeInicial = scanner.nextDouble();

			BombaCombustivel bomba = new BombaCombustivel(tipo, precoLitro, quantidadeInicial);

			int opcao;
			do {
				System.out.println("\n==== MENU ====");
				System.out.println("1. Abastecer por valor");
				System.out.println("2. Abastecer por litro");
				System.out.println("3. Alterar valor do litro");
				System.out.println("4. Alterar tipo de combustível");
				System.out.println("5. Alterar quantidade de combustível");
				System.out.println("6. Sair");
				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					System.out.print("Digite o valor em reais para abastecer: ");
					double valor = scanner.nextDouble();
					bomba.abastecerPorValor(valor);
					break;
				case 2:
					System.out.print("Digite a quantidade de litros: ");
					double litros = scanner.nextDouble();
					bomba.abastecerPorLitro(litros);
					break;
				case 3:
					System.out.print("Novo valor por litro: ");
					double novoPreco = scanner.nextDouble();
					bomba.alterarValor(novoPreco);
					break;
				case 4:
					scanner.nextLine(); // limpar buffer
					System.out.print("Novo tipo de combustível: ");
					String novoTipo = scanner.nextLine().toUpperCase();
					bomba.alterarCombustivel(novoTipo);
					break;
				case 5:
					System.out.print("Nova quantidade disponível na bomba (litros): ");
					double novaQtd = scanner.nextDouble();
					bomba.alterarQuantidadeCombustivel(novaQtd);
					break;
				case 6:
					System.out.println("Encerrando o programa. Até logo!");
					break;
				default:
					System.out.println("Opção inválida!");
				}

			} while (opcao != 6);

		} else {
			System.out.println("Tipo de combustível inválido");
		}

		System.out.println("Programa encerrado. Obrigado!");
		scanner.close();
	}

}
