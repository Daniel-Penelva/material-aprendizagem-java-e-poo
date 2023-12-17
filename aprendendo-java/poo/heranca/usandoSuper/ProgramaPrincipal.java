package heranca.usandoSuper;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cachorro pitbull = new Cachorro();
		Galinha carijo = new Galinha();
		Animal mamifero = new Animal();

		// vai verificar o tipo da classe com o operador instanceof. Ex: pitbul � um
		// animal?
		System.out.println(pitbull instanceof Animal);
		System.out.println(pitbull instanceof Cachorro);

		// equals() = � um m�todo para comparar
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
 * Em termos de heran�a, a rela��o "� um" � representada. Nesse sentido, a heran�a reflete uma rela��o de generaliza��o/especializa��o, onde a subclasse 
 * (filha) � uma especializa��o da superclasse (pai).
 * 
 * Ent�o, quando dizemos "Cachorro � um Animal", isso reflete uma rela��o de heran�a, indicando que a classe `Cachorro` � uma especializa��o (ou subtipo) 
 * da classe `Animal`. A heran�a nesse contexto implica que um `Cachorro` herda caracter�sticas comuns a todos os `Animal`, mas tamb�m pode ter 
 * comportamentos espec�ficos que n�o s�o compartilhados por todos os `Animal`.
 * 
 * Por exemplo, um `Cachorro` herda a capacidade de emitir som (`emitirSom`), que � comum a todos os `Animal`. Ao mesmo tempo, um `Cachorro` pode ter 
 * comportamentos espec�ficos, como o m�todo `latir`, que n�o � aplic�vel a todos os `Animal`.
 * 
 * Isso � uma maneira poderosa de modelar hierarquias de classes em programa��o orientada a objetos, pois permite a reutiliza��o de c�digo e a cria��o de 
 * estruturas mais flex�veis e extens�veis.*/
