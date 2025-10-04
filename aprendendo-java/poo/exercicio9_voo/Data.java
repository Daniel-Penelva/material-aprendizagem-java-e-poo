package exercicio9_voo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    
    // Construtor
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Configurando para 01/01/0001.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    
    // Validação da data
    private boolean dataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasMes = { 31, (isBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return dia <= diasMes[mes - 1];
    }

    
    // Método compara
    public int compara(Data outraData) {
        if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia == outraData.dia) {
            return 0; // Datas iguais
        } else if (this.ano > outraData.ano ||
                (this.ano == outraData.ano && this.mes > outraData.mes) ||
                (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)) {
            return 1; // Data corrente maior
        } else {
            return -1; // Outra data maior
        }
    }

    
    // Métodos Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Retorna mês por extenso
    public String getMesExtenso() {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return meses[mes - 1];
    }

    
    // Métodos verifica ano bissexto
    public boolean isBissexto() {
        return isBissexto(this.ano);
    }

    private boolean isBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    
    // Método Clone
    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

   
    // toString
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}

