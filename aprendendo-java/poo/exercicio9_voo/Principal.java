package exercicio9_voo;

import java.util.Scanner;

public class Principal {
/*Enunciado:
 * Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em determinado horário. Cada vôo 
 * possui no máximo 100 passageiros, e a classe permite controlar a ocupação das vagas. A classe deve ter os seguintes métodos:
 * a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para armazenar a data utilize um objeto
 * da classe Data, criada na questão anterior);
 * b. ProximoLivre: retorna o número da próxima cadeira livre
 * c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
 * d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna verdadeiro se a cadeira ainda não 
 * estiver ocupada (operação foi bem sucedida) e falso caso contrário
 * e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
 * f. GetVoo: retorna o número do vôo
 * */
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        // Criar a data do voo
	        System.out.println("Digite a data do voo (dia mes ano): ");
	        int dia = sc.nextInt();
	        int mes = sc.nextInt();
	        int ano = sc.nextInt();

	        Data dataVoo = new Data(dia, mes, ano);

	        // Criar o voo
	        System.out.println("Digite o número do voo: ");
	        int numeroVoo = sc.nextInt();

	        Voo voo = new Voo(numeroVoo, dataVoo);

	        System.out.println("\n" + voo);

	        // Ocupando algumas cadeiras
	        System.out.println("\nTentando ocupar a cadeira 1...");
	        System.out.println(voo.ocupa(1) ? "Cadeira 1 ocupada!" : "Cadeira 1 já ocupada!");

	        System.out.println("Tentando ocupar a cadeira 1 novamente...");
	        System.out.println(voo.ocupa(1) ? "Cadeira 1 ocupada!" : "Cadeira 1 já ocupada!");

	        // Verificando se a cadeira está ocupada
	        System.out.println("\nCadeira 1 está ocupada? " + (voo.verifica(1) ? "Sim" : "Não"));
	        System.out.println("Cadeira 2 está ocupada? " + (voo.verifica(2) ? "Sim" : "Não"));

	        // Próxima cadeira livre
	        System.out.println("\nPróxima cadeira livre: " + voo.proximoLivre());

	        // Vagas disponíveis
	        System.out.println("Vagas disponíveis: " + voo.vagas());

	        sc.close();
	}

}
