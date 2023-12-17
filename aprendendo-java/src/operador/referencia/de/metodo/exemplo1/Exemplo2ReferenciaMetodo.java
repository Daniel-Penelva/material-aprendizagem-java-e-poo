package operador.referencia.de.metodo.exemplo1;

public class Exemplo2ReferenciaMetodo {

	public static void main(String[] args) {

		// Criando uma inst�ncia da classe Impressora
		Impressora minhaImpressora = new Impressora();

		//Mensagem mensagem = texto -> minhaImpressora.imprimir(texto); // Exemplificando se usasse uma express�o lambda para implementar a interface funcional
		
		// Usando refer�ncia a m�todo de inst�ncia
		//Operador de refer�ncia - S�o tr�s etapas:
		//1� - o Tipo | 2� o operador de refer�ncia :: | 3� o nome do m�todo que quer chamar sem os par�nteses 
		Mensagem mensagem = minhaImpressora::imprimir;
	
		
		mensagem.mostrarMensagem("Ol�, mundo!");

	}

}

//Interface funcional com um m�todo
interface Mensagem {
	void mostrarMensagem(String texto);
}

//Classe com m�todo de inst�ncia
class Impressora {
	void imprimir(String texto) {
		System.out.println(texto);
	}
}
