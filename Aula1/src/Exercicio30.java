import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		int nP = 0;
		int nM = 0;
		while (n<=1000) {
			if (n%2==0) {
				nP = nP+n;
			} else {
				nM = nM+n;
			} n++;
		}
System.out.println("Número impár "+ nM + " e par "+nP);
	}

}
