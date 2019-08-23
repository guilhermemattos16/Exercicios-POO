
public class Aluno {
  	private String nome;
  	private double nota1, nota2, media, pontos;
  	static final public double DEFAULT_APROVACAO = 7.0;
	static final public double DEFAULT_LIMITE_NOTA = 10.0;
	static private double minimoAprovacao = Aluno.DEFAULT_APROVACAO;
	static private double limite_nota = Aluno.DEFAULT_LIMITE_NOTA;
 
  	// quatro construtores sobrecarregados
  	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) throws Exception {
        	this.setNome(_nome);
        	this.setNotas(_nota1, _nota2, _pontos);
  	}
  	public Aluno(double _nota1, double _nota2, double _pontos) throws Exception  {
        	this("sem nome", _nota1, _nota2, _pontos);
  	}
  	public Aluno(double _nota1, double _nota2) throws Exception  {
        	this(_nota1, _nota2, 0.0);
  	}
  	public Aluno() throws Exception {
        	this(0.0,0.0);
  	}
 
  	// m�todos de interface para acesso aos campos privados
  	public String getNome() {      	
  	  	return this.nome;     
  	}
  	public void setNome(String _nome) {
        	this.nome = _nome; 	
  	}
  	public double getNota1() {
        	return this.nota1; 	
  	}
  	public double getNota2() {
        	return this.nota2; 	
  	}
  	public double getMedia() {
        	return this.media; 	
  	}
  	public double getPontos()  {
        	return this.pontos;	
  	}
  	public void setPontos(double _pontos) {
        	this.pontos = _pontos;
        	this.calculaMedia(10);
  	}
  	
 // m�todos est�ticos de interface para o campo est�tico minimoAprovacao
 	public static double getMinimoAprovacao() {
 		return Aluno.minimoAprovacao;
 	}

 	public static void setMinimoAprovacao(double _minimoAprovacao) {
 		Aluno.minimoAprovacao = _minimoAprovacao;
 	} 
 	
 	public static double getLimiteNota() {
 		return limite_nota;
 	}

 	public static void setLimiteNota(double limite_nota) {
 		Aluno.limite_nota = limite_nota;
 	}
 
  	// tratamento de erro ainda inadequado, ser� melhorado mais adiante
  	public void setNotas(double _nota1, double _nota2, double _pontos) throws Exception {
        	this.pontos = _pontos;
        	if(_nota1>=0 && Aluno.isNotaValida(_nota1) && _nota2>=0 && Aluno.isNotaValida(_nota2)) {
              	this.nota1 = _nota1;
              	this.nota2 = _nota2;
              	this.calculaMedia();
        	}
        	else
        		throw new Exception("nota invalida");
  	}
 
  	public void setNotas(double _nota1, double _nota2) throws Exception {
        	this.setNotas(_nota1, _nota2, 0);
  	}
 

  	// m�todo para calcular a m�dia. Privado pois o uso � apenas interno a classe
  	private double calculaMedia() {
        	this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
        	return this.media;
  	}
 
  	// sobrecarregamento do c�lculo da m�dia para limitar o valor m�ximo
  	private double calculaMedia(int _limite) {
        	this.calculaMedia();
        	if(this.media > _limite)
              	this.media = _limite;
        	return this.media;
  	}
 
  	// n�o � adequado que o m�todo toString exiba mensagens, pois
  	// � comum considerar que o programador de classes n�o conhece o usu�rio final
    	// Evita-se tamb�m textos retornados, escritos em uma determinada l�ngua. 
  	public String toString(){
        	return this.getNome()+";"
        	+this.getNota1()+";"
        	+this.getNota2()+";"
        	+this.getPontos()+";"
        	+this.getMedia();
  	}
  	
  	private static boolean isNotaValida (double _nota) {
  		if (_nota > limite_nota) {
  			return false;
  		}
  		
  		return true;
  	}
}

