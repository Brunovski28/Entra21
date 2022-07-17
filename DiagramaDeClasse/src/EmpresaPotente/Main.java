package EmpresaPotente;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int funcionario = 0;
		System.out.println("1 - Funcion�rio\n2 - Aluno");
		int FA = entrada.nextInt();
		if (FA == 1) {
			System.out.println("Quantos funcionarios?");
			funcionario = entrada.nextInt();
			Funcionario clientes[] = new Funcionario[funcionario];
		
			for (int i = 0; i < funcionario; i++) {

				System.out.println("Qual nome do funcion�rio?");
				String nome = entrada.next();
				System.out.println("Qual o nome da rua?");
				String rua = entrada.next();
				System.out.println("Qual o n�mero da rua?");
				String numero = entrada.next();
				System.out.println("Qual o CEP?");
				String cep = entrada.next();
				System.out.println("Qual a sua carga horaria?");
				double cargahoraria = entrada.nextDouble();
				System.out.println("Qual o seu salario?");
				double salario = entrada.nextDouble();
				System.out.println("Qual � o id?");
				String id = entrada.next();
				System.out.println("");
				System.out.println("========================");
				System.out.println("Qual o ano do ingresso");
				int anoingresso = entrada.nextInt();
				System.out.println("Qual m�s do ingresso");
				int mesingresso = entrada.nextInt();
				System.out.println("Qual dia do ingresso?");
				int diaingresso = entrada.nextInt();
				System.out.println("");
				System.out.println("========================");
				System.out.println("Qual ano do nascimento");
				int anonascimento = entrada.nextInt();
				System.out.println("Qual m�s do nascimento");
				int mesnascimento = entrada.nextInt();
				System.out.println("Qual dia do nascimento");
				int dianascimento = entrada.nextInt();
				clientes[i] = new Funcionario(nome, id, new Endereco(rua, numero, cep),
						LocalDate.of(anoingresso, mesingresso, diaingresso),
						LocalDate.of(anonascimento, mesnascimento, dianascimento), cargahoraria, salario);
				System.out.println("Voc� deseja aumentar a carga hor�ria de algu�m?");
				String SN = entrada.next();
				if (SN.equalsIgnoreCase("sim")) {
					System.out.println("Qual id?");
					int idfun = entrada.nextInt();
					 int ider = Integer.parseInt(id);
					  
					clientes[ider].aumentarCarga();
				}
				System.out.println("Deseja demitir algu�m?");
				String SNR = entrada.next();
				if(SNR.equalsIgnoreCase("sim")) {
					 int ider = Integer.parseInt(id);
					clientes[ider-1].demitir();
				}
			} // for
		} else if (FA == 2) {
			System.out.println("Quantos alunos tem?");
			int alunos = entrada.nextInt();
			Aluno aluno[] = new Aluno[alunos];
			for (int i = 0; i < aluno.length; i++) {
				System.out.println("Qual o nome?");
				String nome = entrada.next();
				System.out.println("Qual id?");
				String id = entrada.next();
				System.out.println("Qual o nome da rua?");
				String rua = entrada.next();
				System.out.println("O n�mero da rua");
				String numero = entrada.next();
				System.out.println("Qual o CEP");
				String cep = entrada.next();
				System.out.println("Que ano?");
				int ano = entrada.nextInt();
				System.out.println("");
				System.out.println("========================");
				System.out.println("Qual o ano do ingresso");
				int anoingresso = entrada.nextInt();
				System.out.println("Qual m�s do ingresso");
				int mesingresso = entrada.nextInt();
				System.out.println("Qual dia do ingresso?");
				int diaingresso = entrada.nextInt();
				System.out.println("");
				System.out.println("========================");
				System.out.println("Qual ano do nascimento");
				int anonascimento = entrada.nextInt();
				System.out.println("Qual m�s do nascimento");
				int mesnascimento = entrada.nextInt();
				System.out.println("Qual dia do nascimento");
				int dianascimento = entrada.nextInt();

				aluno[i] = new Aluno(nome, id, new Endereco(rua, numero, cep),
						LocalDate.of(anoingresso, mesingresso, diaingresso),
						LocalDate.of(anonascimento, mesnascimento, dianascimento), ano);
				int anoformatura = (aluno[i].getDataNasc().getYear())+18;
				aluno[i].setDataFormatura(LocalDate.of(anoformatura, 12, 5));
				System.out.println("Voc� ira fazer a formatura em "+aluno[i].getDataFormatura());
				System.out.println("Deseja sair?");
				String SNRR = entrada.next();
				if (SNRR.equalsIgnoreCase("Sim")) {
					aluno[i].sair();
				}
			}
		} else {
			System.out.println("Nenhuma op��o escolhida");
		}
		

				
			
		}
	}

