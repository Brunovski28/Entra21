package Animais;

public class Gaviao extends Animal{
String raca;

public Gaviao(String raca) {
	
	this.raca = raca;

}
public String getRaca() {
	return raca;
}
public void setRaca(String raca) {
	this.raca = raca;
}

public void barulho() {
	System.out.println("UAAAAAAAAAAAAAAAAAAAAAAAAAAA");
}
}
