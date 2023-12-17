package data;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploHora {
	public static void main(String[] args) {
		// Obtendo a hora atual
		LocalTime agora = LocalTime.now();
		System.out.println("Hora Atual: " + agora);

		// Criando uma hora específica
		LocalTime umaHoraEspecifica = LocalTime.of(10, 30);
		System.out.println("Uma Hora Específica: " + umaHoraEspecifica);

		// Formatando a hora
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora Formatada: " + agora.format(formatadorHora));
	}
}
