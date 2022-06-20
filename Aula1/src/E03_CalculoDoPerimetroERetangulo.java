import java.util.Scanner;
public class E03_CalculoDoPerimetroERetangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double area, largura, perimetro, altura;
		System.out.println("Qual a largura");
		largura = entrada.nextDouble();
		System.out.println("Qual a altura");
		altura = entrada.nextDouble();

		area = largura * altura;
		perimetro = ((largura*2)+(2*altura));
		
		System.out.println("O a área do retângulo é "+area+" e seu perímetro "+perimetro);
	}
	
	
	
}
