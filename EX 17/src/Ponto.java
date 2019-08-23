
public class Ponto extends Coordenada {

	private Coordenada x, y;
	
	public Ponto() {
		this(0,0);
	}
	
	public Ponto(Coordenada _x, Coordenada _y) {
		this.setX(_x);
		this.setY(_y);
	}

	public Ponto(double _x, double _y) {
		// TODO Auto-generated constructor stub
		this(new Coordenada(_x), new Coordenada (_y));
	}

	public Ponto(Coordenada _x, double _y) {
		// TODO Auto-generated constructor stub
		this(_x, new Coordenada (_y));
	}
	
	public Ponto(double _x, Coordenada _y) {
		// TODO Auto-generated constructor stub
		this(new Coordenada(_x), _y);
	}

	public Coordenada getX() {
		return this.x;
	}

	public void setX(Coordenada _x) {
		this.x = _x;
	}

	public Coordenada getY() {
		return this.y;
	}

	public void setY(Coordenada _y) {
		this.y = _y;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(");
		builder.append(getX());
		builder.append(", ");
		builder.append(getY());
		builder.append(")");
		return builder.toString();
	}
	
	

}
