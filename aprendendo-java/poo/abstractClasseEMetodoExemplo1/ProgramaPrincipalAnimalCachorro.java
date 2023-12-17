package abstractClasseEMetodoExemplo1;

public class ProgramaPrincipalAnimalCachorro {

	public static void main(String[] args) {
		
		Cachorro labrador = new Cachorro("Bradock");
		System.out.println("Nome do cachorro" + labrador.getNome());
		
		labrador.emitirSom();
	}

}

/** 
 * Neste exemplo, Animal � uma classe abstrata com um m�todo abstrato emitirSom(). A classe Cachorro estende Animal e implementa o m�todo abstrato.
 * 
 * Vale ressaltar que uma classe abstrata n�o pode ser instanciada (new) diretamente, a classe Animal possui um m�todo abstrato emitirSom(). Uma classe que 
 * estende Animal, como a classe Cachorro, � obrigada a fornecer uma implementa��o para esse m�todo abstrato. Enquanto a classe Animal contiver pelo menos 
 * um m�todo abstrato, a classe em si deve ser marcada como abstrata.
 * */
 