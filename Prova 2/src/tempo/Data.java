package tempo;

public class Data 
{
  	private int dia, mes, ano;
  	
  	/**
	 * Construtor com data vazia
	 */
  	public Data(){
  		this.dia = 1;
  		this.mes = 1;
  		this.ano = 1900;
  	}
  	
  	
  	/**
  	 * Construtor somente com o mes e ano.
	 * @param _mes
	 * @param _ano
	 * @throws Exception 
	 */
  	public Data(int _mes, int _ano) throws Exception {
  		this.setData(1, _mes, _ano);
  	}
  	
  	/**
  	 * Construtor com data completa
  	 * @param _dia
	 * @param _mes
	 * @param _ano
	 * @throws Exception 
	 */
  	public Data(int _dia, int _mes, int _ano) throws Exception {
  		this.setData(_dia, _mes, _ano);
  	}
  	
  	/**
  	 * Construtor com mes em String
	 * @param _dia
	 * @param _mes
	 * @param _ano
	 * @throws Exception 
	 */
  	public Data(int _dia, String _mes, int _ano) throws Exception {
  		this.setData(_dia, this.setMes(_mes) , _ano);
		
	}
  	
  	/**
  	 * Construtor com Data completa em string
	 * @param data
	 * @throws Exception 
	 */
	public Data(String data) throws Exception
	{
		setDataString(data);
	}

	/**
	 * @param _dia
	 * @param _mes
	 * @param _ano
	 * @throws Exception 
	 */
  	public void setData(int _dia,int _mes,int _ano) throws Exception
  	{
  		if(!Data.isDataValida(_dia, _mes, _ano)) 
    	{
  			throw new Exception("Data invalida");
		}
  		else
  		{
  			this.dia = _dia;
  			this.mes = _mes;
  			this.ano = _ano;
  		}
    	
	}
  	
  	/**
	 * @param data
	 * @throws Exception 
	 */
  	public void setDataString(String data) throws Exception
  	{	
		//Confere se a string possui o tamanho correto para ser do tipo d/m/aaaa ou dd/mm/aaaa
		if(data.length() >= 8 || data.length() <= 10) 
		{
			//Confere a localizacao do caracter / para saber se e do tipo d/ ou dd/
			if((data.indexOf("/") == 1)) 
			{
				this.dia = Integer.parseInt(data.substring(0,1));
				
				//Confere a localizacao do caracter / para saber se e do tipo m/ ou mm/
				if(data.indexOf("/",2) == 3) 
				{
					this.mes = Integer.parseInt(data.substring(2,3));
					this.ano = Integer.parseInt(data.substring(4, 8));
				} 
				
				else if(data.indexOf("/",2) == 4) 
				{
					this.mes = Integer.parseInt(data.substring(2,4));
					this.ano = Integer.parseInt(data.substring(5, 9));
				}
			} 
			
			else if(data.indexOf("/") == 2)
			{
				this.dia = Integer.parseInt(data.substring(0,2));
				
				//Confere a localizacao do caracter / para saber se e do tipo m/ ou mm/
				if(data.indexOf("/",3) == 4) 
				{
					this.mes = Integer.parseInt(data.substring(3,4));
					this.ano = Integer.parseInt(data.substring(5,9));
				} 
				
				else if(data.indexOf("/",3) == 5) 
				{
					this.mes = Integer.parseInt(data.substring(3,5));
					this.ano = Integer.parseInt(data.substring(6,10));
				}
			} 
		}
		if(!Data.isDataValida(this.dia, this.mes, this.ano)) 
		{
			throw new Exception("Data invalida");
		}
  	}
			
  	/**
	 * @param _mes
	 */
  	public int setMes(String _mes) {
		_mes = _mes.toLowerCase();
		
	  	if(_mes.equals("janeiro")) 
	  		return 1;
	  	if(_mes.equals("fevereiro")) 
	  		return 2;
	  	if(_mes.equals("março")) 
	  		return 3;
	  	if(_mes.equals("abril")) 
	  		return 4;
	  	if(_mes.equals("maio")) 
	  		return 5;
	  	if(_mes.equals("junho")) 
	  		return 6;
	  	if(_mes.equals("julho")) 
	  		return 7;
	  	if(_mes.equals("agosto")) 
	  		return 8;
	  	if(_mes.equals("setembro")) 
	  		return 9;
	  	if(_mes.equals("outubro")) 
	  		return 10;
	  	if(_mes.equals("novembro")) 
	  		return 11;
	  	if(_mes.equals("dezembro")) 
	  		return 12;
	  	else 
	  		return 0;
	}
  	
	/**
	 * @return the data
	 */
  	public Data getData()
  	{
  		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
  		return this;
  	}
  	
	/**
	 * @return the dia
	 */
  	public int getDia() {
		return this.dia;
	}

  	/**
	 * @param _dia
	 */
	public void setDia(int _dia) {
		this.dia = _dia;
	}


	/**
	 * @return the mes
	 */
	public int getMes() {
		return this.mes;
	}

	/**
	 * @param _mes
	 */
	public void setMes(int _mes) {
		this.mes = _mes;
	}


	/**
	 * @return the ano
	 */
	public int getAno() {
		return this.ano;
	}

	/**
	 * @param _ano
	 */
	public void setAno(int _ano) {
		this.ano = _ano;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
        StringBuilder dados = new StringBuilder();
    	dados.append(this.getDia());
        dados.append("/");
    	dados.append(this.getMes());
    	dados.append("/");
    	dados.append(this.getAno());
    	return dados.toString();
    }
  	
	/**
  	 * Metodo para verificar se o ano é bissexto
	 * @param _ano
	 * @return boolean
	 */
  	public static boolean isBissexto(int _ano) 
  	{
  		if (_ano > 1582) 
  		{
  			if(((_ano % 4) == 0) && ((_ano % 100) != 0)) 
  			{
  				return true;
  			}
  			else 
  			{
  				return false;
  			}
  		}
  		else 
  		{
  			return false;
  		}
  	}
  
  	/**
  	 * Metodo para verificar se a data é valida
	 * @param _dia
	 * @param _mes
	 * @param _ano
	 * @return boolean
	 */
  	public static boolean isDataValida(int _dia, int _mes, int _ano) 
  	{
	  	if (_ano >= 1900)
	  	{
  			if ((_mes <= 12) && (_dia <= 31) && (_dia > 0) && (_mes > 0)) 
  			{
	  			if (_mes == 2) 
	  			{
	  				if ((Data.isBissexto(_ano)) && (_dia <= 29)) 
	  				{
	  					return true;
	  				}
	  				else if (_dia <= 28) 
	  				{
	  					return true;
	  				}
	  			}
	  			else if ((_mes == 4) || (_mes == 6) || (_mes == 9) || (_mes == 11)) 
	  			{
	  				if (_dia < 30) 
	  				{
	  					return true;
	  				}
	  				else 
	  				{
	  					return false;
	  				}
	  			}
	  			else 
	  			{
	  				return true;
	  			}
  			}
	  	}
	  	
  		return false;
  		
  	}
  	
  	/**
  	 * Metodo para incrementar um dia a data
	 */
  	public void incrementa() {	
		try{
			this.setData(getDia()+1,getMes(),getAno());
		}
		catch(Exception dia){
			try{
				this.setData(1,getMes()+1,getAno());
			}
			catch(Exception mes){
				try {
					this.setData(1,1,getAno()+1);
				}
				catch(Exception ano) {
				}
			}
		}
	}
  	
  	/**
  	 * Metodo para receber a quantidade de dias a ser incrementado
	 * @param dias
	 * @return Data
	 */
  	public Data incrementa(int dias) {
  		int i = 0;
  		
  		for(i = 0; i < dias; i++) {
  			this.incrementa();
  		}
  		
  		return this;
  	}
  	
  	/**
  	 * Método sobreposto equals
	 * @param _aux
	 * @return boolean
	 */
 	public boolean equals(Data _aux) {
 		if (this.getAno() == _aux.getAno()) {
 			if (this.getMes() == _aux.getMes()) {	
 				if (this.getDia() == _aux.getDia()) {	
 	 				return true;
 	 			}
 				else {
 	 				return false;
 	 			}
 			}
 			else {
 				return false;
 			}
 		}
 		else {
 			return false;
 		}
 	}
 	
 	/**
	 * Compara o objeto do chamado com o objeto passado como parametro
	 * @param _aux
	 * @return int
	 */
	public int compareTo(Data _aux) {
		if (this.getAno() > _aux.getAno())
			return 1;
		else if (this.getMes() < _aux.getMes())
			return -1;
		else {
			if (this.getDia() > _aux.getDia())
				return 1;
			else if (this.getDia() < _aux.getDia())
				return -1;
			else
				return 0;
		}
	}
	
}

