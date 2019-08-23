
public class Funcionario extends Pessoa {
	private Data dataAdm;
	private double salario;
	
	public Funcionario(String _nome, Data _dtNasc, String _id, Data dataAdm, double salario) {
		super(_nome, _dtNasc, _id);
		this.dataAdm = dataAdm;
		this.salario = salario;
	}
	
	public Data getDataAdm() {
		return this.dataAdm;
	}
	
	public void setDataAdm(Data _dataAdm) {
		this.dataAdm = _dataAdm;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double _salario) {
		this.salario = _salario;
	}
	
	public void reajusta(double taxa) {
		this.salario += this.salario * taxa;
	}

	@Override
	public String toString() {
		return "Funcionario ["+super.toString() + "Data de Admissão=" + dataAdm + ", salario=" + salario + "]";
	}
	
	

}
