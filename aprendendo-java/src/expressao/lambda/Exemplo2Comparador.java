package expressao.lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo2Comparador {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Java", "é", "legal");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(palavras);
	}

}
