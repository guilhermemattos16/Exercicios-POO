package tempo;

public class Horario {
	private int hora;
	private int minuto;
	
	/**
	 * Construtor Completo do Horario
	 * @param _hora
	 * @param _minuto
	 * @throws Exception 
	 */
	public Horario(int _hora, int _minuto) throws Exception {
		this.setHora(_hora);
		this.setMinuto(_minuto);
	}
	
	/**
	 * Construtor com minuto vazio
	 * @param _hora
	 * @throws Exception 
	 */
	public Horario(int _hora) throws Exception {
		this.setHora(_hora);
		this.setMinuto(00);
	}

	/**
	 * Construtor com o horario como String
	 * @param _horario
	 * @throws Exception 
	 */
	public Horario(String _horario) throws Exception {
		this.setHorario(_horario);
	}

	/**
	 * Construtor vazio
	 * @throws Exception 
	 */
	public Horario() throws Exception {
		this.setHora(00);
		this.setMinuto(00);
	}
	
	/**
	 * @param _horario the minuto to set
	 * @throws Exception 
	 */
	public void setHorario(String _horario) throws Exception {
		if (_horario.contains(":")) 
		{
			int index = _horario.indexOf(":");
			int tamanho = _horario.length();
			int tamHoras = (_horario.substring(0, index)).length();
			int tamMinutos = tamanho - tamHoras;
			
			this.setHora(Integer.parseInt(_horario.substring(0, index)));
			this.setMinuto(Integer.parseInt(_horario.substring(index + 1, index + tamMinutos)));
		} 
		else {
			throw new Exception("Horário com formato inválido");
		}
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return this.hora;
	}
	
	/**
	 * @param _hora the hora to set
	 * @throws Exception 
	 */
	public void setHora(int _hora) throws Exception {
		if (_hora >= 0 && _hora < 24) {
			this.hora = _hora;
		}
		else {
			throw new Exception("Hora deve estar entre 0 e 23");
		}
		
	}
	
	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return this.minuto;
	}
	
	/**
	 * @param _minuto the minuto to set
	 * @throws Exception 
	 */
	public void setMinuto(int _minuto) throws Exception {
		if (_minuto >= 0 && _minuto < 60) {
			this.minuto = _minuto;
		}
		else {
			throw new Exception("Minutos devem estar entre 0 e 60");
		}
	}
	
	/**
	 * Compara o objeto do chamado com o objeto passado como parametro
	 * @param _horario
	 * @return int
	 */
	public int compareTo(Horario _horario) {
		if (this.getHora() > _horario.getHora())
			return 1;
		else if (this.getHora() < _horario.getHora())
			return -1;
		else {
			if (this.getMinuto() > _horario.getMinuto())
				return 1;
			else if (this.getMinuto() < _horario.getMinuto())
				return -1;
			else
				return 0;
		}
	}
	
	/**
  	 * Método sobreposto equals
	 * @param _aux
	 * @return boolean
	 */
 	public boolean equals(Horario _aux) {
 		if (this.getHora() == _aux.getHora()) {
 			if (this.getMinuto() == _aux.getMinuto()) {	
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getHora());
		builder.append(":");
		builder.append(getMinuto());
		return builder.toString();
	}
}
