package Void06;

public class Metodo {
public String calc(int largura, int altura) {
	
	int perimetro = ((largura*2)+(2*altura));
	int area = largura*altura;
	String str = "";
	str = ("O per�metro � "+perimetro+" e a area � "+area);
	return str;
}
}
