package teste;

import java.util.Scanner;

class Teste2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		double n1, n2;
		
		System.out.println("Qual o primeiro n�mero");
		n1 = entrada.nextDouble();
		
		System.out.println("Qual o segundo n�mero");
		n2 = entrada.nextDouble();
		

if (n1 == n2){
	System.out.print("Os n�meros s�o iguais");
} else {
	System.out.print("Os n�meros n�o s�o iguais");
}
	}

}
