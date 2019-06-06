import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

/**
 * Encapsula a classe TreeSet facilitando o seu uso e tipificando os objetos para
 * inclusão como instâncias da classe Sorteio
 *
 * @author Guilherme S. Mattos
 * @version 1.0 (junho-2019)
 */

public class NumerosSorteados {
	private Set<Integer> grupo;
	
	//instância um objeto da classe Random usando o construtor básico
	private Random gerador = new Random();

	NumerosSorteados(double quantidade) {
		grupo = new TreeSet<Integer>();
		while(this.grupo.size()<quantidade) {
			int _num = gerador.nextInt(Sorteio.limiteSup);
			if(!this.existe(_num+1)) {
				this.insere(_num+1);	
			}
		}
	}
	
	/**
	 * Insere um novo número.
	 *
	 * @param _num objeto a ser incluído da coleção
	 */
	public void insere(int _num) {
		this.grupo.add(_num);
	}

	/**
	 * Verifica a existência de uma intância através do campo numero
	 * @param _num numero a ser pesquisado
	 * @return true se achou <p>
	 *     	false se não achou
	 */
	public boolean existe(int _num) {
		return this.grupo.contains(_num);
	}

	/**
	 * Sobreposição do método toString para retornar todo o conteúdo da coleção
	 * separando os elementos por espaços
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		Iterator<Integer> i = this.grupo.iterator();
		while (i.hasNext())
			s.append(i.next() + " ");
		return s.toString();
	}
}
