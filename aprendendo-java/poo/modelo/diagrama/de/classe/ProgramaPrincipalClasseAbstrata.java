package modelo.diagrama.de.classe;

public class ProgramaPrincipalClasseAbstrata {

	public static void main(String[] args) {

		Funcionario f1 = new Analista();
		f1.setSalario(1000.0);
		System.out.println(f1.calcularSalario());

		// Construtor para Analista
		Funcionario f2 = new Analista("Daniel", "11111", 3000.0);
		System.out.println("Salario antes do acrescimo: " + f2.getSalario());
		
		double novoSalario = f2.calcularSalario();
		System.out.println("Nome: " + f2.getNome() + " CPF: " + f2.getCpf() + " Novo Salario: " + novoSalario);

		// <<<<<<<<  >>>>>>>>

		Funcionario f3 = new Diretor();
		f3.setSalario(2000.0);
		System.out.println(f3.calcularSalario());

		// Construtor para Diretor
		Funcionario f4 = new Diretor("Daniel", "11111", 4000.0);
		
		System.out.println("Salario antes do acrescimo: " + f4.getSalario());
		System.out.println("Nome: " + f4.getNome() + " CPF: " + f4.getCpf() + " Novo Salario: " + f4.calcularSalario());

	}
}
