package basico;

public class VetorMetodoStaticoSemRetorno {

	public static void main(String[] args) {
		
		int[] vetor = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + "� posi��o: " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido");
		arrayInvertido(vetor);

	}

	public static void arrayInvertido(int vetor[]) {

		for (int i = 5 - 1; i >= 0; i--) {
			System.out.println(i + "� posi��o: " + vetor[i]);
		}
	}

}
