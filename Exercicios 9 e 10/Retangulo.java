
public class Retangulo {
	private Ponto esqSup, dirInf;

	// construtores
	public Retangulo() throws Exception {
		this(new Ponto(), new Ponto());
	}

	public Retangulo(double _x1, double _y1, double _x2, double _y2) throws Exception { 
		this.setEsqSup(new Ponto(_x1, _y1));
		this.setDirInf(new Ponto(_x2, _y2));
	}

	public Retangulo(Ponto _esqSup, Ponto _dirInf) throws Exception {
		this.setEsqSup(_esqSup);
		this.setDirInf(_dirInf);
	}
	
	public Ponto getEsqSup() {
		return this.esqSup;
	}

	public void setEsqSup(Ponto _esqSup) {
		this.esqSup = _esqSup;
	}

	public Ponto getDirInf() {
		return this.dirInf;
	}

	public void setDirInf(Ponto _dirInf) {
		this.dirInf = _dirInf;
	}
	
	public double ladoX() {
		double comprimento = 0;
		
		comprimento = this.getDirInf().getX() - this.getEsqSup().getX();
		
		return comprimento;
	}
	
	public double ladoY() {
		double largura = 0;
		
		largura = this.getEsqSup().getY() - this.getDirInf().getY();
		
		return largura;
	}
	
	public double calculaArea() {
		double area = 0;
		
		area = this.ladoX() * this.ladoY();
		
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro = 0;
		
		perimetro = (this.ladoX() * 2) + (this.ladoY() * 2);
		
		return perimetro;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(esqSup);
		dados.append(" - ");
		dados.append(dirInf);
		return dados.toString();
	}

	public boolean equals(Retangulo _aux) {
		if ((this.getEsqSup().equals(_aux.getEsqSup())) && (this.getDirInf().equals(_aux.getDirInf()))) {
			return true;
		}
		return false;
	}
	
	public boolean equalsArea (Retangulo _aux) {
		if (this.calculaArea() == _aux.calculaArea()) {
			return true;
		}
		return false;
	}
	
	public int compareTo(Retangulo _aux) {
		if (this.calculaArea() > _aux.calculaArea()) {
			return -1;
		} 
		else if (this.calculaArea() == _aux.calculaArea()) {
			return 0;
		} 
		else {
			return 1;
		}
	}

}
