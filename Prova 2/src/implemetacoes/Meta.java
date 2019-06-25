package implemetacoes;

import tempo.Data;
import tempo.Horario;
import tempo.Periodo;

public class Meta extends ItemAgenda {
	private Prioridade prioridade;

	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 * @param _prioridade
	 */
	public Meta(String _titulo, String _descricao, Periodo _periodo, Prioridade _prioridade) {
		super(_titulo, _descricao, _periodo);
		this.prioridade = _prioridade;
	}

	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _dataI
	 * @param _horaI
	 * @param _dataF
	 * @param _horaF
	 * @param _prioridade
	 * @throws Exception 
	 */
	public Meta(String _titulo, String _descricao, Data _dataI, Horario _horaI, Data _dataF, Horario _horaF,
			Prioridade _prioridade) throws Exception {
		super(_titulo, _descricao, _dataI, _horaI, _dataF, _horaF);
		this.prioridade = _prioridade;
	}

	/**
	 * @return the prioridade
	 */
	public Prioridade getPrioridade() {
		return this.prioridade;
	}

	/**
	 * @param prioridade the prioridade to set
	 */
	public void setPrioridade(Prioridade _prioridade) {
		this.prioridade = _prioridade;
	}
	
	/**
  	 * Método sobreposto equals
	 * @param _aux
	 * @return boolean
	 */
 	public boolean equals(Meta _aux) {
 		if (this.getPrioridade() == _aux.getPrioridade()) {
 			return true;
 		}
 		else {
 			return false;
 		}
 	}
	
 	/**
	 * Compara o objeto do chamado com o objeto passado como parametro
	 * @param _meta
	 * @return int
	 */
	public int compareTo(Meta _meta) {
		if (this.getPrioridade() == Prioridade.URGENCIA) {
			if (_meta.getPrioridade() == Prioridade.URGENCIA) {
				return 0;
			}
			else {
				return 1;
			}
		} else if (this.getPrioridade() == Prioridade.ALTA) {
			if (_meta.getPrioridade() == Prioridade.ALTA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.URGENCIA)
				return -1;
			return 1;
		} else if (this.getPrioridade() == Prioridade.MEDIA) {
			if (_meta.getPrioridade() == Prioridade.MEDIA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.ALTA || _meta.getPrioridade() == Prioridade.URGENCIA)
				return -1;
			return 1;
		} else if (this.getPrioridade() == Prioridade.BAIXA) {
			if (_meta.getPrioridade() == Prioridade.BAIXA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.NEUTRA)
				return 1;
			return -1;
		} else if (this.getPrioridade() == Prioridade.NEUTRA) {
			if (_meta.getPrioridade() == Prioridade.NEUTRA)
				return 0;
			return -1;
		}
		return -1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nPrioridade: ");
		builder.append(getPrioridade());
		builder.append("\nMeta: ");
		builder.append(super.toString());
		return builder.toString();
	}

}
