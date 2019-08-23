
public class RetanguloEscalavel implements Escalavel, ObjetoGeometrico {
	/**
   	 * Declaração dos campos da classe
   	 */
   	private Ponto esqSup, dirInf;
 
   	public RetanguloEscalavel() throws Exception {
		this(new Ponto(), new Ponto());
	}

	public RetanguloEscalavel(double _x1, double _y1, double _x2, double _y2) throws Exception { 
		this.setEsqSup(new Ponto(_x1, _y1));
		this.setDirInf(new Ponto(_x2, _y2));
	}

	public RetanguloEscalavel(Ponto _esqSup, Ponto _dirInf) throws Exception {
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

	@Override
	public Ponto centro() throws Exception {
		Ponto centro = new Ponto(this.ladoX()/2, this.ladoY()/2);
		
		return centro;
	}

	@Override
	public double calculaÁrea() {
		double area = 0;
		
		area = this.ladoX() * this.ladoY();
		
		return area;
	}

	@Override
	public double calculaPerímetro() {
		double perimetro = 0;
		
		perimetro = (this.ladoX() * 2) + (this.ladoY() * 2);
		
		return perimetro;
	}

	@Override
	public void amplia(double _escala) throws Exception {
		try {
			double esqX, esqY;
			double dirX, dirY;
			Ponto esq, dir;
			
			esqX = this.getEsqSup().getX() * _escala;
			esqY = this.getEsqSup().getY() * _escala;
			esq = new Ponto(esqX, esqY);
			
			dirX = this.getDirInf().getX() * _escala;
			dirY = this.getDirInf().getY() * _escala;
			dir = new Ponto(dirX, dirY);
			
			this.setDirInf(dir);
			this.setEsqSup(esq);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void espelha() throws Exception {
		try {
			this.setDirInf(new Ponto(getDirInf().getX(), -getDirInf().getY()));
			this.setEsqSup(new Ponto(getEsqSup().getX(), -getEsqSup().getY()));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public ObjetoGeometrico clona() throws Exception {
		RetanguloEscalavel clone;
		
		clone = new RetanguloEscalavel(this.getEsqSup(), this.getDirInf());
		
		return clone;
	}

}
