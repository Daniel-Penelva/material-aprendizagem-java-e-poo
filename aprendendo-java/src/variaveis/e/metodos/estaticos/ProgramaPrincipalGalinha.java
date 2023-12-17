package variaveis.e.metodos.estaticos;

public class ProgramaPrincipalGalinha {

	public static void main(String[] args) {

		Galinha g = new Galinha();

		g.botar();
		g.botar();
		g.botar();

		System.out.println(g.ovos); // o método botar() vai incrementar totalizando três ovos
		
		
		Galinha g1 = new Galinha();

		g1.chocar().chocar().chocar().chocar().chocar();

		System.out.println("Total de ovos: " + g1.ovos);

		
		System.out.println(Galinha.ovosDaGranja); // Exemplo para capturar objetos static
		
		int valor = Galinha.ovosDaGranja; // outra forma de imprimir...
		System.out.println(valor);

		
		System.out.println("Média de ovos: " + Galinha.mediaDeOvos(2));
	}

}
