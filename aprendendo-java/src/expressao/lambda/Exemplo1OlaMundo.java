package expressao.lambda;

public class Exemplo1OlaMundo {

	public static void main(String[] args) {
        
		
		Runnable runnableOla = () -> System.out.println("Olá, mundo!");
		Thread threadOla = new Thread(runnableOla); // Criando uma instância de Thread e passando o Runnable para o construtor
        threadOla.start(); // Iniciando a execução da thread
		
		
        Runnable runnable = () -> { // Criando uma instância de Runnable usando uma expressão lambda
            System.out.println("Executando comando 1");
            System.out.println("Executando comando 2");
        };

        Thread thread = new Thread(runnable); // Criando uma instância de Thread e passando o Runnable para o construtor

        thread.start(); // Iniciando a execução da thread
    }

}
