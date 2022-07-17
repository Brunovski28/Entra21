package Animais;

public class Cachorro extends Animal{
String raca;

public Cachorro(String raca) {
	this.raca = raca;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}
public void barulho() {
	System.out.println("au au");
}
}
