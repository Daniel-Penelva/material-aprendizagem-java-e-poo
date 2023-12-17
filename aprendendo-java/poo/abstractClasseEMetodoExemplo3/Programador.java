package abstractClasseEMetodoExemplo3;

public class Programador extends Funcionario{

	// Construtores 
	public Programador() {
		
	}
	
	public Programador(String nome, float salario) {
		setNome(nome);
		setSalario(salario);
	}
	
	
	// Método Específico do Programador
	public float calcularSalario(){
		  return super.calcularSalario() + (getSalario() * 15/100);
	}

	
	// Método abstract implementado pertencente ao Funcionario 
	@Override
	public float calcularDesconto(float desconto) {
		return calcularSalario() - desconto;
	}

}

/** OBS. A classe Programador por está estendendo Funcionário e Funcionario está estendendo PessoaFisisca, logo tanto os atributos que pertecem ao 
 * Funcionário quanto os atributos que pertencem a PessoaFisica serão enxergados pelo Programador. Podemos recuperar esses atributos através do 
 * método setters (atribuir valores) e getters (capturar valores).*/
	