package metodo.getters.e.setters;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		cliente.setNome("Daniel");
		cliente.setIdade(20);
		cliente.setSexo("M");

		System.out.println("Nome: " + cliente.getNome() + " Idade: " + cliente.getIdade() + " Sexo: " + cliente.getSexo());

	}

}
