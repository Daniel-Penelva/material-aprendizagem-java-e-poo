package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProgramaPrincipalContaSerializacao {

	public void armazenarContas(ArrayList<ContaSerializacao> contas) throws IOException {
		
		try (FileOutputStream fos = new FileOutputStream("C://Users//d4nan//Documents//gerando arquivo/teste.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas); // escrita do objeto
			}
		}
	}

	public ArrayList<ContaSerializacao> recuperarContas() throws IOException, ClassNotFoundException {
		
		try (FileInputStream fis = new FileInputStream("C://Users//d4nan//Documents//gerando arquivo/teste.ser")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				return (ArrayList<ContaSerializacao>) ois.readObject(); // leitura do objeto
			}
		}
	}

	public static void main(String[] args) throws Exception, ClassNotFoundException {

		ArrayList<ContaSerializacao> contas = new ArrayList<>();

		contas.add(new ContaSerializacao("Daniel", 12000.23));
		contas.add(new ContaSerializacao("Carlos", 2000.90));
		contas.add(new ContaSerializacao("Maria", 32000.90));
		contas.add(new ContaSerializacao("Caio", 92000.40));

		System.out.println("\n Quebra de linha \n ");
		
		ProgramaPrincipalContaSerializacao operacao = new ProgramaPrincipalContaSerializacao();
		operacao.armazenarContas(contas);

		ArrayList<ContaSerializacao> contas1 = operacao.recuperarContas();
		
		for (ContaSerializacao conta : contas1) {
			conta.exibeSaldo();
		}
	}
}