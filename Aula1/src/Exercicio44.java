
public class Exercicio44 {

	public static void main(String[] args) {
		int matriz [][] = new int [12] [2];
		
		matriz [0][0] = 1;
		matriz [0][1] = 1500;
		matriz [1][0] = 2;
		matriz [1][1] = 2500;
		matriz [2][0] = 3;
		matriz [2][1] = 3500;
		matriz [3][0] = 4;
		matriz [3][1] = 4500;
		matriz [4][0] = 5;
		matriz [4][1] = 5500;
		matriz [5][0] = 6;
		matriz [5][1] = 6500;
		matriz [6][0] = 7;
		matriz [6][1] = 7500;
		matriz [7][0] = 8;
		matriz [7][1] = 8500;
		matriz [8][0] = 9;
		matriz [8][1] = 9500;
		matriz [9][0] = 10;
		matriz [9][1] = 10500;
		matriz [10][0] = 11;
		matriz [10][1] = 11500;
		matriz [11][0] = 12;
		matriz [11][1] = 12500;

		for (int i = 0; i < matriz.length; i++) {
			matriz[i][0] = i + 1;
			for (int j =1; j < matriz[i].length;j++) {
				matriz[i][j] = i*i;
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("No mês "+ matriz[i][0]+" a loja teve de "+matriz[i][1]);
		}
	}

}
