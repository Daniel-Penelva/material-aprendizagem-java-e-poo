# Assertions (Assertivas)

As assertivas, ou assertions, em Java são uma ferramenta para testar suposições sobre seu código durante o desenvolvimento e são frequentemente usadas para realizar testes de unidade. No entanto, é importante notar que o uso de assertivas é desativado por padrão e deve ser ativado explicitamente usando a opção -ea (enableassertions) ao executar o programa.

É importante destacar que o uso excessivo de assertivas em substituição a testes apropriados pode ser prejudicial. As assertivas são mais adequadas para verificar suposições internas durante o desenvolvimento e podem ser desativadas em ambientes de produção. Além disso, elas não devem ser usadas para realizar a validação de entrada ou substituir o tratamento adequado de exceções. O principal objetivo das assertivas é auxiliar no desenvolvimento e na depuração do código.

## Ativando as Assertivas

Para ativar as assertivas, você pode usar a opção `-ea` ao executar o programa. Por exemplo, ao usar a linha de comando:

```bash
java -ea NomeDoPrograma
```

### Desativando as Assertivas

Para desativar as assertivas, você pode usar a opção `-da` ao executar o programa. Por exemplo:

```bash
java -da NomeDoPrograma
```
