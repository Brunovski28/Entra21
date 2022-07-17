package Animais;

public class Gato extends Animal{
String raca;

public Gato(String raca) {
	
	this.raca = raca;
}
public String getRaca() {
	return raca;
}
public void setRaca(String raca) {
	this.raca = raca;
}
public void barulho() {
	System.out.println("miauu");
}
}
