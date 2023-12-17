package enumeradores;

//Declaração de um enum chamado DiaDaSemana
enum DiaDaSemana {
	DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

public class ExemploEnum {

	public static void main(String[] args) {
		// Uso do enum DiaDaSemana
		DiaDaSemana dia = DiaDaSemana.SEGUNDA;

		// Comparação usando switch
		switch (dia) {
		case DOMINGO:
			System.out.println("É domingo!");
			break;
		case SEGUNDA:
			System.out.println("É segunda-feira!");
			break;
		case TERCA:
			System.out.println("É terça-feira!");
			break;
		case QUARTA:
			System.out.println("É quarta-feira!");
			break;
		case QUINTA:
			System.out.println("É quinta-feira!");
			break;
		case SEXTA:
			System.out.println("É sexta-feira!");
			break;
		case SABADO:
			System.out.println("É sábado!");
			break;
		}

		// Iteração sobre os valores do enum
		System.out.println("Dias da semana:");
		for (DiaDaSemana diaEnum : DiaDaSemana.values()) {
			System.out.println(diaEnum);
		}
	}
}
