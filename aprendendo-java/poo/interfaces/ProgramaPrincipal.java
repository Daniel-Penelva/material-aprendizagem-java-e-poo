package interfaces;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		AppCalculadora appCalculadora = new AppCalculadora();

		System.out.println(appCalculadora.somar(10, 30));
		System.out.println(appCalculadora.subtrair(20, 17));
		System.out.println(appCalculadora.multiplicar(28, 2));
		System.out.println(appCalculadora.dividir(10, 5));
		System.out.println(appCalculadora.dividir(20, 0));

	}

}
