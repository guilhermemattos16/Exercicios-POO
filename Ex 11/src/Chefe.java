
public class Chefe extends Funcionario {
	private String departamento;

	public Chefe(String _nome, Data _dtNasc, String _id, Data _dataAdm, double _salario, String _departamento) {
		super(_nome, _dtNasc, _id, _dataAdm, _salario);
		this.departamento = _departamento;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String _departamento) {
		this.departamento = _departamento;
	}

	@Override
	public String toString() {
		return "Chefe ["+super.toString() + "Departamento= " + getDepartamento() + "]";
	}

	
	
	
	
	
	
}
