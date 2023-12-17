# Transient

A palavra-chave transient � utilizada em campos de uma classe para indicar que eles n�o devem ser inclu�dos no processo de serializa��o. Quando um campo � marcado como transient, seu valor n�o ser� persistido quando um objeto da classe for serializado, o que significa que o conte�do desse campo n�o ser� gravado no fluxo de bytes resultante.

A utiliza��o de transient � �til em casos em que certos campos de um objeto n�o precisam ou n�o podem ser serializados. Isso pode ocorrer, por exemplo, quando um campo cont�m dados tempor�rios, sens�veis � seguran�a ou que podem ser facilmente regenerados.