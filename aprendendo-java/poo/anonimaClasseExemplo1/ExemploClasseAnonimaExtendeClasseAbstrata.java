package anonimaClasseExemplo1;

//Classe abstrata
abstract class Veiculo {
	abstract void dirigir();
}

public class ExemploClasseAnonimaExtendeClasseAbstrata {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo() { // Uso de classe anônima para estender a classe abstrata
			@Override
			void dirigir() {
				System.out.println("Dirigindo o carro");
			}
		};

		carro.dirigir(); // Chamada do método da classe abstrata
	}
}

/** Neste exemplo, uma classe anônima é usada para estender a classe abstrata Veiculo. A implementação do método abstrato dirigir é fornecida diretamente na classe anônima. */
