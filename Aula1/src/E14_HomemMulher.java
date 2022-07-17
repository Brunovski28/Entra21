import java.util.Scanner;

public class E14_HomemMulher {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int h1, h2, m1, m2, sa, hm1, hm2, mm1, mm2, mi;
		
		System.out.println("Qual a idade do homem 1");
		h1 = entrada.nextInt();
		
		System.out.println("Qual a idade do homem 2");
		h2 = entrada.nextInt();
		
		System.out.println("Qual a idade da mulher 1");
		m1 = entrada.nextInt();
		
		System.out.println("Qual a idade da mulher 2");
		m2 = entrada.nextInt();
		
		hm1 = 0;
		hm2 = 0;
		mm1 = 0;
		mm2 = 0;
		
		
		if (h1 > h2) {
			hm1 = 1;
		} else {
			hm2 = 1;
		}
		if (m1 > m2) {
			mm1 = 1;
		} else {
			mm2 = 1;
		}
		
		if (hm1 == 1 && mm1 == 0) {
			sa = h1 + m1;
			mi = h2 * m2;
			System.out.println("A soma da idade do homem mais velho e da mulher mais nova é "+sa);
			System.out.println("A multiplicação do homem mais novo e da mulher mais velha é "+mi);
		} else if (hm2 == 0 && mm1 == 1) {
			sa = m2 + m1;
			mi = h1 * m2; 
			System.out.println("A soma da idade do homem mais velho e da mulher mais nova é "+sa);
			System.out.println("A multiplicação do homem mais novo e da mulher mais velha é "+mi);
		} else if (hm2 == 1 && mm2 == 0) {
			sa = m2 + m2;
			mi = h1 * m1; 
			System.out.println("A soma da idade do homem mais velho e da mulher mais nova é "+sa);
			System.out.println("A multiplicação do homem mais novo e da mulher mais velha é "+mi);
		} else if (hm2 == 1 && mm1 == 0 ) {
			sa = m2 + m2;
			mi = h1 * m1; 
			System.out.println("A soma da idade do homem mais velho e da mulher mais nova é "+sa);
			System.out.println("A multiplicação do homem mais novo e da mulher mais velha é "+mi);
		}
	}

}
