package data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemplosFormatacaoData {

public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance(); //definindo uma data - set(year, month, date)
		calendar.set(1987, Calendar.DECEMBER, 17);
		
		
		Date data = calendar.getTime(); //recupera o objeto do tipo date
		System.out.println("Formatação Americana: " + data);
		
		System.out.println("\n");
		System.out.println("Formatação Data e hora do Brasil");

		/*OBS. A classe DateFormat não é possivel instanciá-la (não faz um new).*/
		DateFormat formatacaoData = DateFormat.getDateInstance(); // getDateInstance() - formata data do Brasil
		System.out.println(formatacaoData.format(data));
		
	
	     DateFormat formatacaoHora = DateFormat.getTimeInstance(); // getTimeInstance() - formata horas do Brasil
	     System.out.println(formatacaoHora.format(data));
	  
	     
		DateFormat formatacaoDataEHora = DateFormat.getDateTimeInstance(); // getDateTimeInstance() - formata data e horas do Brasil
		System.out.println(formatacaoDataEHora.format(data));

		System.out.println("\n");
		
		//É possivel sofrer alterações de estilos e podem ser definidos através dos métodos
		System.out.println("Outro estilo de formatação:");
		DateFormat estiloformatacao = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(estiloformatacao.format(data));
		
		System.out.println("\n");
		System.out.println("Outro estilo de formatação 1:");
		DateFormat estiloformatacao1 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(estiloformatacao1.format(data));
		
		System.out.println("\n");
		System.out.println("Outro estilo de formatação 2:");
		DateFormat estiloformatacao2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(estiloformatacao2.format(data));
	
		System.out.println("\n");
		System.out.println("Outro estilo de formatação 3:");
		DateFormat estiloformatacao3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(estiloformatacao3.format(data));
		
        // Usando parser para converter de tipo String para o tipo Date
		DateFormat conversao = DateFormat.getDateInstance(DateFormat.SHORT);
		
		try {
			
			Date data1 = conversao.parse("17/10/99");
			System.out.println(data1);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		// ---------------------- SimpleDateFormat -------------------------------
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(data));
        
        //ou pode fazer usando o parser
        try {
			System.out.println(sdf.parse("10/10/2012"));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
}
