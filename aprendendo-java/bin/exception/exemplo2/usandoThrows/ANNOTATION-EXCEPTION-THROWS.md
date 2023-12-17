# Exception

## Palavra Chave throws

A palavra-chave throws é usada para declarar que um método pode lançar uma exceção específica, mas não lida com ela dentro do método. O tratamento da exceção é delegado ao chamador do método.

O uso de throws é útil quando você quer indicar explicitamente as exceções que um método pode lançar e quando quer que o código que chama esse método trate essas exceções. Lembre-se de que as exceções checadas (não subclasse de RuntimeException) devem ser tratadas ou declaradas usando throws.