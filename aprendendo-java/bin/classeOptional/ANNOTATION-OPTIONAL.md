# Classe Optional

O `Optional` � uma classe introduzida no Java 8 para lidar com a possibilidade de valores nulos de maneira mais expressiva e segura. Ele � parte do pacote `java.util` e � usado para representar um valor opcional, ou seja, um valor que pode ser presente ou ausente.

### Objetivo do `Optional`:

O `Optional` tem como objetivo evitar o uso excessivo de valores nulos, reduzindo a necessidade de verifica��es de nulidade (`null` checks) e oferecendo uma abordagem mais limpa e funcional para trabalhar com valores que podem ser opcionais.

### Principais M�todos e Opera��es do `Optional`:

1. **`of` e `ofNullable`**: Cria uma inst�ncia de `Optional`.

    ```java
    Optional<String> optionalString = Optional.of("Valor presente");
    Optional<String> optionalNullable = Optional.ofNullable(null);  // Valor pode ser nulo
    ```

2. **`isPresent`**: Verifica se o valor est� presente.

    ```java
    if (optionalString.isPresent()) {
        System.out.println("Valor presente: " + optionalString.get());
    }
    ```

3. **`ifPresent`**: Executa um bloco de c�digo se o valor estiver presente.

    ```java
    optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
    ```

4. **`orElse` e `orElseGet`**: Fornecem um valor padr�o se o valor n�o estiver presente.

    ```java
    String valorPadrao = optionalNullable.orElse("Valor Padr�o");
    String valorPadraoLazy = optionalNullable.orElseGet(() -> obterValorPadrao());
    ```

5. **`map` e `flatMap`**: Transformam o valor presente usando uma fun��o.

    ```java
    Optional<String> resultado = optionalString.map(valor -> valor.toUpperCase());
    ```

6. **`filter`**: Filtra o valor se atender a uma condi��o.

    ```java
    Optional<String> resultadoFiltrado = optionalString.filter(valor -> valor.length() > 5); 
    ```
Mais Exemplos: 

- `filter(Predicate<? super T> predicate)` permite filtrar o valor presente com base em uma condi��o. Retorna um `Optional` vazio se o valor n�o atender � condi��o.

   ```java
   Optional<String> resultadoFiltrado = optionalString.filter(valor -> valor.length() > 5);
   ```

7. **`orElse` e `orElseGet`**:
   - `orElse(T other)` fornece um valor padr�o se o valor n�o estiver presente.
   - `orElseGet(Supplier<? extends T> other)` permite fornecer um valor padr�o usando um `Supplier` apenas se o valor n�o estiver presente. Isso � �til quando a cria��o do valor padr�o � computacionalmente custosa.

   ```java
   String valorPadrao = optionalNullable.orElse("Valor Padr�o");
   String valorPadraoLazy = optionalNullable.orElseGet(() -> obterValorPadrao());
   ```
 Mais Exemplos:
 
 - `filter(Predicate<? super T> predicate)` permite filtrar o valor presente com base em uma condi��o. Retorna um `Optional` vazio se o valor n�o atender � condi��o.

   ```java
   Optional<String> resultadoFiltrado = optionalString.filter(valor -> valor.length() > 5);
   ```

8. **`orElseThrow`**:
   - `orElseThrow` � usado quando voc� deseja lan�ar uma exce��o se o valor n�o estiver presente. � �til quando a aus�ncia de um valor � considerada uma condi��o excepcional.

   ```java
   String valor = optionalNullable.orElseThrow(() -> new NoSuchElementException("Valor n�o presente"));
   ```

9. **`flatMap`**:
   - `flatMap` � semelhante a `map`, mas permite que a fun��o de mapeamento retorne um `Optional`. Isso � �til quando voc� deseja evitar a aninhamento desnecess�rio de `Optional`.

   ```java
   Optional<String> resultado = optionalString.flatMap(valor -> Optional.ofNullable(obterAlgumValorComBaseNo(valor)));
   ```

10. **`ifPresent`**:
   - `ifPresent(Consumer<? super T> consumer)` executa um bloco de c�digo se o valor estiver presente. Similar ao `ifPresent` mencionado anteriormente, mas sem fornecer uma a��o alternativa.

   ```java
   optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
   ```

11. **`equals`**:
   - O m�todo `equals` compara dois objetos `Optional` para igualdade.

   ```java
   boolean saoIguais = optional1.equals(optional2);
   ```

Esses m�todos adicionais fornecem maior flexibilidade ao trabalhar com `Optional` em diferentes contextos. Ao escolher o m�todo apropriado, voc� pode lidar efetivamente com casos em que o valor pode estar ausente e, ao mesmo tempo, expressar sua inten��o de maneira clara e concisa no c�digo.

### Benef�cios do `Optional`:

- **Expressividade**: C�digo mais claro e expressivo, evitando verifica��es nulas extensas.
  
- **Evita `NullPointerException`**: Ajuda a evitar `NullPointerException` ao for�ar o programador a lidar explicitamente com a possibilidade de valores nulos.

- **Encadeamento Funcional**: Facilita o encadeamento de opera��es, tornando o c�digo mais funcional.

### Observa��es:

- **Imutabilidade**: A classe `Optional` � imut�vel, o que significa que, uma vez criada, n�o pode ser modificada. Todas as opera��es sobre um `Optional` retornam um novo `Optional`.

- **Uso Consciente**: Embora o `Optional` seja uma ferramenta �til, � importante us�-lo de forma consciente e evitar a tenta��o de abusar do seu uso. Nem todos os casos de valores nulos exigem o uso de `Optional`.

- **Desempenho**: Em termos de desempenho, `Optional` geralmente n�o traz impacto significativo. No entanto, o seu uso excessivo pode afetar negativamente o desempenho em compara��o com verifica��es de nulidade diretas em alguns casos.

Exemplo de uso geral:

```java
Optional<String> optionalString = Optional.ofNullable(obterValor());
optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
```

No exemplo acima, `obterValor()` � uma fun��o fict�cia que pode retornar `null`. `Optional.ofNullable` � usado para criar um `Optional` a partir desse valor, e `ifPresent` � usado para imprimir o valor apenas se estiver presente.