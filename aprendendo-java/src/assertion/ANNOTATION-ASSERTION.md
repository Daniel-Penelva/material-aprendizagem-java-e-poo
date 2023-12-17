# Assertions (Assertivas)

As assertivas, ou assertions, em Java s�o uma ferramenta para testar suposi��es sobre seu c�digo durante o desenvolvimento e s�o frequentemente usadas para realizar testes de unidade. No entanto, � importante notar que o uso de assertivas � desativado por padr�o e deve ser ativado explicitamente usando a op��o -ea (enableassertions) ao executar o programa.

� importante destacar que o uso excessivo de assertivas em substitui��o a testes apropriados pode ser prejudicial. As assertivas s�o mais adequadas para verificar suposi��es internas durante o desenvolvimento e podem ser desativadas em ambientes de produ��o. Al�m disso, elas n�o devem ser usadas para realizar a valida��o de entrada ou substituir o tratamento adequado de exce��es. O principal objetivo das assertivas � auxiliar no desenvolvimento e na depura��o do c�digo.

## Ativando as Assertivas

Para ativar as assertivas, voc� pode usar a op��o `-ea` ao executar o programa. Por exemplo, ao usar a linha de comando:

```bash
java -ea NomeDoPrograma
```

### Desativando as Assertivas

Para desativar as assertivas, voc� pode usar a op��o `-da` ao executar o programa. Por exemplo:

```bash
java -da NomeDoPrograma
```
