
public class Coordenada {
	private double valor;
	
	public Coordenada() {
		this(0);
	}

	public Coordenada(double _valor) {
		this.setValor(_valor);
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double _valor) {
		this.valor = _valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getValor());
		return builder.toString();
	}
}
