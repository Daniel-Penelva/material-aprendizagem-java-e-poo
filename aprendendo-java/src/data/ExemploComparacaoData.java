package data;

import java.time.LocalDate;

public class ExemploComparacaoData {
	public static void main(String[] args) {
		// Criando duas datas
		LocalDate data1 = LocalDate.of(2022, 1, 1);
		LocalDate data2 = LocalDate.of(2022, 12, 31);

		// Comparando as datas
		if (data1.isBefore(data2)) {
			System.out.println(data1 + " vem antes de " + data2);
			
		} else if (data1.isAfter(data2)) {
			System.out.println(data1 + " vem depois de " + data2);
			
		} else {
			System.out.println(data1 + " é igual a " + data2);
		}
	}
}
