package abstractClasseEMetodoExemplo1;

class Cachorro extends Animal {
	
	public Cachorro(String nome) {
		super(nome);
	}

	// Implementa��o do m�todo abstrato
	@Override
	public void emitirSom() {
		System.out.println("Au Au");
	}
}
