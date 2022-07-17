package EmpresaPotente;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa{
private double cargaHoraria;
private double salario;
private double carga;
public Funcionario(String nome, String id, Endereco endereco, LocalDate dataIngresso, LocalDate dataNasc,
		double cargaHoraria, double salario) {
	super(nome, id, endereco, dataIngresso, dataNasc);
	this.cargaHoraria = cargaHoraria;
	this.salario = salario;
}
public double getCargaHoraria() {
	return cargaHoraria;
}
public void setCargaHoraria(double cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public void aumentarCarga() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Quantos % ?");
	double porcento = entrada.nextInt();
	double carga = (getCargaHoraria() * ((porcento/100) + 1));
	System.out.println("A nova carga: " + carga);
}
public void demitir() {
	setSalario(0);
	setId("Demitido!");
	System.out.println("Salario: "+getSalario());
	System.out.println(getId());
}
public double getCarga() {
	return carga;
}
public void setCarga(double carga) {
	this.cargaHoraria = carga;
}
}
