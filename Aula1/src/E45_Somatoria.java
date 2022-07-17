
public class E45_Somatoria {

	public static void main(String[] args) {
		int matriz [][] = new int [2] [2];
		
		int Soma = 0;
		int Soma2 = 0;
		int somatoria = 0;
		
		matriz [0][0] = 4;
		matriz [0][1] = 12;
		matriz [1][0] = 2;
		matriz [1][1] = -3;

		Soma = matriz[0][0] * matriz[1][1];
		Soma2 = matriz[0][1] * matriz[1][0];
		
		somatoria = Soma - Soma2;
		
		System.out.println(somatoria);
	
		
	}

}
