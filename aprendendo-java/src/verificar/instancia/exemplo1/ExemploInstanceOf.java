package verificar.instancia.exemplo1;

//Defini��o de uma interface
interface Animal {
	void fazerBarulho();
}

//Implementa��o da interface
class Cachorro implements Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("O cachorro faz: Woof! Woof!");
	}

	// M�todo espec�fico da classe Cachorro
	public void abanarRabo() {
		System.out.println("O cachorro abana o rabo.");
	}
}

//Implementa��o da interface
class Gato implements Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("O gato faz: Meow!");
	}

	// M�todo espec�fico da classe Gato
	public void ronronar() {
		System.out.println("O gato ronrona.");
	}
}

public class ExemploInstanceOf {
	public static void main(String[] args) {
		// Criando inst�ncias das classes
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();

		// Verificando o tipo usando instanceof
		if (cachorro instanceof Cachorro) {
			((Cachorro) cachorro).abanarRabo(); // Downcast para acessar m�todo espec�fico
		}

		if (gato instanceof Gato) {
			((Gato) gato).ronronar(); // Downcast para acessar m�todo espec�fico
		}

		// Usando o m�todo da interface
		cachorro.fazerBarulho();
		gato.fazerBarulho();
	}
}
