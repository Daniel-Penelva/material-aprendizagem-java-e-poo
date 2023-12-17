package modelo.diagrama.de.classe;

public class ProgramaPrincipalConstrutores {

	public static void main(String[] args) {

		
		Pessoa p = new Pessoa(); // construtor Padrão
		p.setNome("Daniel");
		System.out.println(p.getNome());

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/ 
		
		Pessoa p1 = new Pessoa("Daniel"); // Exemplo do construtor Sobrecarregado
		System.out.println(p1.getNome());

		Estado es = new Estado("Rio de Janeiro", "RJ");
		Cidade c = new Cidade("Niteroi", es);

		Pessoa p2 = new Pessoa("Maria", c);

		System.out.println(
				"Nome do Estado: " + p2.getCidade().getEstado().getNome() + " UF: " + p2.getCidade().getEstado().getUf()
						+ " Nome da Cidade: " + p2.getCidade().getCidade() + " Nome da Pessoa: " + p2.getNome());

		
		Pessoa p3 = new Pessoa("Carla", new Cidade("Barueri", new Estado("São Paulo", "SP"))); // Ou pode fazer assim tambem

		System.out.println(
				"Nome do Estado: " + p3.getCidade().getEstado().getNome() + " UF: " + p3.getCidade().getEstado().getUf()
						+ " Nome da Cidade: " + p3.getCidade().getCidade() + " Nome da Pessoa: " + p3.getNome());

		/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Exemplo 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/ 
		
		System.out.println("Exemplo toString");
		System.out.println(new Pessoa("Fabi", new Cidade("Piúma", new Estado("Espírito Santo", "ES")))); // Exemplo usando toString

		
		Pessoa p4 = new Pessoa("Fabi", new Cidade("Piúma", new Estado("Espírito Santo", "ES")));
		System.out.println(p4.toString()); // ou pode fazer imprimir com o método sobrescrito toString
	}
}
