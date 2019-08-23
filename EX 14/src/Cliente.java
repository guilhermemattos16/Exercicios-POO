
public class Cliente {
	private String celular;
	private String endereco;
	private double rendaFamiliar;
	static final public double DEFAULT_RENDA = 2000;
	static private double renda = Cliente.DEFAULT_RENDA;
	private Contato contato;
	
	public Cliente(Contato _contato, String _celular, String _endereco, double _rendaFamiliar) throws Exception {
		this.setContato(_contato);
		this.setCelular(_celular);
		this.setEndereco(_endereco);
		this.setRendaFamiliar(_rendaFamiliar);
	}
	
	public Cliente() throws Exception {
		this.setContato(new Contato());
		this.setCelular("");
		this.setEndereco("");
		this.setRendaFamiliar(0);
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String _celular) {
		this.celular = _celular;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String _endereco) {
		this.endereco = _endereco;
	}

	public static double getRenda() {
		return Cliente.renda;
	}

	public static void setRenda(double _renda) {
		Cliente.renda = _renda;
	}

	public double getRendaFamiliar() {
		return this.rendaFamiliar;
	}

	public void setRendaFamiliar(double _rendaFamiliar) {
		this.rendaFamiliar = _rendaFamiliar;
	}
	
	public String categoria() {
		if (this.getRendaFamiliar() > Cliente.getRenda()) {
			return "top";
		}
		else {
			return "usual";
		}
	}
	
	public static String categoria(double rendaFamiliar) {
		if (rendaFamiliar > Cliente.getRenda()) {
			return "top";
		}
		else {
			return "usual";
		}
	}

	public Contato getContato() {
		return this.contato;
	}

	public void setContato(Contato _contato) {
		this.contato = _contato;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [getCelular()=");
		builder.append(getCelular());
		builder.append(", getEndereco()=");
		builder.append(getEndereco());
		builder.append(", getRendaFamiliar()=");
		builder.append(getRendaFamiliar());
		builder.append(", getCategoria()=");
		builder.append(this.categoria());
		builder.append(", getContato()=");
		builder.append(getContato());
		builder.append("]");
		return builder.toString();
	}
	 
}
