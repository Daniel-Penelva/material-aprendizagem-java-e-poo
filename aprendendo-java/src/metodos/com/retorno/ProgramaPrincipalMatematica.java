package metodos.com.retorno;

public class ProgramaPrincipalMatematica {

	public static void main(String[] args) {

		Matematica matematica = new Matematica();

		int maiorValor = matematica.maior(20, 25);
		System.out.println("Maior valor é: " + maiorValor);

		System.out.println(matematica.soma(100, 5));

		/* >>>>>>>>>>>>>>>>>>>>>>>> EXEMPLO EXTRA <<<<<<<<<<<<<<<<<<<<<<< */

		int maiorPar = matematica.maior(8, 4);
		int maiorImpar = matematica.maior(9, 15);

		double soma = matematica.soma(maiorPar, maiorImpar);
		System.out.println("Resultado: " + soma);
	}

}
