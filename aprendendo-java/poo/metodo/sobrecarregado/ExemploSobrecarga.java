package metodo.sobrecarregado;

public class ExemploSobrecarga {

    // M�todo sobrecarregado com um par�metro inteiro
    public void exibirMensagem(int numero) {
        System.out.println("N�mero inteiro: " + numero);
    }

    // M�todo sobrecarregado com uma string
    public void exibirMensagem(String texto) {
        System.out.println("Texto: " + texto);
    }

    // M�todo sobrecarregado com dois inteiros
    public void exibirMensagem(int num1, int num2) {
        System.out.println("Soma dos n�meros: " + (num1 + num2));
    }

    // M�todo sobrecarregado com um float
    public void exibirMensagem(float numero) {
        System.out.println("N�mero float: " + numero);
    }

    public static void main(String[] args) {
        
    	ExemploSobrecarga exemplo = new ExemploSobrecarga();

        // Chamadas de m�todos sobrecarregados
        exemplo.exibirMensagem(42);
        exemplo.exibirMensagem("Ol�, mundo!");
        exemplo.exibirMensagem(10, 20);
        exemplo.exibirMensagem(3.14f);
    }
}

/**
 * A sobrecarga de m�todos em Java refere-se � capacidade de uma classe ter dois ou mais m�todos com o mesmo nome, desde que a lista de par�metros seja 
 * diferente (em termos de n�mero, tipo ou ordem). Isso permite que forne�a diferentes vers�es do mesmo m�todo para acomodar diferentes situa��es ou tipos 
 * de dados.*/
