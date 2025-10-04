package exercicio7_funcionario;

public class Principal {
/*Enunciado:
 * A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as três informações a seguir 
 * como atributos:
 * a. um primeiro nome,
 * b. um sobrenome
 * c. um salário mensal
 * Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para cada atributo. 
 * Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da classe. 
 * Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a cada empregado um aumento de 10% e exiba 
 * novamente o salário anual de cada empregado.
 * */
	public static void main(String[] args) {
		
		Funcionario func1, func2;
		
		func1 = new Funcionario("Daniel", "Penelva", 5000);
		func2 = new Funcionario("Daniel", "Penelva", 100);
		
		System.out.println("========= Salario Anual =========");
		func1.salarioAnual();
		func2.salarioAnual();
		
		System.out.println("========= Aumento de Salário =========");
		func1.aumentoSalarial();
		func2.aumentoSalarial();

	}

}
