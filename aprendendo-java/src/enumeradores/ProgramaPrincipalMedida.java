package enumeradores;

public class ProgramaPrincipalMedida {

	public static void main(String[] args) {

		// Uso do enum Medida
		Medida medida1 = Medida.MM;
		Medida medida2 = Medida.CM;
		Medida medida3 = Medida.M;

		// Acesso à propriedade "tamanho"
		System.out.println("Medida 1: " + medida1.tamanho);
		System.out.println("Medida 2: " + medida2.tamanho);
		System.out.println("Medida 3: " + medida3.tamanho);
		
		
		// Imprime todos os valores 
		for(Medida m : Medida.values()) {
			System.out.println(m + " : " + m.tamanho);
		}
		
		
		// Chamando o método andar()
		andar(medida3, 100);  // exemplo 1
		andar(Medida.M, 100);  // exemplo 2
		andar(Medida.CM, 100);  // exemplo 3
	}

	
	public static final double PI = 3.14;

	public static void andar(Medida medida, int total) {
		if (medida == Medida.M) {
			total = total * 2;
			System.out.println("Total de caminhada: " + total);
			
		}else {
			System.out.println("Por favor entre apenas com media em Metro");
		}
	}

}
