package abstractClasseEMetodoExemplo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(3.0);
		System.out.println("Área do círculo: " + circulo.calcularArea()); // Calcular e exibir a área do círculo
		
		Quadrado quadrado = new Quadrado(5.0);
        System.out.println("Área do quadrado: " + quadrado.calcularArea()); // Calcular e exibir a área do quadrado

	}

}
