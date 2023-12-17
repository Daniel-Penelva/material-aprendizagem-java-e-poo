package heranca.usandoSuper;

public class Animal {

	protected double peso;
	protected String comida;
	protected double altura;
	protected String cor_animal;

	public Animal() {

	}

	public Animal(double peso, String comida, double altura, String cor_animal) {
		this.peso = peso;
		this.comida = comida;
		this.altura = altura;
		this.cor_animal = cor_animal;
	}

	void dormir() {
		System.out.println("dormiu");
	}

	void fazerBarulho() {
		System.out.println("Faz Barulho");
	}
}
