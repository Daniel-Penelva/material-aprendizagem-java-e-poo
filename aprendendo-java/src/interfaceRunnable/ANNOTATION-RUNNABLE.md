# Interface Runnable

A interface `Runnable` em Java faz parte do pacote `java.lang` e é fundamental em programação concorrente. Ela define um único método chamado `run()` que contém o código a ser executado por uma thread. Essa interface é uma das formas de criar threads em Java, sendo especialmente útil quando precisa executar tarefas em segundo plano ou em paralelo.

Usar a interface `Runnable` é preferível em comparação com estender diretamente a classe `Thread` porque permite que você evite limitações de herança e ainda permite que a classe seja estendida por outras classes.

Além disso, a interface `Runnable` é frequentemente usada em situações em que você deseja executar tarefas em segundo plano, como em aplicativos gráficos ou servidores que precisam atender a várias solicitações simultaneamente.