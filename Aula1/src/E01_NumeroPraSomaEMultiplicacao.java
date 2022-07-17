import java.util.Scanner;
public class E01_NumeroPraSomaEMultiplicacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		double n1, n2, n3;
		System.out.println("Qual o primeiro número para soma");
		n1 = entrada.nextDouble();
		
		System.out.println("Qual o segundo número para soma");
		n2 = entrada.nextDouble();
				
		System.out.println("Qual o terceiro número para multiplicação");
		n3 = entrada.nextDouble();
		
		System.out.println("Resultado é: "+((n1+n2)*n3));
	}

}
