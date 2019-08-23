
public class Livro {
	String titulo;
	String autor;
	int numeroPaginas;
	int anoEdicao;
	
	public Livro(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		this.setTitulo(_titulo);
		this.setAutor(_autor);
		this.setNumeroPaginas(_numeroPaginas);
		this.setAnoEdicao(_anoEdicao);
	}
	
	public Livro() {
		this.setTitulo("");
		this.setAutor("");
		this.setNumeroPaginas(0);
		this.setAnoEdicao(0);
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String _autor) {
		this.autor = _autor;
	}
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	public void setNumeroPaginas(int _numeroPaginas) {
		this.numeroPaginas = _numeroPaginas;
	}
	
	public int getAnoEdicao() {
		return this.anoEdicao;
	}
	
	public void setAnoEdicao(int _anoEdicao) {
		this.anoEdicao = _anoEdicao;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Titulo: ");
		builder.append(getTitulo());
		builder.append("\nAutor: ");
		builder.append(getAutor());
		builder.append("\nNumero de Paginas: ");
		builder.append(getNumeroPaginas());
		builder.append("\nAno de Edicao: ");
		builder.append(getAnoEdicao());
		return builder.toString();
	}
	
	
}
