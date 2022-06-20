package teste;

import java.util.Scanner;

public class Teste28 {
public static void main(String[] args) {
	
	Scanner BS = new Scanner(System.in);
	int numero;
	int fatorial = 1;
	int i = 1;
	System.out.println("Qual número para fatoração");
	numero = BS.nextInt();
	while(i<=numero) {
		fatorial *=i; //a fatoração salva o numero q vai multiplicando, tipo 1 x 1 = 1; 1 x 2 = 2; 2 x 3 = 6; 6 x 4 = 24;
		
		i++;
	}
	System.out.println(fatorial);
	
}

}
