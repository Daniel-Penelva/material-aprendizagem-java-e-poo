package classeThread;

public class ExemploThreads {

	public static void main(String[] args) {
		
		// Criar e iniciar threads
		Thread thread1 = new Thread(new ImprimeNumeros(1, 5));
		Thread thread2 = new Thread(new ImprimeNumeros(6, 10));

		thread1.start();
		thread2.start();
	}
}

// Classe interna Runnable
class ImprimeNumeros implements Runnable {
	
	private int inicio;
	private int fim;

	public ImprimeNumeros(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public void run() {
		
		for (int i = inicio; i <= fim; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(100); // Simula uma operação demorada
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
