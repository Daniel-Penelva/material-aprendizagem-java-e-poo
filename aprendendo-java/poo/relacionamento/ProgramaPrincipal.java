package relacionamento;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Carro ferrari = new Carro(); // Criando objeto Carro

		ferrari.modelo = "Maranello";
		ferrari.velocidadeMaxima = 310;
		ferrari.segundoZeroACem = 3.2;

		Motor v12 = new Motor(); // Criando objeto Motor

		v12.tipo = "V12";
		v12.potencia = 640;

		// Imprimindo Valores
		System.out.println("Modelo: " + ferrari.modelo + " - " + "Velocidade: " + ferrari.velocidadeMaxima + " - "
				+ "Segundos de Zero a cem: " + ferrari.segundoZeroACem + " - " + "Tipo do motor: " + v12.tipo + " - "
				+ "Potencia do motor: " + v12.potencia + "\n");

		/*------------------------------------------------*/

		Motor v8 = new Motor("V8", 1018); // Criando no Construtor Motor

		Carro bugatti = new Carro("Bugatti", 430, 2.2, v8); // Criando no Construtor Carro

		System.out.println("Modelo: " + bugatti.modelo + " - " + "Velocidade: " + bugatti.velocidadeMaxima + " - "
				+ "Segundos de Zero a cem: " + bugatti.segundoZeroACem + " - " + "Tipo do motor: " + bugatti.motor.tipo + " - "
				+ "Potencia do motor: " + bugatti.motor.potencia + "\n");
	}

}

/**
 * Métodos Construtores
 * 
 * Ex: Construtor de carros RELACIONAMENTO -> tem-um ---------------------------
 * ------------------------ |Carro | -------------> | Motor |
 * --------------------------- ------------------------ |modelo:String | | tipo:
 * String | |velocidadeMax: int | | potencia: int | |segundosZeroAcem: double |
 * ------------------------ |motor: Motor | ---------------------------
 */