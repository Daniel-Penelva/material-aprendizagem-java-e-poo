package expressao.lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo6SomaDosQuadrados {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		int somaDosQuadrados = numeros
				.stream()
				.mapToInt(n -> n * n)
				.sum(); // Usando expressão lambda para calcular a soma dos quadrados

		System.out.println("Soma dos quadrados: " + somaDosQuadrados);
	}

}
