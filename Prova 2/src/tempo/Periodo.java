package tempo;

public class Periodo {
	Data dataI; // Data inicial
	Horario horaI; // Horario Inicial
	Data dataF; // Data final
	Horario horaF; // Horario Final
	
	/**
	 * @param dataI
	 * @param horaI
	 * @param dataF
	 * @param horaF
	 * @throws Exception 
	 */
	public Periodo(Data _dataI, Horario _horaI, Data _dataF, Horario _horaF) throws Exception {
		this.setDataI(_dataI);
		this.setHoraI(_horaI);
		this.setDataF(_dataF);
		this.setHoraF(_horaF);
	}
	
	/**
	 * @return the dataI
	 */
	public Data getDataI() {
		return this.dataI;
	}
	/**
	 * @param _dataI the dataI to set
	 */
	public void setDataI(Data _dataI) {
		this.dataI = _dataI;
	}
	/**
	 * @return the horaI
	 */
	public Horario getHoraI() {
		return this.horaI;
	}
	/**
	 * @param _horaI the horaI to set
	 */
	public void setHoraI(Horario _horaI) {
		this.horaI = _horaI;
	}
	/**
	 * @return the dataF
	 */
	public Data getDataF() {
		return this.dataF;
	}
	/**
	 * @param _dataF the dataF to set
	 * @throws Exception 
	 */
	public void setDataF(Data _dataF) throws Exception {
		if(_dataF.compareTo(this.getDataI()) == 1) {
			this.dataF = _dataF;
		}
		else {
			throw new Exception("Data Final deve ser maior ou igual a data inicial");
		}
	}
	/**
	 * @return the horaF
	 */
	public Horario getHoraF() {
		return this.horaF;
	}
	/**
	 * @param _horaF the horaF to set
	 */
	public void setHoraF(Horario _horaF) {
		this.horaF = _horaF;
	}
	

	/**
	 * Compara o objeto do chamado com o objeto passado como parametro
	 * @param _aux
	 * @return int
	 */
	public int compareTo(Periodo _aux) {
		if (this.getDataI().compareTo(_aux.getDataI()) == 0) {
			if (this.getDataF().compareTo(_aux.getDataF()) == 0) {
				return 0;
			}
		}
		else if (this.getDataI().compareTo(_aux.getDataI()) == 1) {
			if (this.getDataF().compareTo(_aux.getDataF()) == 1) {
				return 1;
			}
		}
		return -1;
	}
	
	/**
  	 * Método sobreposto equals
	 * @param _aux
	 * @return boolean
	 */
 	public boolean equals(Periodo _aux) {
 		if (this.getDataI() == _aux.getDataI()) {
 			if (this.getDataF() == _aux.getDataF()) {	
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
		builder.append("Inicio = ");
		builder.append(getDataI());
		builder.append(" ");
		builder.append(getHoraI());
		builder.append(", Fim = ");
		builder.append(getDataF());
		builder.append(" ");
		builder.append(getHoraF());
		return builder.toString();
	}

	public int isIntervalo(Periodo _periodo) {
		if ((this.getDataI().compareTo(_periodo.getDataI()) == 1 || this.getDataI().compareTo(_periodo.getDataI()) == 0) && (this.getDataF().compareTo(_periodo.getDataF()) == -1 || this.getDataF().compareTo(_periodo.getDataF()) == 0))
			return 1;
		else {
			return 0;
		}
	}
}
