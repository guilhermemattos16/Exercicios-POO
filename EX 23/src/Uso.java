import java.util.*;

public class Uso {

	public static void main(String[] args) {
		// Letra A
		String texto = "eu gosto de poo";
		String[] palavras = texto.split(" ");
		Set<String> s = new TreeSet<String>();
		
		for (int i=0; i<palavras.length; i++) {
			s.add(new String(palavras[i]));
		}
		
		System.out.println("Conjunto: " + s);
		
		// Letra B
		String textoB = "eu gosto eu de poo poo";
		String[] palavrasB = textoB.split(" ");
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for (int i=0; i<palavrasB.length; i++) {
			if(m.containsKey(palavrasB[i])) {
				m.replace(palavrasB[i], m.get(palavrasB[i]), m.get(palavrasB[i])+1);
			}
			else {
				m.put(palavrasB[i], 1);
			}
			
		}
		
		System.out.println("Mapa: " + m);
		
		// Letra C
		
		String textoC = "eu gosto eu de poo poo";
		String[] palavrasC = textoC.split(" ");
		
		List<String> lista = new LinkedList<String>();
		
		for (int i=0; i<palavrasC.length; i++) {
			lista.add(new String(palavrasC[i]));
		}
		
		Collections.shuffle(lista);
		System.out.println("Lista: " + lista);
		
		
		// Letra D
		Random gerador = new Random();
		Set<Integer> num = new TreeSet<Integer>();

		while(num.size()<20) {
			num.add(gerador.nextInt(49)+1);
		}
		
		System.out.println("Numeros Ordenados: " + num);
		
		// Letra E
		
		String nomes = "Guilherme, Luciano, Cassio, Luiz, Luciano";
        String[] vetNomes = nomes.split(", ");
        Map<String,Integer> ordem = new TreeMap<String,Integer>();
        
        for(int i= 0; i<vetNomes.length; i++){
                if(ordem.containsKey(vetNomes[i])){
                    ordem.replace(vetNomes[i], ordem.get(vetNomes[i]), ordem.get(vetNomes[i])+1);
                }
                else{
                   ordem.put(new String(vetNomes[i]), new Integer(1)); 
                }
        }
        
        System.out.println("Lista ordenada" + ordem);
	}

}
