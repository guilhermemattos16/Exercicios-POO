import java.util.Scanner;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		int j = 0;
		double _taxa = 0;
		scanner = new Scanner(System.in);
		
		System.out.print("Insira a taxa de juros: ");
		_taxa = scanner.nextDouble();
		ContaBancaria.setTaxa(_taxa);
		
		for(int i = 0; i < 2; i++) {
			try {
				scanner = new Scanner(System.in);
				System.out.print("Digite o nome do correntista: ");
				String _nome = scanner.nextLine();
				scanner = new Scanner(System.in);
				System.out.print("Digite o saldo da conta: ");
				double _saldo = scanner.nextDouble();
				scanner.nextLine();
				ContaBancaria conta = new ContaBancaria(_nome, _saldo);
				System.out.println(conta);
				
				System.out.println("Deseja fazer a correção do saldo deste correntista?\n1- Sim;\n2-Não.");
				j = scanner.nextInt();
				
				if (j == 1) {
					conta.corrigeSaldo();
					System.out.print("Saldo corrigido: ");
					System.out.println(conta.getSaldo());
				}
			
			}
			catch (Exception e) {
				System.out.println("Não foi possivel realizar");
				i--;
			}
		}
		
		System.out.println("Finalizado!");
		
	}
}
