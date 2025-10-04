package exercicio10_jogadorFutebol;

import java.util.Scanner;

public class Principal {
/*Enunciado:
 * Crie uma classe para representar um jogador de futebol, com os atributos:
 * a. nome; 
 * b. posição;
 * c. data de nascimento;
 * d. nacionalidade;
 * e. altura;
 * f. peso;
 * Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os dados do jogador. Crie um 
 * método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar. Para isso, 
 * considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os 
 * atacantes aos 35.
 * */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int continua;
		
		Jogador jogador = new Jogador();
		Data data = new Data();
		
		do {
			
			System.out.println("Entre com o nome do jogador: ");
			jogador.setNome(scanner.nextLine());
			
			System.out.println("Entre com a posição do Jogador: (DEFESA | MEIO-CAMPO | ATACANTE): ");
			jogador.setPosicao(scanner.nextLine().toUpperCase());
			
			System.out.println("Entre com a data de nascimento - (dia mes ano): ");
			data.setDia(scanner.nextInt());
			data.setMes(scanner.nextInt());
			data.setAno(scanner.nextInt());
			scanner.nextLine();
			
			jogador.setDataNascimento(data); // Associa a data ao jogador
			
			System.out.println("Entre com a altura: ");
			jogador.setAltura(scanner.nextDouble());
			scanner.nextLine();
			
			System.out.println("Entre com o peso: ");
			jogador.setPeso(scanner.nextDouble());
			scanner.nextLine();
			
			System.out.println("\n====== Idade do Jogador ======");
			System.out.println("Idade" + jogador.idadeJogador());
			
			System.out.println("\n====== Deve se aposentar? ======");
			jogador.aposentar();
			
			System.out.println("\n====== Dados do Jogador ======");
			jogador.imprimir();
			
			System.out.println("Deseja Continuar? 1 (Sim) e 2 (Não): ");
			continua = scanner.nextInt();
			scanner.nextLine();
			
		} while (continua == 1);
		
		scanner.close();

	}

}
