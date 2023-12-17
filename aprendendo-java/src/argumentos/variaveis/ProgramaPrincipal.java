package argumentos.variaveis;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		ArgumentosEmVariaveis matematica = new ArgumentosEmVariaveis();

		double resultado = matematica.soma(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Somatório: " + resultado);

		
		/* Exemplo 2 */
		ArgumentosEmVariaveis mat = new ArgumentosEmVariaveis();

		double resulta = mat.multiplicacao("Valor da multiplicação", 2, 4, 5);
		System.out.println(resulta);

	}

}
