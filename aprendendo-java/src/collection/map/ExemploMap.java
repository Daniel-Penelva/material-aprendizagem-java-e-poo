package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import basico.Foreach;

public class ExemploMap {
	public static void main(String[] args) {
		// Criando um mapa
		Map<String, Integer> mapa = new HashMap<>();

		// Adicionando elementos
		mapa.put("Maçã", 3);
		mapa.put("Banana", 5);
		mapa.put("Pêra", 2);

		// Acessando elementos
		System.out.println("Imprimindo lista de frutas");
		System.out.println(mapa);
		
		// Acessando e imprimindo elementos usando for tradicional
        System.out.println("\n" + "Elementos do mapa usando for tradicional:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        
     // Acessando e imprimindo elementos usando forEach
        System.out.println("\n" + "Elementos do mapa usando forEach:");
        mapa.forEach((chave, valor) -> {
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        });
		

		// Acessando quantidade de elementos
		System.out.println("\n" + "Quantidade de Maçãs: " + mapa.get("Maçã"));

		// Removendo elemento
		mapa.remove("Banana");
		System.out.println("Elementos após remover 'Banana': " + mapa);
		
		/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		Map<String, String> linguagemProgramacao = new HashMap<>();
		
		linguagemProgramacao.put("JAVA", "definição Java");
		linguagemProgramacao.put("Javascript", "definição Javascript");
		linguagemProgramacao.put("PHP", "definição php");
		linguagemProgramacao.put("Android", "definição Android");
		
		//A chave tem que ser inscrito igual (case sensitive)
		System.out.println(linguagemProgramacao.get("JAVA"));
		System.out.println(linguagemProgramacao.get("PHP"));
		
		System.out.println("\n" + "Exemplo 2 " + "\n");
		
		Set<String> chaves = linguagemProgramacao.keySet();
		
		for(String c:chaves){
			System.out.println(c + ": " + linguagemProgramacao.get(c));
		}
	}
}
