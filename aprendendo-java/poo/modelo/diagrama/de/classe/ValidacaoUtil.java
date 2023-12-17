package modelo.diagrama.de.classe;

public class ValidacaoUtil {

	public static Double x = 56678.9;

	
	public static final Double y = 56678.9;

	public static boolean validaCPF(String cpf) {
		if (cpf.length() != 11)
			return false;
		return true;
	}

}
