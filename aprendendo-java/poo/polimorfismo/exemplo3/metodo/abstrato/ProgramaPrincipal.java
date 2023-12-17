package polimorfismo.exemplo3.metodo.abstrato;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Animal animal1 = new Cachorro();
		Animal animal2 = new Galinha();
		
		Cachorro pitbull = new Cachorro();
		Galinha angola = new Galinha();

		animal1.fazerBarulho();
		animal1.dormir();
		
		animal2.fazerBarulho();
		animal2.dormir();
		
		pitbull.fazerBarulho();
		pitbull.dormir();
		
		angola.fazerBarulho();
		angola.dormir();
	}
}

/* Classes Abstract
 * As classes abstratas não podem ser instanciadas. Elas têm métodos indefinidos para serem implementadas nas subclasses, que seriam as classes 
 * concretas*/