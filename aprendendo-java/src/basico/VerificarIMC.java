package basico;

import javax.swing.JOptionPane;

public class VerificarIMC {

	public static void main(String[] args) {

		String peso = JOptionPane.showInputDialog("Entre com o seu peso:");
		String altura = JOptionPane.showInputDialog("Entre com a sua altura: ");

		double pesoEmQuilo = Double.parseDouble(peso);
		double alturaEmMetro = Double.parseDouble(altura);

		double imc;
		imc = pesoEmQuilo / (alturaEmMetro * alturaEmMetro);
		System.out.println("Seu IMC: " + imc);

		// operador ternario
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso Ideal";
		
		// JOptionPane.showMessageDialog(null,imc + msg);
		System.out.println(msg);

	}
}
