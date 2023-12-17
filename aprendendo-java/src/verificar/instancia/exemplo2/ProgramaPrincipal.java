package verificar.instancia.exemplo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Vaca vaca = new Vaca();
		Gata gato = new Gata();
		Cabra cabra = new Cabra();
		
		Animal bichos[] = { vaca, gato, cabra };

		for (int i = 0; i < bichos.length; i++) {
			if (bichos[i] instanceof Vaca) {
				System.out.println("O nome da vaca é " + bichos[i].nome + " e tem " + bichos[i].numPatas + " patas ");

				bichos[i].som();
			}
			if (bichos[i] instanceof Gata) {
				System.out.println("O nome da gata é " + bichos[i].nome + " e tem " + bichos[i].numPatas + " patas ");

				bichos[i].som();
			}
			if (bichos[i] instanceof Cabra) {
				System.out.println("O nome da cabra é " + bichos[i].nome + " e tem " + bichos[i].numPatas + " patas ");

				bichos[i].som();
			}

		}
	}
}
