package operador.referencia.de.metodo.exemplo1;

public class Exemplo2ReferenciaMetodo {

	public static void main(String[] args) {

		// Criando uma instância da classe Impressora
		Impressora minhaImpressora = new Impressora();

		//Mensagem mensagem = texto -> minhaImpressora.imprimir(texto); // Exemplificando se usasse uma expressão lambda para implementar a interface funcional
		
		// Usando referência a método de instância
		//Operador de referência - São três etapas:
		//1º - o Tipo | 2º o operador de referência :: | 3º o nome do método que quer chamar sem os parênteses 
		Mensagem mensagem = minhaImpressora::imprimir;
	
		
		mensagem.mostrarMensagem("Olá, mundo!");

	}

}

//Interface funcional com um método
interface Mensagem {
	void mostrarMensagem(String texto);
}

//Classe com método de instância
class Impressora {
	void imprimir(String texto) {
		System.out.println(texto);
	}
}
