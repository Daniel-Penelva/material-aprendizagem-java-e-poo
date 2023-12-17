package parseConversao;

public class ExemploParseBoolean {

	public static void main(String[] args) {
		
		String boolComoString = "true";
		boolean bool = Boolean.parseBoolean(boolComoString);

		System.out.println("Boolean parseado: " + bool);
	}
}
