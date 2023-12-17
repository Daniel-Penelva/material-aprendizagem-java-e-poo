package interfaceRunnable;

public class MinhaTarefa implements Runnable{
	
	public static void main(String[] args) {
	
        for (int i = 0; i < 5; i++) { // C�digo a ser executado pela thread
            System.out.println(Thread.currentThread().getId() + " - Contagem: " + i);
        }
	}

	@Override
	public void run() {
		
		// Criando uma inst�ncia da classe que implementa Runnable
        MinhaTarefa minhaTarefa = new MinhaTarefa();

        // Criando uma inst�ncia de Thread e passando a inst�ncia de Runnable
        Thread thread = new Thread((java.lang.Runnable) minhaTarefa);

        // Iniciando a execu��o da thread
        thread.start();
		
	}
}
