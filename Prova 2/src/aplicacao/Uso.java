package aplicacao;

import implemetacoes.*;
import tempo.*;

import java.util.*;

public class Uso {
	private static Scanner scanner;
	private static Prioridade _prioridade;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int escolha; 
		int item;
		int opcao;
		int sair = 0;
		Agenda lista = new Agenda();
		scanner = new Scanner(System.in);
		
		while (sair == 0) {
			try {
				System.out.println("//////////////////////////");
				System.out.println("\nDigite a op��o para: \n 1- Realizar o cadastro na agenda;\n 2- Exibir relat�rios;\n 3- Sair.");
				escolha = scanner.nextInt();
				scanner.nextLine();
				if (escolha == 1) 
				{
					System.out.println("\nDeseja realizar qual tipo de cadastro:\n 1- Evento;\n 2- Lembrete;\n 3- Meta.");
					item = scanner.nextInt();
					scanner.nextLine();
					if (item == 1) 
					{
						System.out.println("\nCADASTRO DE UM EVENTO");
						System.out.print("\nDigite o t�tulo do evento: ");
						String _titulo = scanner.nextLine();
						System.out.print("\nDigite a descri��o do evento: ");
						String _descricao = scanner.nextLine();
						System.out.print("\nDigite a data de in�cio do evento: ");
						String _dataI = scanner.nextLine();
						System.out.print("\nDigite o hor�rio de in�cio do evento: ");
						String _horarioI = scanner.nextLine();
						System.out.print("\nDigite a data do fim do evento: ");
						String _dataF = scanner.nextLine();
						System.out.print("\nDigite o hor�rio do fim do evento: ");
						String _horarioF = scanner.nextLine();
						System.out.print("\nDigite o local do evento: ");
						String _local = scanner.nextLine();
						
						lista.insere(_titulo, _descricao, new Data(_dataI), new Horario(_horarioI), new Data(_dataF), new Horario(_horarioF), _local);
					} 
					else if (item == 2) 
					{
						System.out.println("\nCADASTRO DE UM LEMBRETE\n");
						System.out.print("\nDigite o t�tulo do lembrete: ");
						String _titulo = scanner.nextLine();
						System.out.print("\nDigite a descri��o do lembrete: ");
						String _descricao = scanner.nextLine();
						System.out.print("\nDigite a data de in�cio do lembrete: ");
						String _dataI = scanner.nextLine();
						System.out.print("\nDigite o hor�rio de in�cio do lembrete: ");
						String _horarioI = scanner.nextLine();
						System.out.print("\nDigite a data do fim do lembrete: ");
						String _dataF = scanner.nextLine();
						System.out.print("\nDigite o hor�rio do fim do lembrete: ");
						String _horarioF = scanner.nextLine();
						System.out.print("\nDigite a quantidade de minutos para o aviso de anteced�ncia do lembrete: ");
						int _aviso = scanner.nextInt();
						scanner.nextLine();
						
						lista.insere(_titulo, _descricao, new Data(_dataI), new Horario(_horarioI), new Data(_dataF), new Horario(_horarioF), _aviso);

					} 
					else if (item == 3) 
					{
						System.out.println("\nCADASTRO DE UMA META");
						System.out.print("\nDigite o t�tulo da meta: ");
						String _titulo = scanner.nextLine();
						System.out.print("\nDigite a descri��o da meta: ");
						String _descricao = scanner.nextLine();
						System.out.print("\nDigite a data de in�cio da meta: ");
						String _dataI = scanner.nextLine();
						System.out.print("\nDigite o hor�rio de in�cio da meta: ");
						String _horarioI = scanner.nextLine();
						System.out.print("\nDigite a data do fim da meta: ");
						String _dataF = scanner.nextLine();
						System.out.print("\nDigite o hor�rio do fim da meta: ");
						String _horarioF = scanner.nextLine();
						System.out.print("\nEscolha a prioridade da meta:\n1- Urgencia;\n2- Alta;\n3- M�dia;\n4- Baixa;\n5- Neutra.");
						int _intP = scanner.nextInt();
						
						
						if (_intP == 1) {
							_prioridade = Prioridade.URGENCIA;
						}
						else if (_intP == 2) {
							_prioridade = Prioridade.ALTA;
						}
						else if (_intP == 3) {
							_prioridade = Prioridade.MEDIA;
						}
						else if (_intP == 4) {
							_prioridade = Prioridade.BAIXA;
						}
						else if (_intP == 5) {
							_prioridade = Prioridade.NEUTRA;
						}
						else {
							System.out.println("\nOp��o inv�lida.");
						}
						
						lista.insere(_titulo, _descricao, new Data(_dataI), new Horario(_horarioI), new Data(_dataF), new Horario(_horarioF), _prioridade);
					} 
					else {
						System.out.println("\nOp��o inv�lida.\n");
					}
				} else if (escolha == 2) {
					System.out.println("\nDeseja ver o relat�rio de:\n"
							+ "1- Todos os itens agendados;\n"
							+ "2- Todos os itens agendados em um intervalo de datas; \n"
							+ "3- Todas as metas em ordem de prioridade;\n"
							+ "4- Todos os lembretes em ordem de minutos de anteced�ncia;\n"
							+ "5- Todos os eventos em ordem alfab�tica de local.");
					opcao = scanner.nextInt();
					if (opcao == 1) 
					{
						System.out.println("\nTodos os itens agendados:\n");
						
						Arquivo.grava("todosItens.my",lista);
						Agenda todosItens;
						todosItens = (Agenda) Arquivo.le("todosItens.my");
						System.out.println(todosItens.toString());
					} 
					else if (opcao == 2) 
					{
						System.out.print("\nDigite a data in�cio do intervalo de busca: ");
						String _dataI = scanner.nextLine();
						System.out.print("\nDigite a data fim do intervalo de busca: ");
						String _dataF = scanner.nextLine();

						Arquivo.grava("todosNoIntervalo.my", lista.imprimeNoIntervalo(new Periodo(new Data(_dataI), new Data(_dataF))));
						Agenda imprimeIntervalo;
						imprimeIntervalo = (Agenda) Arquivo.le("todosNoIntervalo.my");
						System.out.println("\nTodos os itens no intervalo entre as datas " + _dataI + " - "+ _dataF + ": " + imprimeIntervalo.toString());

					} 
					else if (opcao == 3) 
					{
						System.out.println("Todas as metas em ordem de prioridade:");

						Arquivo.grava("metasPrioridade.my", lista.imprimeMetaPrioridade());
						LinkedList<Meta> metasPrioridade1;
						metasPrioridade1 = (LinkedList<Meta>)Arquivo.le("metasPrioridade.my");
						System.out.println(metasPrioridade1.toString());

					} 
					else if (opcao == 4) 
					{
						System.out.println("Todos os lembretes em ordem de minutos de anteced�ncia:");

						Arquivo.grava("lembretesMin.my",lista.imprimeLembreteMinutos());
						LinkedList<Lembrete> lembretesMinutos;
						lembretesMinutos = (LinkedList<Lembrete>)Arquivo.le("lembretesMin.my");
						System.out.println(lembretesMinutos.toString());
					} 
					else if (opcao == 5) 
					{
						System.out.println("Todos os eventos em ordem alfab�tica de local:");

						Arquivo.grava("eventosLocal.my",lista.imprimeEventoLocal());
						LinkedList<Evento> eventosLocal;
						eventosLocal = (LinkedList<Evento>)Arquivo.le("eventosLocal.my");
						System.out.println(eventosLocal.toString());
					} 
					else 
					{
						System.out.println("\nOp��o inv�lida.\n");
					}

				} 
				else if (escolha == 3) 
				{
					sair = 1;
					System.out.println("\n\n Programa encerrado."
							+ "\n\n ///////////////////// \n ");
				} 
				else 
				{
					System.out.println("\nOp��o inv�lida\n");
				}
			} 
			catch (Exception e) 
			{
				sair = 1;
				System.out.println(e);
				System.out.println("Dados Inv�lidos.\n\n");
			}
		}
	}
}
