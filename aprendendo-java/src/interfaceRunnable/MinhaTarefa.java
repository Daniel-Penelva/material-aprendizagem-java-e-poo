package interfaceRunnable;

public class MinhaTarefa implements Runnable{
	
	public static void main(String[] args) {
	
        for (int i = 0; i < 5; i++) { // Código a ser executado pela thread
            System.out.println(Thread.currentThread().getId() + " - Contagem: " + i);
        }
	}

	@Override
	public void run() {
		
		// Criando uma instância da classe que implementa Runnable
        MinhaTarefa minhaTarefa = new MinhaTarefa();

        // Criando uma instância de Thread e passando a instância de Runnable
        Thread thread = new Thread((java.lang.Runnable) minhaTarefa);

        // Iniciando a execução da thread
        thread.start();
		
	}
}
