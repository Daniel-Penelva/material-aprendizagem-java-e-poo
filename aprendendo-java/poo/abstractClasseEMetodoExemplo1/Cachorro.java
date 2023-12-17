package abstractClasseEMetodoExemplo1;

class Cachorro extends Animal {
	
	public Cachorro(String nome) {
		super(nome);
	}

	// Implementação do método abstrato
	@Override
	public void emitirSom() {
		System.out.println("Au Au");
	}
}
