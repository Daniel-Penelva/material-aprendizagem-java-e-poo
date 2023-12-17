package data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {
	public static void main(String[] args) {
		// Obtendo a data e hora atual
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Data e Hora Atuais: " + agora);

		// Criando uma data e hora específicas
		LocalDateTime dataHoraEspecifica = LocalDateTime.of(2022, 3, 15, 12, 30);
		System.out.println("Data e Hora Específicas: " + dataHoraEspecifica);

		// Formatando a data e hora
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Data e Hora Formatadas: " + agora.format(formatadorDataHora));
	}
}
