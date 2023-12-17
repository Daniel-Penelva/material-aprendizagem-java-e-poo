package builder.exemplo1;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		// Carro com arcondicionado
		Carro carro1 = new Carro.Builder("Toyota", "Corolla", 2010).comArCondicionado(true).construir();

		// Imprimir valores
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Tem ar condicionado? " + carro1.getArCondicionado());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		// Carro com central multimidia
		Carro carro2 = new Carro.Builder("Honda", "Civic", 2010).comCentralMultimidia(true).build();
		
		// Imprimir valores
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Ano: " + carro2.getAno());
		System.out.println("Tem Central Multimídia? " + carro2.getCentralMultimidia());
		
		
		System.out.println("\n\n");
		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
		
		// Carro com central multimidia
		Carro carro3 = new Carro.Builder("Ford", "Camaro", 2010)
				.comCentralMultimidia(true)
				.comArCondicionado(true)
				.construir();
				
		// Imprimir valores
		System.out.println("Marca: " + carro3.getMarca());
		System.out.println("Modelo: " + carro3.getModelo());
		System.out.println("Ano: " + carro3.getAno());
		System.out.println("Tem Central Multimídia? " + carro3.getCentralMultimidia());
		System.out.println("Tem Ar Condicionado? " + carro3.getCentralMultimidia());

	}
}
