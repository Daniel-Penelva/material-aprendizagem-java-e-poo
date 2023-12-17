package polimorfismo.exemplo4.usandoInterface;

public abstract class Animal {

	double peso;
	String comida;

	final void dormir() {
		System.out.println("dormiu");
	}

	// M�todo Abstract
	abstract void fazerBarulho();

}
