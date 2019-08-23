
public class Uso {

	public static void main(String[] args) throws Exception {
		Funcionario func[] = new Funcionario[10];
		
		func[0] = new Funcionario("Guilherme", new Data(7,8,2000), "3834", new Data(10,5,2010), 1000);
		
		func[1] = new Chefe("Guilherme II", new Data(7,8,2001), "38345", new Data(10,5,2011), 1000, "DCEL");
		
		func[2] = new Diretor("Guilherme III", new Data(7,8,2002), "383457", new Data(10,5,2012), 1000, "DCEL", new Data(1,1,2016));
		
		for(int i=0; i<= 2; i++) {
			System.out.println(func[i]);
		}
		
	}

}
