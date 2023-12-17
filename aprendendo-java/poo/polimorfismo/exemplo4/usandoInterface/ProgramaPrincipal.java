package polimorfismo.exemplo4.usandoInterface;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Area(new Cachorro(3));

		Area(new QuadradoImpl(2));

		Volume(new CuboImpl(4));

	}

	public static void Area(AreaCalculavel a) {
		System.out.println(a.calculeArea());
	}

	public static void Volume(VolumeCalculavel v) {
		System.out.println(v.calcularVolume());
	}
}