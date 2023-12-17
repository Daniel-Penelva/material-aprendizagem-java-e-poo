package metodo.sobrecarregado;

public class ExemploSobrecarga {

    // Método sobrecarregado com um parâmetro inteiro
    public void exibirMensagem(int numero) {
        System.out.println("Número inteiro: " + numero);
    }

    // Método sobrecarregado com uma string
    public void exibirMensagem(String texto) {
        System.out.println("Texto: " + texto);
    }

    // Método sobrecarregado com dois inteiros
    public void exibirMensagem(int num1, int num2) {
        System.out.println("Soma dos números: " + (num1 + num2));
    }

    // Método sobrecarregado com um float
    public void exibirMensagem(float numero) {
        System.out.println("Número float: " + numero);
    }

    public static void main(String[] args) {
        
    	ExemploSobrecarga exemplo = new ExemploSobrecarga();

        // Chamadas de métodos sobrecarregados
        exemplo.exibirMensagem(42);
        exemplo.exibirMensagem("Olá, mundo!");
        exemplo.exibirMensagem(10, 20);
        exemplo.exibirMensagem(3.14f);
    }
}

/**
 * A sobrecarga de métodos em Java refere-se à capacidade de uma classe ter dois ou mais métodos com o mesmo nome, desde que a lista de parâmetros seja 
 * diferente (em termos de número, tipo ou ordem). Isso permite que forneça diferentes versões do mesmo método para acomodar diferentes situações ou tipos 
 * de dados.*/
