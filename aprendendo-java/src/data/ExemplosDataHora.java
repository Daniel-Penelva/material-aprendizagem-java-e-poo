package data;

import java.util.Calendar;
import java.util.Date;

public class ExemplosDataHora {

	public static void main(String[] args) {

		
		System.out.println(System.currentTimeMillis()); // recupera o tempo em milessegundos

		
		Date agora = new Date(); // criar uma data do tipo Date
		System.out.println(agora);

		
		Date data = new Date(1_000_000_000_000L); // data de tipo Long (L)
		System.out.println(data);

		
		System.out.println(data.getTime()); // método que recupera o tempo atual em data

		
		data.setTime(1_000_000_000_000L); // define o tempo em milessegundos

		
		System.out.println(data.compareTo(agora)); // para comparar datas 

		Calendar c = Calendar.getInstance();
	
		c.set(1987, Calendar.DECEMBER, 17); // exemplo: c.set(year, month, date)

		System.out.println(c.getTime()); // imprime a data acima

		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.MONTH)); // identifica o mês
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH, Calendar.APRIL); 
		c.set(Calendar.DAY_OF_MONTH, 5);
		System.out.println(c.getTime());

		// podemos limpar os campos da hora, minuto e segundos com o método clear(), vai ficar = zero
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());

		// add() - permite adicionar unidade de tempo. exemplo aumentar o dia do mês em uma unidade, ou seja, se antes era o dia 5 vai aumentar para o dia 6 e o ao vai para 2015
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.YEAR, 1);
		System.out.println(c.getTime());

		// tb pode diminuir, neste caso vai diminuir o ano em 5
		c.add(Calendar.YEAR, -5);
		System.out.println(c.getTime());

		// método roll() - modifica aumentanto ou diminuindo as unidade de tempo 
		c.roll(Calendar.DAY_OF_MONTH, 30);
		System.out.println(c.getTime());

		// Saudação com bom dia ou boa tarde ou boa noite - captura a hora do dia
		Calendar cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);

		if (hora <= 12) {
			System.out.println("Bom dia");
			
		} else if (hora > 12 && hora <= 18) {
			System.out.println("Boa Tarde");
			
		} else {
			System.out.println("Boa Noite");
		}
	}
}