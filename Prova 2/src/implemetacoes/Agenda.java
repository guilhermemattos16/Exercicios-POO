package implemetacoes;

import java.util.*;
import tempo.*;

public class Agenda {
	private List<ItemAgenda> lista;

	/**
	 */
	public Agenda() {
		lista = new LinkedList<ItemAgenda>();
	}
	
	public void insere(ItemAgenda _novoitem) {
		this.lista.add(_novoitem);
	}

	public void insere(String _titulo, String _descricao, Data _dataI, Horario _horarioI, Data _dataF, Horario _horarioF, String _local) throws Exception {
		this.insere(new Evento(_titulo, _descricao, _dataI, _horarioI, _dataF, _horarioF, _local));
	}

	public void insere(String _titulo, String _descricao, Data _dataI, Horario _horarioI, Data _dataF, Horario _horarioF, Prioridade _prioridade) throws Exception {
		this.insere(new Meta(_titulo, _descricao, _dataI, _horarioI, _dataF, _horarioF, _prioridade));
	}

	public void insere(String _titulo, String _descricao, Data _dataI, Horario _horarioI, Data _dataF, Horario _horarioF, int _aviso) throws Exception {
		this.insere( new Lembrete(_titulo, _descricao, _dataI, _horarioI, _dataF, _horarioF, _aviso));
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < this.lista.size(); i++) 
		{
			builder.append(this.lista.get(i) + " ");
		}
		
		return builder.toString();
	}
	
	public String imprimeNoIntervalo(Periodo _periodo) {
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i < this.lista.size(); i++)
			if (this.lista.get(i).getPeriodo().isIntervalo(_periodo) == 1)
				lista.append(this.lista.get(i) + " ");
		return lista.toString();
	}
	

	public LinkedList<Meta> imprimeMetaPrioridade() {
		List<Meta> meta = new LinkedList<Meta>();
		for (int i = 0; i < this.lista.size(); i++)
			if (lista.get(i) instanceof Meta) {
				meta.add((Meta) lista.get(i));
			}
		Collections.sort(meta, new ComparaPrioridade());
		return (LinkedList<Meta>) meta;
	
	}
	
	public List<Lembrete> imprimeLembreteMinutos() {
		List<Lembrete> lembrete = new LinkedList<Lembrete>();
		for (int i = 0; i < this.lista.size(); i++)
			if(lista.get(i) instanceof Lembrete) {
				lembrete.add((Lembrete) lista.get(i));
			}
		Collections.sort(lembrete, new ComparaLembreteMinutos());

		return lembrete;
		
	}
	
	public List<Evento> imprimeEventoLocal() {
		List<Evento> evento = new LinkedList<Evento>();
		for (int i = 0; i < this.lista.size(); i++)
			if(lista.get(i) instanceof Evento) {
				evento.add((Evento) lista.get(i));
			}
		Collections.sort(evento, new ComparaEventoLocal());
		
		return (List<Evento>) evento;
	}

}

class ComparaPrioridade implements Comparator<ItemAgenda> {
  	public int compare(ItemAgenda _meta1, ItemAgenda _meta2) {
  		Meta meta1 = (Meta)_meta1;
  		Meta meta2 = (Meta)_meta2;
        
  		return meta1.compareTo(meta2);
  	}
}

class ComparaLembreteMinutos implements Comparator<ItemAgenda> {
  	public int compare(ItemAgenda _lembrete1, ItemAgenda _lembrete2) {
  		Lembrete lembrete1 = (Lembrete)_lembrete1;
  		Lembrete lembrete2 = (Lembrete)_lembrete2;
        
  		return lembrete1.compareTo(lembrete2);
  	}
}

class ComparaEventoLocal implements Comparator<ItemAgenda> {
  	public int compare(ItemAgenda _evento1, ItemAgenda _evento2) {
  		Evento evento1 = (Evento)_evento1;
  		Evento evento2 = (Evento)_evento2;
        
  		return evento1.compareTo(evento2);
  	}
}
