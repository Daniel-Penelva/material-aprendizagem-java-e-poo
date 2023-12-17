package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploDataAtual {
	public static void main(String[] args) {
		// Obtendo a data atual
		LocalDate hoje = LocalDate.now();

		// Exibindo a data atual
		System.out.println("Data Atual: " + hoje);

		// Formatando a data
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data Formatada: " + hoje.format(formatador));
	}
}
