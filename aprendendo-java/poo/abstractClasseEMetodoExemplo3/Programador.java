package abstractClasseEMetodoExemplo3;

public class Programador extends Funcionario{

	// Construtores 
	public Programador() {
		
	}
	
	public Programador(String nome, float salario) {
		setNome(nome);
		setSalario(salario);
	}
	
	
	// M�todo Espec�fico do Programador
	public float calcularSalario(){
		  return super.calcularSalario() + (getSalario() * 15/100);
	}

	
	// M�todo abstract implementado pertencente ao Funcionario 
	@Override
	public float calcularDesconto(float desconto) {
		return calcularSalario() - desconto;
	}

}

/** OBS. A classe Programador por est� estendendo Funcion�rio e Funcionario est� estendendo PessoaFisisca, logo tanto os atributos que pertecem ao 
 * Funcion�rio quanto os atributos que pertencem a PessoaFisica ser�o enxergados pelo Programador. Podemos recuperar esses atributos atrav�s do 
 * m�todo setters (atribuir valores) e getters (capturar valores).*/
	