package anonimaClasseExemplo1;

interface Saudacao {
	void dizerOla();
}

public class ExemploClasseAnonimaImplementaInterface {

	public static void main(String[] args) {

		Saudacao saudacao = new Saudacao() { // Uso de classe anônima para implementar a interface

			@Override
			public void dizerOla() {
				System.out.println("Olá Mundo");
			}
		};
		
		saudacao.dizerOla(); // Chamada do método da interface
	}
}

/** Neste exemplo, uma classe anônima é usada para implementar a interface Saudacao. O método dizerOla é implementado diretamente na classe anônima. */
