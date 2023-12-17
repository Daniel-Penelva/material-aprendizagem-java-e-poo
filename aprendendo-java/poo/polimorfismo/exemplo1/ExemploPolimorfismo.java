package polimorfismo.exemplo1;

//Classe base (superclasse)
class Animal {
	public void fazerSom() {
		System.out.println("Alguns sons gen�ricos de animal.");
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
		// Criando inst�ncias das subclasses
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();

		// Chamando o m�todo fazerSom, que � polim�rfico
		animal1.fazerSom(); // Sa�da: O cachorro faz: Woof! Woof!
		animal2.fazerSom(); // Sa�da: O gato faz: Meow!
	}
}
