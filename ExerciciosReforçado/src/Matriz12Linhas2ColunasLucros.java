import java.util.Scanner;

public class Matriz12Linhas2ColunasLucros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[] [] = new int[12] [2];
		
		matriz[0][0] = 1; 	matriz[7][0] = 8;
		matriz[0][1] = 5;	matriz[7][1] = 75;
		matriz[1][0] = 2;	matriz[8][0] = 9;
		matriz[1][1] = 15;	matriz[8][1] = 85;
		matriz[2][0] = 3;	matriz[9][0] = 10;
		matriz[2][1] = 25;	matriz[9][1] = 95;
		matriz[3][0] = 4;	matriz[10][0] = 11;
		matriz[3][1] = 35;	matriz[10][1] = 105;
		matriz[4][0] = 5;	matriz[11][0] = 12;
		matriz[4][1] = 45;	matriz[11][1] = 115;
		matriz[5][0] = 6;	
		matriz[5][1] = 55;	
		matriz[6][0] = 7;	
		matriz[6][1] = 65;	
	
		System.out.println("Qual mês quer visualizar?");
		int numero = entrada.nextInt();
		System.out.println("O mês "+numero+" teve "+matriz[numero][1]+" de lucro");

	}

}
