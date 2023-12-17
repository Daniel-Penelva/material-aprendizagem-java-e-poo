package anonimaClasseExemplo1;

//Classe abstrata
abstract class Veiculo {
	abstract void dirigir();
}

public class ExemploClasseAnonimaExtendeClasseAbstrata {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo() { // Uso de classe an�nima para estender a classe abstrata
			@Override
			void dirigir() {
				System.out.println("Dirigindo o carro");
			}
		};

		carro.dirigir(); // Chamada do m�todo da classe abstrata
	}
}

/** Neste exemplo, uma classe an�nima � usada para estender a classe abstrata Veiculo. A implementa��o do m�todo abstrato dirigir � fornecida diretamente na classe an�nima. */
