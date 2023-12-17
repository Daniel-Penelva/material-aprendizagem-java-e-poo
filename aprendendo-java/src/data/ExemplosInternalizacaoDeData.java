package data;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExemplosInternalizacaoDeData {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(1970, Calendar.DECEMBER, 9);
		Date d = c.getTime();

		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(d));

		System.out.println("<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		// formato em brasileiro pois está definido como padrão.
		Locale padrao = Locale.getDefault();
		DateFormat f1 = DateFormat.getDateInstance(DateFormat.FULL, padrao);
		System.out.println(f1.format(d));

		System.out.println("<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		
		Locale Brasil = new Locale("pt", "BR"); // vamos usar o objeto locale para ser entendido em outra região
		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, Brasil);
		System.out.println(f2.format(d));

		System.out.println("<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		
		Locale india = new Locale("hi", "IN");
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f3.format(d));

		System.out.println("<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		
		Locale EUA = Locale.US;
		DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, EUA);
		System.out.println(f4.format(d));

		System.out.println("<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>");
		
		Locale japao = Locale.JAPAN;
		DateFormat f5 = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println(f5.format(d));

	}

}
