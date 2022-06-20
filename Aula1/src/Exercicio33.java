import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double idade[] = new double[5];
		int i = 0;
		double nm = -1000;
		double nme = 1000;

		idade[0] = 4;
		idade[1] = 2;
		idade[2] = 6;
		idade[3] = 1;
		idade[4] = 4;
		double media = 0;

		while (i<idade.length) {
			if (idade[i] < nme) {
				nme = idade[i];
			}
			if (idade[i] > nm) {
				nm = idade[i];
			} 

			i++;
			
		}
		media = idade[0] + idade[1] + idade[2] + idade[3] + idade[4];
			
		System.out.println("Maior elemento " + nm);
		System.out.println("Menor elemento " + nme);
		System.out.println("A média é "+media/5);
	}

}
