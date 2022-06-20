package teste;

import java.util.Scanner;

class Teste2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		double n1, n2;
		
		System.out.println("Qual o primeiro número");
		n1 = entrada.nextDouble();
		
		System.out.println("Qual o segundo número");
		n2 = entrada.nextDouble();
		

if (n1 == n2){
	System.out.print("Os números são iguais");
} else {
	System.out.print("Os números não são iguais");
}
	}

}
