# Classe Optional

O `Optional` é uma classe introduzida no Java 8 para lidar com a possibilidade de valores nulos de maneira mais expressiva e segura. Ele é parte do pacote `java.util` e é usado para representar um valor opcional, ou seja, um valor que pode ser presente ou ausente.

### Objetivo do `Optional`:

O `Optional` tem como objetivo evitar o uso excessivo de valores nulos, reduzindo a necessidade de verificações de nulidade (`null` checks) e oferecendo uma abordagem mais limpa e funcional para trabalhar com valores que podem ser opcionais.

### Principais Métodos e Operações do `Optional`:

1. **`of` e `ofNullable`**: Cria uma instância de `Optional`.

    ```java
    Optional<String> optionalString = Optional.of("Valor presente");
    Optional<String> optionalNullable = Optional.ofNullable(null);  // Valor pode ser nulo
    ```

2. **`isPresent`**: Verifica se o valor está presente.

    ```java
    if (optionalString.isPresent()) {
        System.out.println("Valor presente: " + optionalString.get());
    }
    ```

3. **`ifPresent`**: Executa um bloco de código se o valor estiver presente.

    ```java
    optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
    ```

4. **`orElse` e `orElseGet`**: Fornecem um valor padrão se o valor não estiver presente.

    ```java
    String valorPadrao = optionalNullable.orElse("Valor Padrão");
    String valorPadraoLazy = optionalNullable.orElseGet(() -> obterValorPadrao());
    ```

5. **`map` e `flatMap`**: Transformam o valor presente usando uma função.

    ```java
    Optional<String> resultado = optionalString.map(valor -> valor.toUpperCase());
    ```

6. **`filter`**: Filtra o valor se atender a uma condição.

    ```java
    Optional<String> resultadoFiltrado = optionalString.filter(valor -> valor.length() > 5); 
    ```
Mais Exemplos: 

- `filter(Predicate<? super T> predicate)` permite filtrar o valor presente com base em uma condição. Retorna um `Optional` vazio se o valor não atender à condição.

   ```java
   Optional<String> resultadoFiltrado = optionalString.filter(valor -> valor.length() > 5);
   ```

7. **`orElse` e `orElseGet`**:
   - `orElse(T other)` fornece um valor padrão se o valor não estiver presente.
   - `orElseGet(Supplier<? extends T> other)` permite fornecer um valor padrão usando um `Supplier` apenas se o valor não estiver presente. Isso é útil quando a criação do valor padrão é computacionalmente custosa.

   ```java
   String valorPadrao = optionalNullable.orElse("Valor Padrão");
   String valorPadraoLazy = optionalNullable.orElseGet(() -> obterValorPadrao());
   ```
 Mais Exemplos:
 
 - `filter(Predicate<? super T> predicate)` permite filtrar o valor presente com base em uma condição. Retorna um `Optional` vazio se o valor não atender à condição.

   ```java
   Optional<String> resultadoFiltrado = optionalString.filter(valor -> valor.length() > 5);
   ```

8. **`orElseThrow`**:
   - `orElseThrow` é usado quando você deseja lançar uma exceção se o valor não estiver presente. É útil quando a ausência de um valor é considerada uma condição excepcional.

   ```java
   String valor = optionalNullable.orElseThrow(() -> new NoSuchElementException("Valor não presente"));
   ```

9. **`flatMap`**:
   - `flatMap` é semelhante a `map`, mas permite que a função de mapeamento retorne um `Optional`. Isso é útil quando você deseja evitar a aninhamento desnecessário de `Optional`.

   ```java
   Optional<String> resultado = optionalString.flatMap(valor -> Optional.ofNullable(obterAlgumValorComBaseNo(valor)));
   ```

10. **`ifPresent`**:
   - `ifPresent(Consumer<? super T> consumer)` executa um bloco de código se o valor estiver presente. Similar ao `ifPresent` mencionado anteriormente, mas sem fornecer uma ação alternativa.

   ```java
   optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
   ```

11. **`equals`**:
   - O método `equals` compara dois objetos `Optional` para igualdade.

   ```java
   boolean saoIguais = optional1.equals(optional2);
   ```

Esses métodos adicionais fornecem maior flexibilidade ao trabalhar com `Optional` em diferentes contextos. Ao escolher o método apropriado, você pode lidar efetivamente com casos em que o valor pode estar ausente e, ao mesmo tempo, expressar sua intenção de maneira clara e concisa no código.

### Benefícios do `Optional`:

- **Expressividade**: Código mais claro e expressivo, evitando verificações nulas extensas.
  
- **Evita `NullPointerException`**: Ajuda a evitar `NullPointerException` ao forçar o programador a lidar explicitamente com a possibilidade de valores nulos.

- **Encadeamento Funcional**: Facilita o encadeamento de operações, tornando o código mais funcional.

### Observações:

- **Imutabilidade**: A classe `Optional` é imutável, o que significa que, uma vez criada, não pode ser modificada. Todas as operações sobre um `Optional` retornam um novo `Optional`.

- **Uso Consciente**: Embora o `Optional` seja uma ferramenta útil, é importante usá-lo de forma consciente e evitar a tentação de abusar do seu uso. Nem todos os casos de valores nulos exigem o uso de `Optional`.

- **Desempenho**: Em termos de desempenho, `Optional` geralmente não traz impacto significativo. No entanto, o seu uso excessivo pode afetar negativamente o desempenho em comparação com verificações de nulidade diretas em alguns casos.

Exemplo de uso geral:

```java
Optional<String> optionalString = Optional.ofNullable(obterValor());
optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
```

No exemplo acima, `obterValor()` é uma função fictícia que pode retornar `null`. `Optional.ofNullable` é usado para criar um `Optional` a partir desse valor, e `ifPresent` é usado para imprimir o valor apenas se estiver presente.