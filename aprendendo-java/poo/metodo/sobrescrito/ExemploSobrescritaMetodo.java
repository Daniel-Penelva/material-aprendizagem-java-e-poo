package metodo.sobrescrito;

public class ExemploSobrescritaMetodo {
    public static void main(String[] args) {
        
    	Animal animal = new Animal();
        animal.fazerSom();  // Saída: Som genérico de animal

        Gato gato = new Gato();
        gato.fazerSom();    // Saída: Miau

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();  // Saída: Au Au
    }
    
}

class Animal {
    
	void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() { // Sobrescrevendo o método 
        System.out.println("Miau");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() { // Sobrescrevendo o método 
        System.out.println("Au Au");
    }
}

/**Neste exemplo, a classe Animal possui um método fazerSom(). As classes Gato e Cachorro estendem a classe Animal e sobrescrevem o método fazerSom() com 
 * implementações específicas para cada tipo de animal.
 * 
 * O uso da anotação @Override não é estritamente necessário, mas é uma prática recomendada para indicar explicitamente que o método está sendo sobrescrito.*/
