
public class Paralelepipedo implements ObjetoTridimensional {
	Ponto3D pontoA, pontoB;
	
	/**
	 * @param a
	 * @param b
	 */
	public Paralelepipedo(Ponto3D _pontoA, Ponto3D _pontoB) {
		this.pontoA = _pontoA;
		this.pontoB = _pontoB;
	}

	/**
	 * @return the a
	 */
	public Ponto3D getPontoA() {
		return this.pontoA;
	}

	/**
	 * @param a the a to set
	 */
	public void setPontoA(Ponto3D _pontoA) {
		this.pontoA = _pontoA;
	}

	/**
	 * @return the b
	 */
	public Ponto3D getPontoB() {
		return this.pontoB;
	}

	/**
	 * @param b the b to set
	 */
	public void setPontoB(Ponto3D _pontoB) {
		this.pontoB = _pontoB;
	}

	/**
   	 * O método centro retorna o ponto em tres dimensões que corresponde ao centro do
   	 * do paralelepido. 
   	 * @return uma instância da classe Ponto3D representando o centro do paralelepipedo
	 * @throws Exception 
   	 */
	@Override
	public Ponto3D centro() throws Exception {
		Ponto3D centro = new Ponto3D();
		return centro;
	}
	
	public double getA() {
		double ladoA;
		
		ladoA = this.getPontoA().getX() - this.getPontoB().getX();
		
		return ladoA;
	}
	
	public double getB() {
		double ladoB;
		
		ladoB = this.getPontoA().getY() - this.getPontoB().getY();
		
		return ladoB;
	}
	
	public double getC() {
		double ladoC;
		
		ladoC = this.getPontoA().getZ() - this.getPontoB().getZ();
		
		return ladoC;
	}
	
	/**
   	 * O método calculaSuperficie calcula a area da superficia da esfera e retorna a superficie
   	 * como um valor do tipo double.
   	 * @return a area da superficie desta esfera
   	 */
	@Override
	public double calculaSuperficie() {
		double a = this.getA(); 
		double b = this.getB();
		double c = this.getC();
		double area = 0;
		
		area = 2 * (a*b + b*c + a*c);
		
		return area;
	}
	
	/**
   	 * O método calculaVolume calcula o volume da esfera e retorna o volume como um valor do
   	 * tipo double.
   	 * @return o volume desta esfera
   	 */
	@Override
	public double calculaVolume() {
		double volume = 0;
		
		volume = this.getA() * this.getB() * this.getC();
		
		return volume;
	}

}
