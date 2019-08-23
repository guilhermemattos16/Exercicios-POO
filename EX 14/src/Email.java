public class Email {
	private String descricao;
	
	public Email() throws Exception {
		this.setDescricao("");
	}

	public Email(String _descricao) throws Exception {
		this.setDescricao(_descricao);
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String _descricao) throws Exception {												
		if (!_descricao.contains("@")) {
			throw new Exception();
		}
		
		this.descricao = _descricao;	
	}

	public String toString() {
		return "Email [Descricao=" + descricao + "]";
	}
	
	public boolean equals(Email segundo) {
		if(getDescricao().contentEquals(segundo.getDescricao()) ) {
			return true;
		}
		return false;
	}
}
