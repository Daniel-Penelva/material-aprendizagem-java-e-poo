package classeThread;

public class ExemploCurrentThread {
	public static void main(String[] args) {
		
		Thread threadPrincipal = Thread.currentThread();
		System.out.println("Thread Principal: " + threadPrincipal.getName());

		// Criar uma nova thread
		Thread minhaThread = new Thread(() -> {
			Thread threadAtual = Thread.currentThread();
			System.out.println("Minha Thread: " + threadAtual.getName());
		});

		// Iniciar a nova thread
		minhaThread.start();
	}
}
