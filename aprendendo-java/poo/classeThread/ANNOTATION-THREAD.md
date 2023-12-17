# Thread

Uma thread em Java representa uma �nica linha de execu��o em um programa. Em Java pode criar threads usando a classe `Thread` ou implementando a interface `Runnable`. Threads s�o �teis para realizar tarefas simult�neas e paralelas.

Existem duas maneiras principais de criar threads em Java:

1. **Estendendo a classe `Thread`:**
   - Criar uma classe que estende `Thread` e sobrescrever o m�todo `run()`.
   - Criar uma inst�ncia da sua classe e chamar `start()` para iniciar a execu��o.

   ```java
   class MinhaThread extends Thread {
       public void run() {
           // L�gica da thread
       }
   }

   // Criar e iniciar a thread
   MinhaThread minhaThread = new MinhaThread();
   minhaThread.start();
   ```

2. **Implementando a interface `Runnable`:**
   - Criar uma classe que implementa `Runnable` e fornecer uma implementa��o para o m�todo `run()`.
   - Criar uma inst�ncia da sua classe, pass�-la para um construtor de `Thread` e chamar `start()`.

   ```java
   class MinhaRunnable implements Runnable {
       public void run() {
           // L�gica da thread
       }
   }

   // Criar e iniciar a thread
   Thread minhaThread = new Thread(new MinhaRunnable());
   minhaThread.start();
   ```

### Exemplo de Programa com Threads:

Exemplo simples de um programa que utiliza threads para imprimir n�meros de 1 a 5 simultaneamente:

```java
public class ExemploThreads {

    public static void main(String[] args) {
        // Criar e iniciar threads
        Thread thread1 = new Thread(new ImprimeNumeros(1, 5));
        Thread thread2 = new Thread(new ImprimeNumeros(6, 10));

        thread1.start();
        thread2.start();
    }
}

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
                Thread.sleep(100); // Simula uma opera��o demorada
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

Neste exemplo:

- A classe `ImprimeNumeros` implementa a interface `Runnable` e imprime n�meros de `inicio` a `fim`.
- No m�todo `run()`, cada thread imprime os n�meros e simula uma opera��o demorada com `Thread.sleep(100)`.
- O programa principal (`ExemploThreads`) cria duas inst�ncias da classe `Thread`, passando inst�ncias de `ImprimeNumeros` como argumentos.
- As threads s�o iniciadas com `start()`, o que chama o m�todo `run()` na classe `ImprimeNumeros`.
- O m�todo currentThread() � um m�todo est�tico da classe Thread em Java e � utilizado para obter a refer�ncia da thread atual em execu��o. Especificamente, ele retorna um objeto Thread que representa a thread que est� chamando o m�todo. O m�todo � est�tico, o que significa que ele pode ser chamado diretamente a partir da classe Thread sem a necessidade de criar uma inst�ncia da classe.

Ao executar esse programa ver� que os n�meros s�o impressos simultaneamente por ambas as threads, demonstrando a execu��o concorrente.