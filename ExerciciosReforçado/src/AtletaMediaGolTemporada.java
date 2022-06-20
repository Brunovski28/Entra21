import java.util.Scanner;
/*

Crie essa matriz:

20	16	0.56
25	19	0.94
24	25	1.02
28	10	1.4
19	17	0.92
22	16	0.12


A primeira coluna é a idade do atleta
A segunda coluna é a quantidade de jogos que esse atleta jogou
A terceira coluna é a média de gols por partida desse atleta

Determinar:
a) Qual é a média de idade dos atletas?
b) Qual a idade do atleta que mais fez gols?
c) Crie uma segunda matriz que em vez da média de gols por partida mostre quantos gols esse atleta fez essa temporada
 * */
public class AtletaMediaGolTemporada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double conta = 0;
		double atleta =0;
		double maiorvalor = Integer.MIN_VALUE;
		double matriz1 [][] = new double [6][3];
		double matriz2 [][] = new double [6][3];
		matriz1[0][0] = 20;	matriz1[0][1] = 16;	matriz1[0][2] = 0.56; //8,96
		matriz1[1][0] = 25;	matriz1[1][1] = 19;	matriz1[1][2] = 0.94; //17,86
		matriz1[2][0] = 24;	matriz1[2][1] = 25;	matriz1[2][2] = 1.02; //25,5
		matriz1[3][0] = 28;	matriz1[3][1] = 10;	matriz1[3][2] = 1.4; //19,6
		matriz1[4][0] = 19;	matriz1[4][1] = 17;	matriz1[4][2] = 0.92; // 15,64
		matriz1[5][0] = 22;	matriz1[5][1] = 16;	matriz1[5][2] = 0.12; //1,92
		for(int i = 0; i < 6; i++) {
			conta = conta + matriz1[i][0];
		}
		for(int i = 0; i < 6; i++) {
			matriz2[i][1] = matriz1[i][1] * matriz1[i][2];
			matriz2[i][2] = matriz2[i][1];
			if(matriz2[i][1] > maiorvalor) {
				maiorvalor = matriz1[i][0];
			}
		}
		
		System.out.println("A média das idades dos atletas: "+conta/6);
		System.out.println("A idade do atleta com mais gol: "+maiorvalor);
		System.out.println("===========");
		for(int i = 0; i < 6; i++) {
			System.out.println(matriz2[i][2]);
		}
	}

}
