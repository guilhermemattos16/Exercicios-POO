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
