package numberFormat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class ExemplosNumberFormat {

	public static void main(String[] args) {

		/** -> A classe NumberFormat oferece um m�todo para recuperar uma instancia dessa classe.
		 *  -> A classe NumberFormat tb tem op��es de formatadores.
		 *  -> Temos o padr�o ou o generico que n�o tem nada no parametro, essa formata��o � referente ao Brasil.
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

		
		NumberFormat f4 = NumberFormat.getCurrencyInstance(); // setMaximumFractionDigits - � possivel definir o numero de casa decimais.
		f4.setMaximumFractionDigits(1);
		System.out.println(f4.format(saldo));

		
		NumberFormat f5 = NumberFormat.getCurrencyInstance(Locale.US); // internacionaliza��o desses n�meros para os EUA - vai passar como parametro o locale dos EUA
		System.out.println(f5.format(saldo));

		
		NumberFormat f6 = NumberFormat.getCurrencyInstance(Locale.FRANCE); // internacionaliza��o desses n�meros para a Fran�a
		System.out.println(f6.format(saldo));

	}

}
