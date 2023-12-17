package polimorfismo.exemplo4.usandoInterface;

public class CuboImpl implements VolumeCalculavel, AreaCalculavel {

	double lado;

	// M�todo espec�fico do CuboImpl
	public CuboImpl(double lado) {
		this.lado = lado;
	}

	// Adicionados m�todos obrigat�rios da interfaces da AreaCalculavel e VolumeCalculavel
	@Override
	public double calcularVolume() {

		return 6 * lado * lado;
	}

	@Override
	public double calculeArea() {

		return lado * lado * lado;
	}

}
