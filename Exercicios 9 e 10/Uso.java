import java.util.Scanner;
import java.util.Random;

// Classe de uso para receber um ponto do usuário e gerar outros 100 pontos de forma aleatória
// exibindo para cada um a distância entre ele e o primeiro ponto informado.

public class Uso {
	final static int QTDE = 3;
	private static Scanner scanner;
	public static void main(String[] args) throws Exception {
		Ponto vetor[] = new Ponto[QTDE];
		
		System.out.println("Insira dados para gerar um Ponto");
		System.out.println("Insira o valor de X: ");
		scanner = new Scanner(System.in);
		Double x = scanner.nextDouble();
		System.out.println("Insira o valor de Y: ");
		Double y = scanner.nextDouble();
		
		Ponto ponto = new Ponto(x, y);
		
		//instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();
         
		for(int i = 0; i<QTDE; i++) {
			vetor[i] = new Ponto(gerador.nextInt(99), gerador.nextInt(99));
		}
		
		for(int i = 0; i<QTDE; i++) {
			System.out.println(vetor[i].toString());
			System.out.println(vetor[i].distancia(ponto));
		}
	}

}
