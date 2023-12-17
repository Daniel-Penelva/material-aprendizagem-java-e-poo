package classeDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	private String nome;
	private Date data;

	public Pessoa(String nome, Date data) {
		super();
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	// Método específico para formatar a Data
	public String getFormatarData() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(data);
	}

}
