import java.util.Scanner;

public class E31_Vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade[] = new int[5];
		int i = 0;
		
		idade [0] = 41; 
		idade [1] = 42;
		idade [2] = 39;
		idade [3] = 40;
		idade [4] = 32;
		
		while (i < idade.length) {
			System.out.println("A idade é "+ (idade[i]));
			
			i++;
		}

	}

}
