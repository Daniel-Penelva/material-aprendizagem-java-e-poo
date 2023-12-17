package basico;

public class VetorMetodoStaticoComRetorno {

	public static void main(String[] args) {
		
		int[] vetor = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + "º posição: " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido");

		int vetorInvertido[] = arrayInvertido(vetor);
		
		for (int i = 5 - 1; i >= 0; i--) {
			System.out.println(i + "º posição: " + vetorInvertido[i]);
		}

	}

	public static int[] arrayInvertido(int vetor[]) {

		int resultadoInvertido[] = new int[vetor.length];

		for (int i = 5 - 1; i >= 0; i--) {
			resultadoInvertido[i] = vetor[i];
		}

		return resultadoInvertido;
	}
}
