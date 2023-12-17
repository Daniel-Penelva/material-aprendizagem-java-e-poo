package enumeradores;

//Declara��o de um enum chamado DiaDaSemana
enum DiaDaSemana {
	DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

public class ExemploEnum {

	public static void main(String[] args) {
		// Uso do enum DiaDaSemana
		DiaDaSemana dia = DiaDaSemana.SEGUNDA;

		// Compara��o usando switch
		switch (dia) {
		case DOMINGO:
			System.out.println("� domingo!");
			break;
		case SEGUNDA:
			System.out.println("� segunda-feira!");
			break;
		case TERCA:
			System.out.println("� ter�a-feira!");
			break;
		case QUARTA:
			System.out.println("� quarta-feira!");
			break;
		case QUINTA:
			System.out.println("� quinta-feira!");
			break;
		case SEXTA:
			System.out.println("� sexta-feira!");
			break;
		case SABADO:
			System.out.println("� s�bado!");
			break;
		}

		// Itera��o sobre os valores do enum
		System.out.println("Dias da semana:");
		for (DiaDaSemana diaEnum : DiaDaSemana.values()) {
			System.out.println(diaEnum);
		}
	}
}
