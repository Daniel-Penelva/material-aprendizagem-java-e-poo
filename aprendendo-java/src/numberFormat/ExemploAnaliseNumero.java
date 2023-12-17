package numberFormat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ExemploAnaliseNumero {
	public static void main(String[] args) {
		
		String numeroString = "12,345.67";

		// Analisando usando o padrão da localidade atual
		try {
			NumberFormat formatoPadrao = NumberFormat.getInstance();
			Number numeroPadrao = formatoPadrao.parse(numeroString);
			System.out.println("Padrão: " + numeroPadrao);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Analisando usando a localidade dos EUA
		try {
			NumberFormat formatoEUA = NumberFormat.getInstance(Locale.US);
			Number numeroEUA = formatoEUA.parse(numeroString);
			System.out.println("EUA: " + numeroEUA);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Analisando usando a localidade do Brasil
		try {
			NumberFormat formatoBrasil = NumberFormat.getInstance(new Locale("pt", "BR"));
			Number numeroBrasil = formatoBrasil.parse(numeroString);
			System.out.println("Brasil: " + numeroBrasil);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
