package metodos.com.parametros;

public class ExemploParametro {

	// Exemplo1 - passando no parametro um tipo String
	public void atribuirNome(String nome) {
		System.out.println("Meu nome é " + nome);
	}

	/* ============================================================ */
	// Exemplo2 - é possivel passar quantos parametros quiser.
	public int idade(int dataNascimento, int anoAtual) {
		return anoAtual - dataNascimento;
	}

	/* ============================================================ */
	// Exemplo3 - nenhum valor foi passado no parâmetro.
	String cor = "Azul";

	public void corPreferida() {
		System.out.println(cor);
	}

	/* ============================================================ */
	// Exemplo4

	int valor1 = 10;
	int valor2 = 40;
	int valor3 = 50;

	public int soma() {
		int somando = valor1 + valor2 + valor3;
		return somando;
		// return valor1 + valor2 + valor3;
	}

	/* ============================================================ */
	// Exemplo5

	public void teste() {
		System.out.println("Testando parametro");
	}

	/* ============================================================ */
	// Exemplo6

	public int teste2() {
		return 50 - 20;
	}

	/* ============================================================ */
	// Exemplo7

	public void somando(int numero1, int numero2, int numero3) {

		int somar = numero1 + numero2 + numero3;
		System.out.println("A soma da equação: " + somar);

	}

	/* ============================================================ */
	// Exemplo8
	
	public int diminuindo(int numero1, int numero2, int numero3) {
		int diminuir = numero1 - numero2 - numero3;
		if (diminuir <= 0)
			return -1;
		else
			return diminuir;
	}

}
