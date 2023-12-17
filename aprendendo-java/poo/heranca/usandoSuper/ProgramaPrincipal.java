package heranca.usandoSuper;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cachorro pitbull = new Cachorro();
		Galinha carijo = new Galinha();
		Animal mamifero = new Animal();

		// vai verificar o tipo da classe com o operador instanceof. Ex: pitbul é um
		// animal?
		System.out.println(pitbull instanceof Animal);
		System.out.println(pitbull instanceof Cachorro);

		// equals() = é um método para comparar
		System.out.println(pitbull.equals(carijo));

		// hashCode() = gera um serial
		System.out.println(pitbull.hashCode());

		// getClass() = retorna o tipo da classe do objeto.
		System.out.println(pitbull.getClass());

		// toString() = retorna o texto
		System.out.println(pitbull.toString());

		System.out.println("Peso: " + pitbull.peso + " - Comida: " + pitbull.comida + " - Altura: " + pitbull.altura
				+ " - Cor do animal: " + pitbull.cor_animal);

		System.out.println("Peso: " + carijo.peso + " - Comida: " + carijo.comida + " - Altura: " + carijo.altura
				+ " - Cor do animal: " + carijo.cor_animal);

	}

}

/**
 * Em termos de herança, a relação "é um" é representada. Nesse sentido, a herança reflete uma relação de generalização/especialização, onde a subclasse 
 * (filha) é uma especialização da superclasse (pai).
 * 
 * Então, quando dizemos "Cachorro é um Animal", isso reflete uma relação de herança, indicando que a classe `Cachorro` é uma especialização (ou subtipo) 
 * da classe `Animal`. A herança nesse contexto implica que um `Cachorro` herda características comuns a todos os `Animal`, mas também pode ter 
 * comportamentos específicos que não são compartilhados por todos os `Animal`.
 * 
 * Por exemplo, um `Cachorro` herda a capacidade de emitir som (`emitirSom`), que é comum a todos os `Animal`. Ao mesmo tempo, um `Cachorro` pode ter 
 * comportamentos específicos, como o método `latir`, que não é aplicável a todos os `Animal`.
 * 
 * Isso é uma maneira poderosa de modelar hierarquias de classes em programação orientada a objetos, pois permite a reutilização de código e a criação de 
 * estruturas mais flexíveis e extensíveis.*/
