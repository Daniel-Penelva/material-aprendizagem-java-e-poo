package numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploNumberFormat {
    public static void main(String[] args) {
        
    	double numero = 12345.6789;

    	//OBS. NumberFormat por ser uma classe abstract não poderá instanciá-la.
    	
    	// Formatando usando o padrão da localidade atual
        NumberFormat formatoPadrao = NumberFormat.getInstance();
        String numeroFormatadoPadrao = formatoPadrao.format(numero);
        System.out.println("Padrão: " + numeroFormatadoPadrao);

        // Formatando usando a localidade dos EUA
        NumberFormat formatoEUA = NumberFormat.getInstance(Locale.US);
        String numeroFormatadoEUA = formatoEUA.format(numero);
        System.out.println("EUA: " + numeroFormatadoEUA);

        // Formatando usando a localidade do Brasil
        NumberFormat formatoBrasil = NumberFormat.getInstance(new Locale("pt", "BR"));
        String numeroFormatadoBrasil = formatoBrasil.format(numero);
        System.out.println("Brasil: " + numeroFormatadoBrasil);
    }
}
