import java.util.Scanner;

public class Uso {

	public static void main(String[] args) {
		final int QTDE = 2;
		
		Contato vetor[] = new Contato[QTDE];
		
		String nome, email, celular, endereco; 
		double renda;
		int opcao;
		
		for(int i=0; i<QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n(1) Contato, (2) Cliente:");
			opcao = new Scanner(System.in).nextInt();
			
			try {
				switch(opcao) {
				case 1: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).nextLine();
					System.out.println("Email (fulano@dominio): ");
					email = new Scanner(System.in).nextLine();
					vetor[i] = new Contato(nome, email);
					break;
				case 2: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).nextLine();
					System.out.println("Email (fulano@dominio): ");
					email = new Scanner(System.in).nextLine();
					System.out.println("Celular: ");
					celular = new Scanner(System.in).nextLine();
					System.out.println("Endereço: ");
					endereco = new Scanner(System.in).nextLine();
					System.out.println("Renda: ");
					renda = new Scanner(System.in).nextDouble();
					vetor[i] = new Cliente(nome, email, celular, endereco, renda);
					break;
				default:
					i--;
					continue;
				}
			}
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
		for(int j=0; j<QTDE; j++) {
			System.out.println(vetor[j].toString());
		}
		
	}

}
