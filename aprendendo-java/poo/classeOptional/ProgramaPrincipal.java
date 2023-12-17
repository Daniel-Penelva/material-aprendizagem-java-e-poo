package classeOptional;

import java.util.Optional;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Criar instâncias de Usuario com e sem nome
        Usuario usuarioComNome = new Usuario("João");
        Usuario usuarioSemNome = new Usuario(null);

        // Exemplo utilizando Optional para imprimir o nome do usuário
        imprimirNome(usuarioComNome);
        imprimirNome(usuarioSemNome);

	}

	// Método que utiliza Optional para imprimir o nome do usuário, lidando com casos nulos
	private static void imprimirNome(Usuario usuario) {
        
		Optional.ofNullable(usuario)
                .map(Usuario::getNome)
                .ifPresentOrElse(nome -> System.out.println("Nome do usuário: " + nome),
                        () -> System.out.println("Nome não disponível")
                );
	}
}


/** Explicando passo a passo o método imprimirNome():
 * 
 * O método `imprimirNome` é um exemplo de como usar o `Optional` para lidar com a possibilidade de um nome de usuário ser nulo. 
 * 
 * 1. **`Optional.ofNullable(usuario)`**:
 *     - `Optional.ofNullable` cria um `Optional` a partir do objeto `usuario`. Isso é útil porque `ofNullable` permite lidar com a situação em que o 
 *       `usuario` pode ser nulo sem lançar uma exceção.
 *       
 * 2. **`map(Usuario::getNome)`**:
 * 		- `map` é usado para transformar o valor dentro do `Optional`. Neste caso, estou mapeando o `Usuario` para seu nome. Se o `usuario` não for nulo, 
 *        `map` aplica a função `Usuario::getNome` para obter o nome. Se o `usuario` for nulo, `map` não faz nada.
 *        
 * 3. **`ifPresentOrElse(...)`**:
 * 		- `ifPresentOrElse` é usado para executar ações com base na presença ou ausência do valor dentro do `Optional`.
 * 		- Se o valor estiver presente (ou seja, o nome não é nulo), o primeiro lambda (`nome -> System.out.println("Nome do usuário: " + nome)`) será 
 *        executado, imprimindo o nome do usuário.
 *      - Se o valor não estiver presente (ou seja, o nome é nulo), o segundo lambda (`() -> System.out.println("Nome não disponível")`) será executado, 
 *        imprimindo uma mensagem indicando que o nome não está disponível.
 *        
 * 4. **Linha a linha**:
 * - Se `usuario` não for nulo, `Optional.ofNullable(usuario)` cria um `Optional` contendo o `usuario`.
 * - Em seguida, `map(Usuario::getNome)` transforma o `Optional<Usuario>` em `Optional<String>` contendo o nome, se disponível, ou um `Optional` vazio se o nome for nulo.
 * - Finalmente, `ifPresentOrElse(...)` executa o bloco de código apropriado com base na presença ou ausência do valor dentro do `Optional`. Se o nome 
 *   estiver presente, imprime o nome do usuário; caso contrário, imprime "Nome não disponível".
 * 
 * O uso de `Optional` nesse exemplo permite lidar com a possibilidade de valores nulos de maneira mais limpa e expressiva, evitando a necessidade de verificações manuais de nulidade e tornando o código mais conciso.
 * */

