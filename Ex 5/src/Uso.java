// Exemplo de uso da classe Aluno
public class Uso {
	public static void main(String args[]) throws Exception {

		Aluno x = new Aluno("ze",9,8,6);
		System.out.println(x);

		Aluno y;          	// �y� � apenas uma refer�ncia
		y = new Aluno();  	// �y� agora � um objeto, isto �, 
		// aponta para uma aloca��o de mem�ria feita pelo construtor
		y.setNotas(8,10);     // o acesso aos seus membros privados ocorre somente
		y.setNome("maria");   // por interm�dio dos m�todos de interface ou contrutores
		System.out.println(y);
	}
}
