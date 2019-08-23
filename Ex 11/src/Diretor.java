
public class Diretor extends Chefe{
	private Data promocao;

	public Diretor(String _nome, Data _dtNasc, String _id, Data _dataAdm, double _salario, String _departamento,
			Data _promocao) {
		super(_nome, _dtNasc, _id, _dataAdm, _salario, _departamento);
		this.promocao = _promocao;
	}

	public Data getPromocao() {
		return this.promocao;
	}

	public void setPromocao(Data _promocao) {
		this.promocao = _promocao;
	}

	@Override
	public String toString() {
		return "Diretor [" + super.toString() + ", promocao=" + promocao + "]";
	}
	
}
