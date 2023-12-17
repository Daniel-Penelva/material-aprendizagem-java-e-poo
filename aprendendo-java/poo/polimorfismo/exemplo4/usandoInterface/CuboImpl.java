package polimorfismo.exemplo4.usandoInterface;

public class CuboImpl implements VolumeCalculavel, AreaCalculavel {

	double lado;

	// Método específico do CuboImpl
	public CuboImpl(double lado) {
		this.lado = lado;
	}

	// Adicionados métodos obrigatórios da interfaces da AreaCalculavel e VolumeCalculavel
	@Override
	public double calcularVolume() {

		return 6 * lado * lado;
	}

	@Override
	public double calculeArea() {

		return lado * lado * lado;
	}

}
