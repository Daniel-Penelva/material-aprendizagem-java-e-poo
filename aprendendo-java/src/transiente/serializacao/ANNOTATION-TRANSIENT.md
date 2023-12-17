# Transient

A palavra-chave transient é utilizada em campos de uma classe para indicar que eles não devem ser incluídos no processo de serialização. Quando um campo é marcado como transient, seu valor não será persistido quando um objeto da classe for serializado, o que significa que o conteúdo desse campo não será gravado no fluxo de bytes resultante.

A utilização de transient é útil em casos em que certos campos de um objeto não precisam ou não podem ser serializados. Isso pode ocorrer, por exemplo, quando um campo contém dados temporários, sensíveis à segurança ou que podem ser facilmente regenerados.