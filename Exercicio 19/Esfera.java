
public class Esfera implements ObjetoTridimensional {
	/**
   	 * Declara��o dos campos da classe
   	 */
   	private Ponto3D centro;
   	private double raio;

	/**
   	 * O construtor para a classe Esfera, que recebe argumentos para
   	 * inicializar todos os campos da classe. Este � o construtor "completo".
   	 * @param centro o centro da esfera (uma inst�ncia da classe Ponto3D)
   	 * @param raio o raio do c�rculo
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
   	 * O m�todo centro retorna o ponto em tres dimens�es que corresponde ao centro da
   	 * esfera. Neste caso, basta retornar a inst�ncia da classe Ponto3D que representa
   	 * o pr�prio centro.
   	 * @return uma inst�ncia da classe Ponto3D representando o centro da esfera
   	 */
	@Override
	public Ponto3D centro() {
		return this.centro;
	}

	/**
   	 * O m�todo calculaSuperficie calcula a area da superficia da esfera e retorna a superficie
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
   	 * O m�todo calculaVolume calcula o volume da esfera e retorna o volume como um valor do
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
   	 * O m�todo toString retorna os valores dos campos da esfera formatados em uma
   	 * string.
   	 * @return uma string contendo uma representa��o dos campos da esfera
   	 */

	@Override
	public String toString() {
		// Retorna diretamente uma string criada com os valores dos campos. O m�todo
     	// toString da classe Ponto3D � chamado implicitamente.
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
