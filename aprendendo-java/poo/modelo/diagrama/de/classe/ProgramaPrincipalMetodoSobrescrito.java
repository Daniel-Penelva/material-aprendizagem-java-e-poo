package modelo.diagrama.de.classe;

public class ProgramaPrincipalMetodoSobrescrito {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setNome("Daniel");

		Pessoa p2 = new Pessoa();
		p2.setNome("Daniel");

		System.out.println(p1.equals(p2));

		// Testando HashCode
		System.out.println("HashCode do p1: " + p1.hashCode());
		System.out.println("HashCode do p2: " + p2.hashCode());

	}

}
