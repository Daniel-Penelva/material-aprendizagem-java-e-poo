package expressao.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo5Comprimento {

	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("Java", "C", "Python", "JavaScript");

		// Usando expressão lambda para mapear o comprimento de cada string
		List<Integer> comprimentos = palavras.stream()
				.map(String::length) // OBS. .map(s -> s.length()) // Expressão lambda sem método de referência
				.collect(Collectors.toList());

		System.out.println("Comprimentos: " + comprimentos);

	}

}
