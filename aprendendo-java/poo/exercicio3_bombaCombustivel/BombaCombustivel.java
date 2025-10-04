package exercicio3_bombaCombustivel;

public class BombaCombustivel {

	private String tipoCombustivel;
	private double valorPorLitro; 
	private double qntdCombustivel;

	// Construtores
	public BombaCombustivel() {

	}

	public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double qntdCombustivel) {
		super();
		this.tipoCombustivel = tipoCombustivel;
		this.valorPorLitro = valorPorLitro;
		this.qntdCombustivel = qntdCombustivel;
	}

	// Métodos Getters e Setters
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getValorPorLitro() {
		return valorPorLitro;
	}

	public void setValorPorLitro(double valorPorLitro) {
		this.valorPorLitro = valorPorLitro;
	}

	public double getQntdCombustivel() {
		return qntdCombustivel;
	}

	public void setQntdCombustivel(double qntdCombustivel) {
		this.qntdCombustivel = qntdCombustivel;
	}

	// Método para abastecer por valor
	public void abastecerPorValor(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido para abastecimento.");
			return;
		}
		
		double litros = valor/valorPorLitro;
		if (litros > qntdCombustivel) {
			System.out.println("Não há combustível suficiente na bomba.");
		} else {
			qntdCombustivel -= litros;
			System.out.printf("Foram abastecidos %.2f litros. Valor pago: R$ %.2f%n", litros, valor);
		}
	}
	

	// Método para abastecer por Litro
	public void abastecerPorLitro(double litros) {
		if (litros <= 0) {
			System.out.println("Quantidade de litros inválido.");
			return;
		}
		if (litros > qntdCombustivel) {
			System.out.println("Não há combustível suficiente na bomba.");
		} else {
			double valor = litros * valorPorLitro;
			qntdCombustivel -= litros;
			System.out.printf("Foram abastecidos %.2f litros. Valor pago: R$ %.2f%n", litros, valor);
		}
	}
	

	// Método para alterar o valor do litro do combustível
	public void alterarValor(double novoValorLitro) {
		if (novoValorLitro > 0) {
			this.valorPorLitro = novoValorLitro;
			System.out.println("Valor Litro alterado para " + novoValorLitro + " L");
		} else {
			System.out.println("valor inválido! Alteração não autorizada.");
		}
	}

	// Método para alterar o tipo de combustível
	public void alterarCombustivel(String novoTipoCombustivel) {
		if (novoTipoCombustivel != null && !novoTipoCombustivel.trim().isEmpty()) {
			this.tipoCombustivel = novoTipoCombustivel;
			System.out.println("Valor tipo de combustível alterado para " + novoTipoCombustivel);
		} else {
			System.out.println("valor inválido! Alteração não autorizada.");
		}
	}

	// Método para alterar a quantidade de combustível
	public void alterarQuantidadeCombustivel(double novoQntdCombustivel) {
		if (novoQntdCombustivel >= 0) {
			this.qntdCombustivel = novoQntdCombustivel;
			System.out.println("Valor da nova quantidade de combustivel alterado para R$" + novoQntdCombustivel);
		} else {
			System.out.println("valor inválido! Alteração não autorizada.");
		}
	}

}
