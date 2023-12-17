package anonimaClasseExemplo1;

interface Saudacao {
	void dizerOla();
}

public class ExemploClasseAnonimaImplementaInterface {

	public static void main(String[] args) {

		Saudacao saudacao = new Saudacao() { // Uso de classe an�nima para implementar a interface

			@Override
			public void dizerOla() {
				System.out.println("Ol� Mundo");
			}
		};
		
		saudacao.dizerOla(); // Chamada do m�todo da interface
	}
}

/** Neste exemplo, uma classe an�nima � usada para implementar a interface Saudacao. O m�todo dizerOla � implementado diretamente na classe an�nima. */
