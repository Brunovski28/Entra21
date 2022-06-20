import java.util.Scanner;

public class Turma3ProvasEMedia {
//Dada uma turma de alunos, contendo seu nome e nota de 3 provas descreva um algoritmo para informar a média de cada aluno.
//	Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String matriz[][] = new String[100][1];
		int matriz2[][] = new int[100][5];
		int salvador = 0;
			for (int i = 0;true;) {
				System.out.println("Qual o nome do infeliz?");
				String nome = entrada.next();
				if (nome.equals("fim")) {
					break;
				} 
				System.out.println("Qual a primeira nota da prova?");
				matriz2[i][1] = entrada.nextInt();
				System.out.println("Qual a segunda nota da prova?");
				matriz2[i][2] = entrada.nextInt();
				System.out.println("Qual a terceira nota da prova?");
				matriz2[i][3] = entrada.nextInt();
				matriz2[i][4] = matriz2[i][1] + matriz2[i][2] + matriz2[i][3];
				matriz[i][0] = nome;
				i++;
				salvador = i;

			}// fim do while
			System.out.println(salvador);

			for (int i = 0 ;i < salvador; i++) {
		System.out.println("Nome do infeliz é "+matriz[i][0]+", a primeira nota: "+matriz2[i][1]+", a segunda nota: "+matriz2[i][2]+", a"
				+ " terceira nota: "+matriz2[i][3]+" e a média: "+matriz2[i][4]/3);
			}
	}

}
