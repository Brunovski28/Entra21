package Animais;

public class Pato extends Animal{
String raca;

public Pato(String raca) {

	this.raca = raca;

}
public String getRaca() {
	return raca;
}
public void setRaca(String raca) {
	this.raca = raca;
}

public void barulho() {
	System.out.println("quack quack");
}
}
