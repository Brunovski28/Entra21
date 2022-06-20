package Empresa;

public class Funcionario extends Trabalhador{
private double cargaHoraria;
private String IdSindicato;
public Funcionario(double cargaHoraria, String idSindicato) {
	
	this.cargaHoraria = cargaHoraria;
	IdSindicato = idSindicato;
}
public double getCargaHoraria() {
	return cargaHoraria;
}
public void setCargaHoraria(double cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}
public String getIdSindicato() {
	return IdSindicato;
}
public void setIdSindicato(String idSindicato) {
	IdSindicato = idSindicato;
}
public void sairDoSindicato() {
	this.IdSindicato = "";
	System.out.println("Você saiu do sindicato!");
}
}
