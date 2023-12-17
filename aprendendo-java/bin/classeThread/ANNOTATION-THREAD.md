# Thread

Uma thread em Java representa uma única linha de execução em um programa. Em Java pode criar threads usando a classe `Thread` ou implementando a interface `Runnable`. Threads são úteis para realizar tarefas simultâneas e paralelas.

Existem duas maneiras principais de criar threads em Java:

1. **Estendendo a classe `Thread`:**
   - Criar uma classe que estende `Thread` e sobrescrever o método `run()`.
   - Criar uma instância da sua classe e chamar `start()` para iniciar a execução.

   ```java
   class MinhaThread extends Thread {
       public void run() {
           // Lógica da thread
       }
   }

   // Criar e iniciar a thread
   MinhaThread minhaThread = new MinhaThread();
   minhaThread.start();
   ```

2. **Implementando a interface `Runnable`:**
   - Criar uma classe que implementa `Runnable` e fornecer uma implementação para o método `run()`.
   - Criar uma instância da sua classe, passá-la para um construtor de `Thread` e chamar `start()`.

   ```java
   class MinhaRunnable implements Runnable {
       public void run() {
           // Lógica da thread
       }
   }

   // Criar e iniciar a thread
   Thread minhaThread = new Thread(new MinhaRunnable());
   minhaThread.start();
   ```

### Exemplo de Programa com Threads:

Exemplo simples de um programa que utiliza threads para imprimir números de 1 a 5 simultaneamente:

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
                Thread.sleep(100); // Simula uma operação demorada
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

Neste exemplo:

- A classe `ImprimeNumeros` implementa a interface `Runnable` e imprime números de `inicio` a `fim`.
- No método `run()`, cada thread imprime os números e simula uma operação demorada com `Thread.sleep(100)`.
- O programa principal (`ExemploThreads`) cria duas instâncias da classe `Thread`, passando instâncias de `ImprimeNumeros` como argumentos.
- As threads são iniciadas com `start()`, o que chama o método `run()` na classe `ImprimeNumeros`.
- O método currentThread() é um método estático da classe Thread em Java e é utilizado para obter a referência da thread atual em execução. Especificamente, ele retorna um objeto Thread que representa a thread que está chamando o método. O método é estático, o que significa que ele pode ser chamado diretamente a partir da classe Thread sem a necessidade de criar uma instância da classe.

Ao executar esse programa verá que os números são impressos simultaneamente por ambas as threads, demonstrando a execução concorrente.