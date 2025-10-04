package exercicio8_data;

import java.util.Scanner;

public class Principal {
	/*Enunciado:
	 * Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos seguintes métodos:
	 * a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a data está correta, caso não 
	 * esteja a data é configurada como 01/01/0001
	 * b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e retorne:
	 * 		i. 0 se as datas forem iguais;
	 * 		ii. 1 se a data corrente for maior que a do parâmetro;
	 * 		iii. -1 se a data do parâmetro for maior que a corrente.
	 * c.GetDia: retorna o dia da data
	 * d. GetMes: retorna o mês da data
	 * e. GetMesExtenso: retorna o mês da data corrente por extenso
	 * f. GetAno: retorna o ano da data
	 * g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
	 * h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os mesmos valores de atributos e 
	 * retorna sua referência pelo método
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Criando a primeira data
		System.out.println("Digite a primeira data (dia mes ano): ");
		int dia1 = sc.nextInt();
		int mes1 = sc.nextInt();
		int ano1 = sc.nextInt();

		Data data1 = new Data(dia1, mes1, ano1);

		// Criando a segunda data
		System.out.println("Digite a segunda data (dia mes ano): ");
		int dia2 = sc.nextInt();
		int mes2 = sc.nextInt();
		int ano2 = sc.nextInt();

		Data data2 = new Data(dia2, mes2, ano2);

		// Exibindo datas
		System.out.println("\nData 1: " + data1 + " (" + data1.getMesExtenso() + ")");
		System.out.println("Data 2: " + data2 + " (" + data2.getMesExtenso() + ")");

		// Comparando datas
		int resultado = data1.compara(data2);
		if (resultado == 0) {
			System.out.println("As datas são iguais.");
		} else if (resultado == 1) {
			System.out.println("A primeira data é MAIOR que a segunda.");
		} else {
			System.out.println("A primeira data é MENOR que a segunda.");
		}

		// Verificando ano bissexto
		System.out.println("\nAno de Data 1 é bissexto? " + (data1.isBissexto() ? "Sim" : "Não"));
		System.out.println("Ano de Data 2 é bissexto? " + (data2.isBissexto() ? "Sim" : "Não"));

		// Testando clone
		Data cloneData1 = data1.clone();
		System.out.println("\nClone da primeira data: " + cloneData1);

		sc.close();
	}

}
