package verificar.instancia.exemplo1;

//Definição de uma interface
interface Animal {
	void fazerBarulho();
}

//Implementação da interface
class Cachorro implements Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("O cachorro faz: Woof! Woof!");
	}

	// Método específico da classe Cachorro
	public void abanarRabo() {
		System.out.println("O cachorro abana o rabo.");
	}
}

//Implementação da interface
class Gato implements Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("O gato faz: Meow!");
	}

	// Método específico da classe Gato
	public void ronronar() {
		System.out.println("O gato ronrona.");
	}
}

public class ExemploInstanceOf {
	public static void main(String[] args) {
		// Criando instâncias das classes
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();

		// Verificando o tipo usando instanceof
		if (cachorro instanceof Cachorro) {
			((Cachorro) cachorro).abanarRabo(); // Downcast para acessar método específico
		}

		if (gato instanceof Gato) {
			((Gato) gato).ronronar(); // Downcast para acessar método específico
		}

		// Usando o método da interface
		cachorro.fazerBarulho();
		gato.fazerBarulho();
	}
}
