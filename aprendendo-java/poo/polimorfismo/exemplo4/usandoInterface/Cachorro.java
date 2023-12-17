package polimorfismo.exemplo4.usandoInterface;

public final class Cachorro extends Animal implements AreaCalculavel, VolumeCalculavel {

	// Atributo especifico da classe Cachorro
	double lado;

	public Cachorro(double lado) {
		this.lado = lado;
	}

	// Método obrigatório da classe Animal que está sendo estendida pelo Cachorro
	void fazerBarulho() {
		System.out.println("Au Au !");
	}

	// Tentar sobrescrever o método final resultará em um erro, exemplificando:
	// @Override
	// final void dormir() {
	// System.out.println("dormiu");
	// }

	
	// Adicionados métodos obrigatórios da interfaces da AreaCalculavel e VolumeCalculavel
	@Override
	public double calcularVolume() {

		return 6 * lado * lado;
	}

	@Override
	public double calculeArea() {
		return lado * lado;
	}

}
