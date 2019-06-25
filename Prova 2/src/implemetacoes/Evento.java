package implemetacoes;

import tempo.Data;
import tempo.Horario;
import tempo.Periodo;

public class Evento extends ItemAgenda {
	private String local;

	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _dataI
	 * @param _horaI
	 * @param _dataF
	 * @param _horaF
	 * @param _local
	 * @throws Exception 
	 */
	public Evento(String _titulo, String _descricao, Data _dataI, Horario _horaI, Data _dataF, Horario _horaF,
			String _local) throws Exception {
		super(_titulo, _descricao, _dataI, _horaI, _dataF, _horaF);
		this.setLocal(_local);
	}

	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 * @param _local
	 */
	public Evento(String _titulo, String _descricao, Periodo _periodo, String _local) {
		super(_titulo, _descricao, _periodo);
		this.setLocal(_local);
	}

	/**
	 * @return the local
	 */
	public String getLocal() {
		return this.local;
	}

	/**
	 * @param _local the local to set
	 */
	public void setLocal(String _local) {
		this.local = _local;
	}
	

	/**
  	 * Método sobreposto equals para a classe Evento
	 * @param _aux
	 * @return boolean
	 */
 	public boolean equals(Evento _aux) {
 		if (this.getLocal() == _aux.getLocal()) {
 			return true;
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
	public int compareTo(Evento _aux) {
		if (this.getLocal().length() ==_aux.getLocal().length()) {
			return 0;
		}
		if (this.getLocal().length() > _aux.getLocal().length()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento: ");
		builder.append(super.toString());
		builder.append("\n ");
		builder.append(getLocal());
		return builder.toString();
	}
}
