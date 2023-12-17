package polimorfismo.exemplo3.metodo.abstrato;

public abstract class Animal {

	double peso;
	String comida;

	void dormir() {
		System.out.println("dormiu");
	}

	// Método Abstract
	abstract void fazerBarulho();

}
