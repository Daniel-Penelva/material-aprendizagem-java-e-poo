# Exception

## Palavra Chave throws

A palavra-chave throws � usada para declarar que um m�todo pode lan�ar uma exce��o espec�fica, mas n�o lida com ela dentro do m�todo. O tratamento da exce��o � delegado ao chamador do m�todo.

O uso de throws � �til quando voc� quer indicar explicitamente as exce��es que um m�todo pode lan�ar e quando quer que o c�digo que chama esse m�todo trate essas exce��es. Lembre-se de que as exce��es checadas (n�o subclasse de RuntimeException) devem ser tratadas ou declaradas usando throws.