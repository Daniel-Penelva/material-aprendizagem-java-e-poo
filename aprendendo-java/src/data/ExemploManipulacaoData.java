package data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploManipulacaoData {
	public static void main(String[] args) {
		// Obtendo a data atual
		LocalDate hoje = LocalDate.now();

		// Adicionando dias
		LocalDate daquiACincoDias = hoje.plusDays(5);

		// Subtraindo semanas
		LocalDate duasSemanasAtras = hoje.minus(2, ChronoUnit.WEEKS);

		System.out.println("Hoje: " + hoje);
		System.out.println("Daqui a 5 dias: " + daquiACincoDias);
		System.out.println("Duas semanas atrás: " + duasSemanasAtras);
	}
}
