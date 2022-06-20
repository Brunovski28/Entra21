package Empresa;

public class Chefe extends Trabalhador{
private int quantSubordinados;

public Chefe(int quantSubordinados) {
	this.quantSubordinados = quantSubordinados;
}

public int getQuantSubordinados() {
	return quantSubordinados;
}

public void setQuantSubordinados(int quantSubordinados) {
	this.quantSubordinados = quantSubordinados;
}

public void dobrarSalario() {
	this.setSalario(getSalario() * 2);
	System.out.println("Seu salario agora é "+this.getSalario());
}
}
