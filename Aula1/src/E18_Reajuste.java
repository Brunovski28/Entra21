import java.util.Scanner;

public class E18_Reajuste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		double ms, sa, sa1, sa2;
		
		
		System.out.println("Quantos meses que o funcionário foi admitido?");
		ms = entrada.nextDouble();
		
		System.out.println("Qual o salário atual?");
		sa = entrada.nextDouble();
		
		if (ms > 0 && ms <= 12) {
			sa1 = sa * 0.05;
			sa2 = sa + sa1;
			System.out.println("Senhor teve um reajuste de 5%, seu salário de "+sa+" passou para "+sa2);
		} else if (ms >12 && ms <49) {
			sa1 = sa * 0.07;
			sa2 = sa + sa1;
			System.out.println("Senhor teve um reajuste de 7%, seu salário de "+sa+" passou para "+sa2);
		} else {
			System.out.println("Aposentado");
		}
		
		
	}

}
