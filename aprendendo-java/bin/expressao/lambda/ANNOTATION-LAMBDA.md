# Express�o Lambda

As express�es lambda s�o uma forma concisa de expressar comportamentos ou fun��es como argumentos de m�todos. Elas s�o frequentemente usadas em conjunto com interfaces funcionais.

Alguns conceitos importantes relacionados a express�es lambda:

1. **Sintaxe B�sica:**
   - A sintaxe b�sica de uma express�o lambda � `(par�metros) -> express�o` ou `(par�metros) -> { bloco de c�digo }`.
   - Se um m�todo n�o recebe par�metros, ainda precisa usar par�nteses vazios: `() -> express�o`.

2. **Interfaces Funcionais:**
   - Express�es lambda s�o frequentemente usadas com interfaces funcionais, que s�o interfaces que possuem apenas um m�todo abstrato.
   - Exemplos de interfaces funcionais incluem `Runnable`, `Callable`, `Comparator`, entre outras.

3. **Exemplos de Express�es Lambda:**
   - **Exemplo 1: Runnable**
     ```java
     Runnable runnable = () -> System.out.println("Ol�, mundo!");
     ```

**OBS.** A interface Runnable em Java faz parte do pacote java.lang e � fundamental em programa��o concorrente. Ela define um �nico m�todo chamado run() que cont�m o c�digo a ser executado por uma thread. Essa interface � uma das formas de criar threads em Java, sendo especialmente �til quando precisa executar tarefas em segundo plano ou em paralelo.

   - **Exemplo 2: Comparador**
     ```java
     List<String> palavras = Arrays.asList("Java", "�", "legal");
     palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
     ```

   - **Exemplo 3: Opera��es em Streams**
     ```java
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
     numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
     ```

**Stream em Java:**
Stream � uma API introduzida no Java 8 que permite processar sequ�ncias de elementos de forma mais concisa e funcional. Ele proporciona uma abordagem mais declarativa para opera��es de processamento de dados em cole��es.

Em resumo, um Stream em Java � uma sequ�ncia de elementos que suporta opera��es de processamento paralelo ou sequencial. Voc� pode criar streams a partir de diferentes fontes, como cole��es, arrays, ou at� mesmo gerar streams infinitos.

**O M�todo filter:**
filter � uma opera��o de Stream que retorna um novo Stream contendo elementos que atendem a uma condi��o espec�fica. Essa condi��o � expressa usando uma express�o lambda ou um m�todo de refer�ncia.

   - **Exemplo 4: Runnable com M�ltiplos Comandos**
     ```java
     Runnable runnable = () -> {
         System.out.println("Executando comando 1");
         System.out.println("Executando comando 2");
     };
     ```

4. **Tipos de Par�metros:**
   - Se o tipo do par�metro pode ser inferido, voc� pode omitir o tipo. Exemplo: `(a, b) -> a + b`.
   - Se o corpo da express�o contiver apenas uma instru��o e essa instru��o for uma express�o de retorno, as chaves e a instru��o de retorno podem ser omitidas.

5. **Vari�veis Finais ou Efetivamente Finais:**
   - As vari�veis locais referenciadas em uma express�o lambda devem ser final ou efetivamente finais (n�o modificadas ap�s a inicializa��o).

6. **Refer�ncias de M�todo:**
   - Como mencionado anteriormente, as express�es lambda podem ser simplificadas usando a sintaxe de refer�ncia de m�todo.

Exemplo de como usar uma express�o lambda em uma interface funcional:

```java
@FunctionalInterface
interface Operacao {
    int calcular(int a, int b);
}

public class ExemploLambda {
    public static void main(String[] args) {
        // Usando uma express�o lambda
        Operacao adicao = (a, b) -> a + b;
        System.out.println("Soma: " + adicao.calcular(3, 4));

        // Usando uma express�o lambda com refer�ncia de m�todo
        Operacao multiplicacao = Integer::multiply;
        System.out.println("Multiplica��o: " + multiplicacao.calcular(3, 4));
    }
}
```

Esses s�o apenas exemplos b�sicos, e as express�es lambda t�m muitos outros usos e caracter�sticas. Elas s�o particularmente poderosas ao trabalhar com Streams, programa��o concorrente e em situa��es em que precisa passar comportamentos como par�metros para m�todos.