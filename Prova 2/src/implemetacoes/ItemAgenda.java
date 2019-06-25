package implemetacoes;

import tempo.Periodo;
import tempo.Data;
import tempo.Horario;

public class ItemAgenda {
	String titulo;
	String descricao;
	Periodo periodo;
	
	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _periodo
	 */
	public ItemAgenda(String _titulo, String _descricao, Periodo _periodo) {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
	}
	
	/**
	 * @param _titulo
	 * @param _descricao
	 * @param _dataI
	 * @param _horaI
	 * @param _dataF
	 * @param _horaF
	 * @throws Exception 
	 */
	public ItemAgenda(String _titulo, String _descricao, Data _dataI, Horario _horaI, Data _dataF, Horario _horaF) throws Exception {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(new Periodo(_dataI, _horaI, _dataF, _horaF));
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * @param _titulo the titulo to set
	 */
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}
	
	/**
	 * @param _descricao the descricao to set
	 */
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	
	/**
	 * @return the periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}
	
	/**
	 * @param _periodo the periodo to set
	 */
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getTitulo());
		builder.append("\n");
		builder.append(getDescricao());
		builder.append("\n");
		builder.append(getPeriodo());
		return builder.toString();
	}
}
