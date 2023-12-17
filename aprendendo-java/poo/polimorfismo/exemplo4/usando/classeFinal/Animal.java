package polimorfismo.exemplo4.usando.classeFinal;

public abstract class Animal {

	double peso;
	String comida;

	final void dormir() {
		System.out.println("dormiu");
	}

	// Método Abstract
	abstract void fazerBarulho();
}
