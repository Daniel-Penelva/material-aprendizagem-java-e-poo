package parseConversao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploParseData {

	public static void main(String[] args) {
		
		String dataComoString = "2023-12-09";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date data = sdf.parse(dataComoString);
			System.out.println("Data parseada: " + data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
