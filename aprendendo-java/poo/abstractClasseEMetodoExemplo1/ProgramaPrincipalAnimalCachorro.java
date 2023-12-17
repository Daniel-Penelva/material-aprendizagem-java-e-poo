package abstractClasseEMetodoExemplo1;

public class ProgramaPrincipalAnimalCachorro {

	public static void main(String[] args) {
		
		Cachorro labrador = new Cachorro("Bradock");
		System.out.println("Nome do cachorro" + labrador.getNome());
		
		labrador.emitirSom();
	}

}

/** 
 * Neste exemplo, Animal é uma classe abstrata com um método abstrato emitirSom(). A classe Cachorro estende Animal e implementa o método abstrato.
 * 
 * Vale ressaltar que uma classe abstrata não pode ser instanciada (new) diretamente, a classe Animal possui um método abstrato emitirSom(). Uma classe que 
 * estende Animal, como a classe Cachorro, é obrigada a fornecer uma implementação para esse método abstrato. Enquanto a classe Animal contiver pelo menos 
 * um método abstrato, a classe em si deve ser marcada como abstrata.
 * */
 