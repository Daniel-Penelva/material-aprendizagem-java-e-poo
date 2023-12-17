package abstractClasseEMetodoExemplo3;

// Funcionario é uma pessoa fisica
// Funcionário é uma classe abstrata
public abstract class Funcionario extends PessoaFisica {

	public static final float MARGEM_PADRAO = 10;
	public static final float SALARIO_MINIMO = 750;

	private String cargo;
	private String nome;
	private float salario;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float calcularSalario() {
		return salario + (salario * MARGEM_PADRAO) / 100;
	}

	public float calcularSalario(float porc) {
		return salario + (salario * porc / 100);
	}

	public float calcularSalario(float quantidade, float SALARIO_MINIMO, float porc) {
		return (quantidade * SALARIO_MINIMO) + calcularSalario(porc);
	}

	// método abstract apenas declarado, seu construtor está na classe Programador.
	public abstract float calcularDesconto(float desconto);

}
