package serializacao;

import java.io.Serializable;

public class ContaSerializacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String cliente;
	private double saldo;

	// Construtores
	public ContaSerializacao() {

	}

	public ContaSerializacao(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	// M�todos Getters e Setters
	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	// M�todos espec�ficos
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo � de : " + saldo);
	}

	public void saca(double valor) {
		saldo = saldo - valor; // saldo -= valor
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void transferePara(ContaSerializacao destino, double valor) {

		this.saca(valor);
		destino.deposito(valor);

	}
}
