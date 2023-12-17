package metodo.sobrescrito;

public class ExemploSobrescritaMetodo {
    public static void main(String[] args) {
        
    	Animal animal = new Animal();
        animal.fazerSom();  // Sa�da: Som gen�rico de animal

        Gato gato = new Gato();
        gato.fazerSom();    // Sa�da: Miau

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();  // Sa�da: Au Au
    }
    
}

class Animal {
    
	void fazerSom() {
        System.out.println("Som gen�rico de animal");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() { // Sobrescrevendo o m�todo 
        System.out.println("Miau");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() { // Sobrescrevendo o m�todo 
        System.out.println("Au Au");
    }
}

/**Neste exemplo, a classe Animal possui um m�todo fazerSom(). As classes Gato e Cachorro estendem a classe Animal e sobrescrevem o m�todo fazerSom() com 
 * implementa��es espec�ficas para cada tipo de animal.
 * 
 * O uso da anota��o @Override n�o � estritamente necess�rio, mas � uma pr�tica recomendada para indicar explicitamente que o m�todo est� sendo sobrescrito.*/
