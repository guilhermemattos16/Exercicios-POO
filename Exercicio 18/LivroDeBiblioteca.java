
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
	private enum StatusEmprestimo {
		EMPRESTADO, ACERVO, REPARACAO, DESAPARECIDO
	};

	private StatusEmprestimo statusEmprestimo;
	private String localizacao;
	private String descricao;
	
	
	public LivroDeBiblioteca(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao,
			StatusEmprestimo _statusEmprestimo, String _localizacao, String _descricao) {
		super(_titulo, _autor, _numeroPaginas, _anoEdicao);
		this.statusEmprestimo = _statusEmprestimo;
		this.localizacao = _localizacao;
		this.descricao = _descricao;
	}
	
	

	public LivroDeBiblioteca(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		super(_titulo, _autor, _numeroPaginas, _anoEdicao);
		this.statusEmprestimo = StatusEmprestimo.DESAPARECIDO;
		this.localizacao = "";
		this.descricao = "";
	}

	public StatusEmprestimo getStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public void setStatusEmprestimo(StatusEmprestimo _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}



	public String getLocalizacao() {
		return this.localizacao;
	}



	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}



	public String getDescricao() {
		return this.descricao;
	}



	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	@Override
	public boolean isEmprestado() {
		// TODO Auto-generated method stub
		// Verifica se o livro está emprestado
		if (this.statusEmprestimo == StatusEmprestimo.EMPRESTADO) {
			return true;
		}
		
		return false;
	}

	@Override
	public void empresta() {
		// TODO Auto-generated method stub
		this.statusEmprestimo = StatusEmprestimo.EMPRESTADO;
	}

	@Override
	public void devolve() {
		// TODO Auto-generated method stub
		this.statusEmprestimo = StatusEmprestimo.ACERVO;
		
	}

	@Override
	public String localiza() {
		// TODO Auto-generated method stub
		if (this.statusEmprestimo == StatusEmprestimo.EMPRESTADO)
			return "Emprestado";
		return this.localizacao;
	}

	@Override
	public String apresentaDescricao() {
		// TODO Auto-generated method stub
		return this.getDescricao();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nStatusEmprestimo: ");
		builder.append(getStatusEmprestimo());
		builder.append("\nLocalizacao:");
		builder.append(getLocalizacao());
		builder.append("\nDescricao: ");
		builder.append(getDescricao());
		return builder.toString();
	}

}
