/** As classes a seguir foram copiadas e adaptadas de: 
SANTOS, Rafael. Introdu��o � programa��o orientada a objetos usando JAVA. Rio de Janeiro: Campus, 2003
 *
 *
 *
 * A interface ObjetoGeometrico define que m�todos um objeto geom�trico gen�rico
 * bidimensional deve conter. Esta interface n�o declara nenhum campo.
 */

public interface ObjetoGeometrico {
	/**
   	 * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao centro
   	 * do objeto geom�trico.
   	 * @return uma inst�ncia da classe Ponto2D representando o centro do objeto
   	 *     	geom�trico.
	 * @throws Exception 
   	 */
   	Ponto centro() throws Exception;
 
   	/**
   	 * O m�todo calcula�rea calcula a �rea do objeto geom�trico e retorna a �rea
   	 * como um valor do tipo double.
   	 * @return a �rea deste objeto geom�trico.
   	 */
   	double calcula�rea();
 
   	/**
   	 * O m�todo calculaPer�metro calcula o per�metro do objeto geom�trico e retorna o
   	 * per�metro como um valor do tipo double.
   	 * @return o per�metro deste objeto geom�trico.
   	 */
   	double calculaPer�metro();
   	
   	/**
   	 * O m�todo clona retorna um novo Objeto Geometrico.
   	 * @return uma instancia da classe ObjetoGeometrico.
   	 * @throws Exception 
   	 */
   	ObjetoGeometrico clona() throws Exception;

}
