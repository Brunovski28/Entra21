import java.util.Scanner;

public class E07TrianguloAgain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a largura?");
		double largura = entrada.nextDouble();
		System.out.println("Qual a altura?");
		double altura = entrada.nextDouble();
		
		areaperimetro(largura, altura);

	}
	public static void areaperimetro(double largura, double altura) {
		double area = largura * altura;
		double perimetro = ((largura * 2)+(2*altura));
		System.out.println("A área do retangulo é "+area+" e seu perimetro "+perimetro);
	}
}
