import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * <p>
 * <b> Cole��es usadas: </b>
 * <p>
 * <b> LinkedList </b> - aceita elementos repetidos; permite acesso aleat�rio do
 * n-esimo elemento; apesar de percorrer sequencialmente a lista (da frente para tr�s
 * ou vice-versa, dependendo do que for mais pr�ximo);
 * mant�m a mesma ordem da inser��o; para usar uma pesquisa bin�ria (muito mais r�pida que a linear), 
 * com o m�todo est�tico Collections.binarySearch(lista), os elementos dever�o estar ordenados.

 * <p>
 * <b> TreeSet </b> - n�o aceita elementos repetidos; mant�m os elementos
 * ordenados a cada inser��o, possui busca r�pida; � ruim para acessar os
 * elementos sequencialmente
 * <p>
 * <p>
 * Estas classes de cole��es foram encapsuladas em outras classes para facilitar o seu uso
 * <p>
 * Os objetos s�o depois gravados em disco atrav�s da serializa��o.
 * <p>
 * Tipos primitivos s� podem ser inseridos em cole��es por interm�dio de
 * classes wrapper (em vers�es mais recente do Java � poss�vel inserir tipos primitivos)
 * 
 * @author Guilherme S. Mattos
 * @version 1.0 (junho-2019)
 *
 */
public class Uso {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		try {
			ConjuntoSorteio sorteio = new ConjuntoSorteio();
			sorteio.insere(new Data("24/04/2007"), 8);
			System.out.println(sorteio);
			
			Arquivo.grava("conjunto.my",sorteio);
	      	LinkedList<Sorteio> sorteio2;
	      	sorteio2 = (LinkedList<Sorteio>)Arquivo.le("conjunto.my");
	      	System.out.println("Dados lidos do arquivo:\n"+sorteio2.toString());
	      	
	      	BufferedWriter arqSaida;
	      	arqSaida = new BufferedWriter(new FileWriter("arquivo_de_saida.txt"));
	      
	      	arqSaida.write(sorteio.toString()+"\r\n");

	      	arqSaida.close();
		}
		
		catch(IOException e) {
          	System.out.println("Problemas na leitura ou grava��o do arquivo");
    	}

		
    	catch(ClassNotFoundException e) {
          	System.out.println("Classe inexistente usada na convers�o");
    	}

	}
}
