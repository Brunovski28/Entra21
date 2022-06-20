
public class Exercicio46 {

	public static void main(String[] args) {
		int matriz1 [][] = new int [4] [4];
		int matriz2 [][] = new int [4] [4];
		int matriz3 [][] = new int [4] [4];
		
		matriz1[0][0] = 1; 		matriz2[0][0] = 16; 
		matriz1[0][1] = 6; 		matriz2[0][1] = 15;  
		matriz1[0][2] = 34;		matriz2[0][2] = 14; 
		matriz1[0][3] = 32;		matriz2[0][3] = 13; 
		matriz1[1][0] = 25;		matriz2[1][0] = 12; 
		matriz1[1][1] = 64;		matriz2[1][1] = 11; 
		matriz1[1][2] = 25;		matriz2[1][2] = 10; 
		matriz1[1][3] = 36;		matriz2[1][3] = 9; 
		matriz1[2][0] = 12;		matriz2[2][0] = 8; 
		matriz1[2][1] = 10;		matriz2[2][1] = 7; 
		matriz1[2][2] = 11;		matriz2[2][2] = 6; 
		matriz1[2][3] = 153;	matriz2[2][3] = 5; 
		matriz1[3][0] = 20;		matriz2[3][0] = 4; 
		matriz1[3][1] = 14;		matriz2[3][1] = 3; 
		matriz1[3][2] = 25;		matriz2[3][2] = 2; 
		matriz1[3][3] = 16;		matriz2[3][3] = 1; 
		


			
			for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.println("Na matriz (1) "+ matriz1[i][j]+" e na segunda matriz (2) "+matriz2[i][j]+" dando "
						+ ""+matriz3[i][j]);
			}
			}	

				
	}
	
}
