
public class Pessoa {
	private Data dtNasc;
	private String nome;
	private String id;
	
	public Pessoa () {
		
	}

	public Pessoa (String _nome, Data _dtNasc, String _id) {
		this.nome = _nome; 
		this.dtNasc = _dtNasc; 
		this.id = _id;
	}
	
	public Pessoa (String _nome, int diaNasc, int mesNasc, int anoNasc, String _id) throws Exception {
		this.nome = _nome;
		this.dtNasc = new Data(diaNasc, mesNasc, anoNasc);
		this.id = _id;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	public void setData(Data _dtNasc) {
		this.dtNasc = _dtNasc;
	}
	
	public void setId(String _id) {
		this.id = _id;
	}

	public Data getData() {
		return dtNasc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getId() {
		return id;
	}
	
	public String toString ()
	{
		StringBuilder info = new StringBuilder();
		info.append("Nome: ").append(this.nome);
		info.append("\nData Nascimento: ").append(this.dtNasc);
		info.append("\nIdentidade: ").append(this.id);
		return info.toString();
	}
	
	
}
