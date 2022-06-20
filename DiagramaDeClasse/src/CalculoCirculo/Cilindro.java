package CalculoCirculo;

public class Cilindro extends Circulo{
double altura;

public Cilindro(String cor, double raio, double altura) {
	super(cor, raio);
	this.altura = altura;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}
public double getVolume(double volume) {
	return getArea()*altura;
}
}
