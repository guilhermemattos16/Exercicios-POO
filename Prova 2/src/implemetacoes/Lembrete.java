package implemetacoes;

import tempo.Data;
import tempo.Horario;
import tempo.Periodo;

public class Lembrete extends ItemAgenda {
	private int aviso;

	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 * @param _aviso
	 */
	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _aviso) {
		super(_titulo, _descricao, _periodo);
		this.setAviso(_aviso);
	}

	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _dataI
	 * @param _horaI
	 * @param _dataF
	 * @param _horaF
	 * @param _aviso
	 * @throws Exception 
	 */
	public Lembrete(String _titulo, String _descricao, Data _dataI, Horario _horaI, Data _dataF, Horario _horaF,
			int _aviso) throws Exception {
		super(_titulo, _descricao, _dataI, _horaI, _dataF, _horaF);
		this.setAviso(_aviso);
	}

	/**
	 * @return the aviso
	 */
	public int getAviso() {
		return this.aviso;
	}

	/**
	 * @param _aviso the aviso to set
	 */
	public void setAviso(int _aviso) {
		this.aviso = _aviso;
	}
	
	/**
  	 * Método sobreposto equals
	 * @param _aux
	 * @return boolean
	 */
 	public boolean equals(Lembrete _aux) {
 		if (this.getAviso() == _aux.getAviso()) {
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
	public int compareTo(Lembrete _aux) {
		if (this.getAviso() ==_aux.getAviso()) {
			return 0;
		}
		if (this.getAviso() > _aux.getAviso()) {
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
		builder.append("Lembrete: ");
		builder.append(super.toString());
		builder.append("\n");
		builder.append(getAviso());
		builder.append(" min antes");
		return builder.toString();
	}
}
