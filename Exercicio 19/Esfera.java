
public class Esfera implements ObjetoTridimensional {
	/**
   	 * Declaração dos campos da classe
   	 */
   	private Ponto3D centro;
   	private double raio;

	/**
   	 * O construtor para a classe Esfera, que recebe argumentos para
   	 * inicializar todos os campos da classe. Este é o construtor "completo".
   	 * @param centro o centro da esfera (uma instância da classe Ponto3D)
   	 * @param raio o raio do círculo
   	 */
   	public Esfera(Ponto3D _centro, double _raio) {
		this.setCentro(_centro);
		this.setRaio(_raio);
	}
   	
	public Ponto3D getCentro() {
		return this.centro;
	}

	public void setCentro(Ponto3D _centro) {
		this.centro = _centro;
	}

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double _raio) {
		this.raio = _raio;
	}
	
	/**
   	 * O método centro retorna o ponto em tres dimensões que corresponde ao centro da
   	 * esfera. Neste caso, basta retornar a instância da classe Ponto3D que representa
   	 * o próprio centro.
   	 * @return uma instância da classe Ponto3D representando o centro da esfera
   	 */
	@Override
	public Ponto3D centro() {
		return this.centro;
	}

	/**
   	 * O método calculaSuperficie calcula a area da superficia da esfera e retorna a superficie
   	 * como um valor do tipo double.
   	 * @return a area da superficie desta esfera
   	 */
	@Override
	public double calculaSuperficie() {
		double area = 0; 
		double r = Math.pow(this.getRaio(), 2); // Calcula o raio ao quadrado
		
		area = 4 * r; // Calcula a area da superficie da esfera
		
		return area;
	}

	/**
   	 * O método calculaVolume calcula o volume da esfera e retorna o volume como um valor do
   	 * tipo double.
   	 * @return o volume desta esfera
   	 */
	@Override
	public double calculaVolume() {
		double vol = 0; 
		double r = Math.pow(this.getRaio(), 3); // Calcula o raio ao cubo
		
		vol = 4 / (3*r); // Calcula o volume da esfera
		
		return vol;
	}
   	/**
   	 * O método toString retorna os valores dos campos da esfera formatados em uma
   	 * string.
   	 * @return uma string contendo uma representação dos campos da esfera
   	 */

	@Override
	public String toString() {
		// Retorna diretamente uma string criada com os valores dos campos. O método
     	// toString da classe Ponto3D é chamado implicitamente.
		StringBuilder builder = new StringBuilder();
		builder.append("Centro: ");
		builder.append(getCentro());
		builder.append("\nRaio: ");
		builder.append(getRaio());
		builder.append("\nSuperficie: ");
		builder.append(calculaSuperficie());
		builder.append("\nVolume: ");
		builder.append(calculaVolume());
		return builder.toString();
	}
	
}
