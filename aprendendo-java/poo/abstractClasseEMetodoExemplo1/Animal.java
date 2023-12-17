package abstractClasseEMetodoExemplo1;

abstract class Animal {
	
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// M�todo abstrato
	public abstract void emitirSom();
}