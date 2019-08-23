//import java.util.Scanner;

public class Uso {

//	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
//		int d, m, a;
//		Data data = null;
//		System.out.println("Entre com a data");
//		System.out.println("Entre com o dia:");
//		d = SCANNER.nextInt();
//		System.out.println("Entre com o mes:");
//		m = SCANNER.nextInt();
//		System.out.println("Entre com o ano:");
//		a = SCANNER.nextInt();
//		try {
//			data = new Data(d, m, a);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(data.toString());
		
		Data data = null;
		try {
			data = new Data(28, 02, 2013);
			Data nova = new Data(27, 2, 2013);
			System.out.println(data);
			System.out.println(nova);
			System.out.println(data.compareTo(nova));
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}

}
