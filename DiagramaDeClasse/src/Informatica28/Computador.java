package Informatica28;

public class Computador {
private int ram;
private int armazenamento;
private boolean temTeclado;
int RAMM;
int arm;
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getArmazenamento() {
	return armazenamento;
}
public void setArmazenamento(int armazenamento) {
	this.armazenamento = armazenamento;
}
public boolean isTemTeclado() {
	return temTeclado;
}
public void setTemTeclado(boolean temTeclado) {
	this.temTeclado = temTeclado;
}
public int getRAMM() {
	return RAMM;
}
public void setRAMM(int RAMM) {
	this.RAMM = RAMM;
}
public int getArm() {
	return arm;
}
public void setArm(int arm) {
	this.arm = arm;
}
public int getTudo() {
	return getRam()+getRAMM();
}
public int getTudor() {
	return getArmazenamento()+getArm();
}
public void aumentarRam() {
	
	System.out.println("Sua memoria RAM de "+getRam()+" foi para "+(getRam()+getRAMM())+" GB");
}
public void aumentarArmazenamento() {
	
	System.out.println("Seu armazenamento foi de "+getArmazenamento()+ " foi para "+(getArmazenamento()+getArm()+" de espaço"));
	
}
}
