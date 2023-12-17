package expressao.lambda;

public class Exemplo1OlaMundo {

	public static void main(String[] args) {
        
		
		Runnable runnableOla = () -> System.out.println("Ol�, mundo!");
		Thread threadOla = new Thread(runnableOla); // Criando uma inst�ncia de Thread e passando o Runnable para o construtor
        threadOla.start(); // Iniciando a execu��o da thread
		
		
        Runnable runnable = () -> { // Criando uma inst�ncia de Runnable usando uma express�o lambda
            System.out.println("Executando comando 1");
            System.out.println("Executando comando 2");
        };

        Thread thread = new Thread(runnable); // Criando uma inst�ncia de Thread e passando o Runnable para o construtor

        thread.start(); // Iniciando a execu��o da thread
    }

}
