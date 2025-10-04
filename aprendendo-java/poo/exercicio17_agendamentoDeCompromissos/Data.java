package exercicio17_agendamentoDeCompromissos;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		if (dataValida(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
	}

	private boolean dataValida(int dia, int mes, int ano) {
		if (ano < 1 || mes < 1 || mes > 12 || dia < 1)
			return false;
		int[] diasMes = { 31, (isBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return dia <= diasMes[mes - 1];
	}

	private boolean isBissexto(int ano) {
		return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}

	public boolean equals(Data outra) {
		return this.dia == outra.dia && this.mes == outra.mes && this.ano == outra.ano;
	}
}
