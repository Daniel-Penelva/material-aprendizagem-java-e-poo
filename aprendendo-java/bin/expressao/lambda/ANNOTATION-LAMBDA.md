# Expressão Lambda

As expressões lambda são uma forma concisa de expressar comportamentos ou funções como argumentos de métodos. Elas são frequentemente usadas em conjunto com interfaces funcionais.

Alguns conceitos importantes relacionados a expressões lambda:

1. **Sintaxe Básica:**
   - A sintaxe básica de uma expressão lambda é `(parâmetros) -> expressão` ou `(parâmetros) -> { bloco de código }`.
   - Se um método não recebe parâmetros, ainda precisa usar parênteses vazios: `() -> expressão`.

2. **Interfaces Funcionais:**
   - Expressões lambda são frequentemente usadas com interfaces funcionais, que são interfaces que possuem apenas um método abstrato.
   - Exemplos de interfaces funcionais incluem `Runnable`, `Callable`, `Comparator`, entre outras.

3. **Exemplos de Expressões Lambda:**
   - **Exemplo 1: Runnable**
     ```java
     Runnable runnable = () -> System.out.println("Olá, mundo!");
     ```

**OBS.** A interface Runnable em Java faz parte do pacote java.lang e é fundamental em programação concorrente. Ela define um único método chamado run() que contém o código a ser executado por uma thread. Essa interface é uma das formas de criar threads em Java, sendo especialmente útil quando precisa executar tarefas em segundo plano ou em paralelo.

   - **Exemplo 2: Comparador**
     ```java
     List<String> palavras = Arrays.asList("Java", "é", "legal");
     palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
     ```

   - **Exemplo 3: Operações em Streams**
     ```java
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
     numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
     ```

**Stream em Java:**
Stream é uma API introduzida no Java 8 que permite processar sequências de elementos de forma mais concisa e funcional. Ele proporciona uma abordagem mais declarativa para operações de processamento de dados em coleções.

Em resumo, um Stream em Java é uma sequência de elementos que suporta operações de processamento paralelo ou sequencial. Você pode criar streams a partir de diferentes fontes, como coleções, arrays, ou até mesmo gerar streams infinitos.

**O Método filter:**
filter é uma operação de Stream que retorna um novo Stream contendo elementos que atendem a uma condição específica. Essa condição é expressa usando uma expressão lambda ou um método de referência.

   - **Exemplo 4: Runnable com Múltiplos Comandos**
     ```java
     Runnable runnable = () -> {
         System.out.println("Executando comando 1");
         System.out.println("Executando comando 2");
     };
     ```

4. **Tipos de Parâmetros:**
   - Se o tipo do parâmetro pode ser inferido, você pode omitir o tipo. Exemplo: `(a, b) -> a + b`.
   - Se o corpo da expressão contiver apenas uma instrução e essa instrução for uma expressão de retorno, as chaves e a instrução de retorno podem ser omitidas.

5. **Variáveis Finais ou Efetivamente Finais:**
   - As variáveis locais referenciadas em uma expressão lambda devem ser final ou efetivamente finais (não modificadas após a inicialização).

6. **Referências de Método:**
   - Como mencionado anteriormente, as expressões lambda podem ser simplificadas usando a sintaxe de referência de método.

Exemplo de como usar uma expressão lambda em uma interface funcional:

```java
@FunctionalInterface
interface Operacao {
    int calcular(int a, int b);
}

public class ExemploLambda {
    public static void main(String[] args) {
        // Usando uma expressão lambda
        Operacao adicao = (a, b) -> a + b;
        System.out.println("Soma: " + adicao.calcular(3, 4));

        // Usando uma expressão lambda com referência de método
        Operacao multiplicacao = Integer::multiply;
        System.out.println("Multiplicação: " + multiplicacao.calcular(3, 4));
    }
}
```

Esses são apenas exemplos básicos, e as expressões lambda têm muitos outros usos e características. Elas são particularmente poderosas ao trabalhar com Streams, programação concorrente e em situações em que precisa passar comportamentos como parâmetros para métodos.