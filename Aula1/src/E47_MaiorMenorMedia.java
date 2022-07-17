
public class E47_MaiorMenorMedia {

	public static void main(String[] args) {
		int matriz[][] = new int[5][3];
		int matriz2[][] = new int[5][3];
		int somatoria = 0;
		int numeromaior = Integer.MIN_VALUE;
		int numeromenor = Integer.MAX_VALUE;
		int numeromaior2 = Integer.MIN_VALUE;
		int numeromenor2 = Integer.MAX_VALUE;
		int maiorcasa = 0;
		int menorcasa = 0;
		matriz[0][0] = 2100;
		matriz[1][0] = 1050;
		matriz[2][0] = 3200;
		matriz[3][0] = 4300;
		matriz[4][0] = 5400;
		matriz[0][1] = 1;
		matriz[1][1] = 2;
		matriz[2][1] = 3;
		matriz[3][1] = 4;
		matriz[4][1] = 5;
		matriz[0][2] = 7260000;
		matriz[1][2] = 7350000;
		matriz[2][2] = 7150000;
		matriz[3][2] = 4500000;
		matriz[4][2] = 5500000;

		for (int i = 0; i < 5; i++) {

			if (matriz[i][2] < numeromenor) {
				numeromenor = matriz[i][2];
			}
			System.out.println(matriz[i][0]);
			System.out.println(matriz[i][2]);
		}

		int contador = 0;
		for (int i = 0; i < 5; i++) {
			somatoria = somatoria + matriz[i][2];
			if (matriz[i][2] > numeromaior) {
				numeromaior = matriz[i][2];
				matriz2[i][1] = matriz[i][1];
				contador = i;

			}

		}

		for (int i = 0; i < 5; i++) {
			if (matriz[i][1] > numeromaior2) { // aqui pergunto qual quarto é maior
				maiorcasa = matriz[i][0]; // aqui salvo a largura do quarto maior
				numeromaior2 = matriz[i][1]; // Aqui ele tá atualiando a variavel numeromaior2 para funcionar
			}
			if (matriz[i][1] < numeromenor2) {
				menorcasa = matriz[i][0];
				numeromenor2 = matriz[i][1];
			}
		}

		System.out.println("A subtração de " + maiorcasa + " menos " + menorcasa + " da " + (maiorcasa - menorcasa));
		System.out.println("A casa mais cara tem " + matriz[contador][1] + " quartos");
		System.out.println("A casa mais barata tem " + numeromenor + " Reaias");
		System.out.println("A média é " + somatoria / 5 + " Reais");
	}
}