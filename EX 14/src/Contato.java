
public class Contato {
	private String nome;
	private Email email;
	
	public Contato(String _nome) throws Exception {
		this.setNome(_nome);
		this.setDescricao(new Email());
	}
	
	public Contato() throws Exception {
		this.setNome("");
		this.setDescricao(new Email());
	}

	public Contato(String _nome, Email _email) throws Exception {
		this.setDescricao(_email);
		this.setNome(_nome);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public Email getDescricao() {
		return this.email;
	}

	public void setDescricao(Email _email) {
		this.email = _email;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + this.getNome() + ", getDescricao()=" + this.getDescricao() + "]";
	}
	
	public boolean equals(Contato aux) {
		if(getNome().equals(aux.getDescricao())) {
			return true;
		}
		return false;
	}
}
