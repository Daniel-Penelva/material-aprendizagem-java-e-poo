package abstractClasseEMetodoExemplo2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(3.0);
		System.out.println("�rea do c�rculo: " + circulo.calcularArea()); // Calcular e exibir a �rea do c�rculo
		
		Quadrado quadrado = new Quadrado(5.0);
        System.out.println("�rea do quadrado: " + quadrado.calcularArea()); // Calcular e exibir a �rea do quadrado

	}

}
