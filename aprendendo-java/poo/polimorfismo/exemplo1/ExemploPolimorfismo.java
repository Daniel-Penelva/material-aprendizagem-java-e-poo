package polimorfismo.exemplo1;

//Classe base (superclasse)
class Animal {
	public void fazerSom() {
		System.out.println("Alguns sons genéricos de animal.");
	}
}

//Subclasse que estende Animal
class Cachorro extends Animal {
	@Override
	public void fazerSom() {
		System.out.println("O cachorro faz: Woof! Woof!");
	}
}

//Subclasse que estende Animal
class Gato extends Animal {
	@Override
	public void fazerSom() {
		System.out.println("O gato faz: Meow!");
	}
}

public class ExemploPolimorfismo {
	public static void main(String[] args) {
		// Criando instâncias das subclasses
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();

		// Chamando o método fazerSom, que é polimórfico
		animal1.fazerSom(); // Saída: O cachorro faz: Woof! Woof!
		animal2.fazerSom(); // Saída: O gato faz: Meow!
	}
}
