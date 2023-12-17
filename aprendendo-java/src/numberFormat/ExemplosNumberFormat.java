package numberFormat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class ExemplosNumberFormat {

	public static void main(String[] args) {

		/** -> A classe NumberFormat oferece um método para recuperar uma instancia dessa classe.
		 *  -> A classe NumberFormat tb tem opções de formatadores.
		 *  -> Temos o padrão ou o generico que não tem nada no parametro, essa formatação é referente ao Brasil.
		 */
		
		double saldo = 123_456.789;
		
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));

		
		NumberFormat f1 = NumberFormat.getIntegerInstance(); // getIntegerInstance() - para formatar numeros inteiros - exclui a parti fracionada
		System.out.println(f1.format(saldo));

		
		NumberFormat f2 = NumberFormat.getPercentInstance(); // getPercentInstance() - para formatar numeros percentuais
		System.out.println(f2.format(0.25));

		
		NumberFormat f3 = NumberFormat.getCurrencyInstance(); // getCurrencyInstance() - para formatar moedas
		System.out.println(f3.format(0.25));
		System.out.println(f3.format(saldo));

		
		NumberFormat f4 = NumberFormat.getCurrencyInstance(); // setMaximumFractionDigits - é possivel definir o numero de casa decimais.
		f4.setMaximumFractionDigits(1);
		System.out.println(f4.format(saldo));

		
		NumberFormat f5 = NumberFormat.getCurrencyInstance(Locale.US); // internacionalização desses números para os EUA - vai passar como parametro o locale dos EUA
		System.out.println(f5.format(saldo));

		
		NumberFormat f6 = NumberFormat.getCurrencyInstance(Locale.FRANCE); // internacionalização desses números para a França
		System.out.println(f6.format(saldo));

	}

}
