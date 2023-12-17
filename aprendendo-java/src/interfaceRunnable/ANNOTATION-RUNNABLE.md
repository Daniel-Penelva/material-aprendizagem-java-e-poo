# Interface Runnable

A interface `Runnable` em Java faz parte do pacote `java.lang` e � fundamental em programa��o concorrente. Ela define um �nico m�todo chamado `run()` que cont�m o c�digo a ser executado por uma thread. Essa interface � uma das formas de criar threads em Java, sendo especialmente �til quando precisa executar tarefas em segundo plano ou em paralelo.

Usar a interface `Runnable` � prefer�vel em compara��o com estender diretamente a classe `Thread` porque permite que voc� evite limita��es de heran�a e ainda permite que a classe seja estendida por outras classes.

Al�m disso, a interface `Runnable` � frequentemente usada em situa��es em que voc� deseja executar tarefas em segundo plano, como em aplicativos gr�ficos ou servidores que precisam atender a v�rias solicita��es simultaneamente.