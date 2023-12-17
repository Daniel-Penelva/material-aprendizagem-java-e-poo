package polimorfismo.exemplo4.usandoInterface;

public class QuadradoImpl implements AreaCalculavel {

	// Atributo especifico do QuadradoImpl
	double lado;

	// Construtor
	public QuadradoImpl(double lado) {
		this.lado = lado;
	}

	// Adicionado m�todo obrigat�rio da interface da AreaCalculavel
	@Override
	public double calculeArea() {
		return lado * lado;
	}
}
