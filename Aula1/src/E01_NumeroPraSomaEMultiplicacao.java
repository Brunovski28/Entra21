import java.util.Scanner;
public class E01_NumeroPraSomaEMultiplicacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		double n1, n2, n3;
		System.out.println("Qual o primeiro n�mero para soma");
		n1 = entrada.nextDouble();
		
		System.out.println("Qual o segundo n�mero para soma");
		n2 = entrada.nextDouble();
				
		System.out.println("Qual o terceiro n�mero para multiplica��o");
		n3 = entrada.nextDouble();
		
		System.out.println("Resultado �: "+((n1+n2)*n3));
	}

}
