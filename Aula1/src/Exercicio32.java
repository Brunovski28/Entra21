import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade[] = new int[5];
		int i = 4;
		
		idade [0] = 1; 
		idade [1] = 2;
		idade [2] = 3;
		idade [3] = 4;
		idade [4] = 5;
		
		while (i < idade.length && i >= 0 ) {
			System.out.println("A idade é "+ (idade[i]));
			
			i--;
			
			
	}

 }
}