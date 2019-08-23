
public class ContaBancaria {
	private String nome;
	private double saldo;
	static final public double DEFAULT_TAXA = 0;
	static private double taxa = ContaBancaria.DEFAULT_TAXA;
	
	public ContaBancaria() throws Exception {
		this("", 0);
	}
	
	public ContaBancaria(String _nome, double _saldo) throws Exception {
		setNome(_nome);
		setSaldo(_saldo);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double _saldo) throws Exception {
		if (_saldo >= 0) {
			this.saldo = _saldo;
		}
		else
			throw new Exception("Saldo negativo");
	}

	public static double getTaxa() {
		return ContaBancaria.taxa;
	}

	public static void setTaxa(double _taxa) {
		ContaBancaria.taxa = _taxa;
	}
	
	public boolean equals(ContaBancaria _conta) {
		if (this.nome.equals(_conta.nome) && this.saldo == _conta.saldo) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(this.getNome());
		dados.append("\nSaldo: ");
		dados.append(this.getSaldo());
		return dados.toString();
	}

	public int compareTo(ContaBancaria _conta) {
  		if (this.getSaldo() > _conta.getSaldo()) {
			return -1;
		} 
  		else if (this.getSaldo() == _conta.getSaldo()) {
			return 0;
		} 
  		else {
			return 1;
		}
  	}
	
	public void corrigeSaldo() throws Exception {
		this.setSaldo(this.getSaldo() * (1 - (ContaBancaria.taxa / 100)));
	}
	
}	
