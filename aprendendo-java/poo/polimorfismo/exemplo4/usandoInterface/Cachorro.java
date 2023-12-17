package polimorfismo.exemplo4.usandoInterface;

public final class Cachorro extends Animal implements AreaCalculavel, VolumeCalculavel {

	// Atributo especifico da classe Cachorro
	double lado;

	public Cachorro(double lado) {
		this.lado = lado;
	}

	// M�todo obrigat�rio da classe Animal que est� sendo estendida pelo Cachorro
	void fazerBarulho() {
		System.out.println("Au Au !");
	}

	// Tentar sobrescrever o m�todo final resultar� em um erro, exemplificando:
	// @Override
	// final void dormir() {
	// System.out.println("dormiu");
	// }

	
	// Adicionados m�todos obrigat�rios da interfaces da AreaCalculavel e VolumeCalculavel
	@Override
	public double calcularVolume() {

		return 6 * lado * lado;
	}

	@Override
	public double calculeArea() {
		return lado * lado;
	}

}
