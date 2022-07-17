package Informatica28;

public class Smartphone extends Computador{
private int selfies;

public Smartphone(int selfies) {
	
	this.selfies = selfies;
}

public int getSelfies() {
	return selfies;
}

public void setSelfies(int selfies) {
	this.selfies = selfies;
}
public void tirarSelfies() {
	System.out.println("Você tirou "+getSelfies()+" selfies");
}
}
