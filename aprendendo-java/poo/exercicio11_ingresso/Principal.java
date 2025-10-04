package exercicio11_ingresso;

public class Principal {
	/*
	 * Enunciado: Crie uma classe chamada Ingresso, que possui um valor em reais e
	 * um método imprimirValor. Crie uma classe IngressoVIP, que herda de Ingresso
	 * e possui um valor adicional. Crie um método que retorne o valor do ingresso
	 * VIP (com o adicional incluído). Crie um programa para criar as instâncias de
	 * Ingresso e IngressoVIP, mostrando a diferença de preços.
	 */
	public static void main(String[] args) {

		// Criando Ingresso Normal
		Ingresso ingressoNormal = new Ingresso(200.0);
		System.out.println("Ingresso Normal: ");
		ingressoNormal.imprimirValor();

		// Criando Ingresso Vip
		IngressoVip ingressoVIP = new IngressoVip(200.0, 100.0);
		System.out.println("\nIngresso VIP:");
		ingressoVIP.imprimirValor();

		// Comparando os valores
		System.out.println("\nDiferença de preço: R$ "
				+ String.format("%.2f", ingressoVIP.valorVIP() - ingressoNormal.getValor()));

	}

}
