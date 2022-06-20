package teste;

import java.util.Scanner;

public class TesteHenrique {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int somatoria = 0;
		int contador = 0;
		System.out.println("Quantos cursos tem?");
		int curso = entrada.nextInt();
		
		int matriz[][] = new int[curso][5];
		
		for (int i = 0; i < curso; i++) {
			System.out.println("Quantas turmas tem no "+(i+1)+" curso?");
			matriz[i][2] = entrada.nextInt();
		}
		for (int i = 0; i < matriz[i][1]; i++) {
			System.out.println("Quantos alunos tem na "+matriz[i][1]);
			matriz[i][2] = entrada.nextInt();
		}
		for (int i = 0; i < matriz[i][2]; i++) {
			System.out.println("Qual a nota do cabas?");
			matriz[i][3] = entrada.nextInt();
			somatoria = somatoria + matriz[i][3];
			contador++;
		}
		int media = somatoria/contador;
		
			for (int i = 0; i < matriz.length; i++) {
				System.out.println(matriz[i][0]);
				System.out.println(matriz[i][1]);
				System.out.println(matriz[i][2]);
				System.out.println(matriz[i][3]);
			}
	}

}
