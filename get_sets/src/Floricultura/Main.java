package Floricultura;

public class Main {

	public static void main(String[] args) {
		Floricultura flor1 = new Floricultura("Vermelha", 24.99, "Bruno", true, false);
		Floricultura flor2 = new Floricultura("Verde", 20.00, "Fulano", true, true);
		Floricultura flor3 = new Floricultura("Azul", 15.00, "Ciclano", true, true);
		Floricultura flor4 = new Floricultura("Amarela", 23.00, "Butano", false, false);
		Floricultura flor5 = new Floricultura("Branca", 18.00, "Hexano", false, false);
		Floricultura vetor[] = new Floricultura[5];
		vetor[0] = flor1;
		vetor[1] = flor2;
		vetor[2] = flor3;
		vetor[3] = flor4;
		vetor[4] = flor5;
		
		if (flor1.preco > flor2.preco && flor1.preco > flor3.preco && flor1.preco > flor4.preco && flor1.preco > flor5.preco) {
			System.out.println("Bruno comprou a flor mais cara");
			System.out.println("Flor vermelha é mais cara");
		} else if (flor2.preco > flor1.preco && flor2.preco > flor3.preco && flor2.preco > flor4.preco && flor2.preco > flor5.preco) {
			System.out.println("Fulano comprou a flor mais cara");
			System.out.println("Flor verde é mais cara");
		}  else if (flor3.preco > flor1.preco && flor3.preco > flor2.preco && flor3.preco > flor4.preco && flor3.preco > flor5.preco) {
			System.out.println("Ciclano comprou a flor mais cara");
			System.out.println("Flor azul é mais cara");
		}  else if (flor4.preco > flor1.preco && flor4.preco > flor2.preco && flor4.preco > flor3.preco && flor4.preco > flor5.preco) {
			System.out.println("Butano comprou a flor mais cara");
			System.out.println("Flor amarela é mais cara");
		}  else if (flor5.preco > flor1.preco && flor5.preco > flor2.preco && flor5.preco > flor3.preco && flor5.preco > flor4.preco) {
			System.out.println("Hexano comprou a flor mais cara");
			System.out.println("Flor branca é mais cara");
		}
		if (flor1.comprada == true) {
			System.out.println("Flor vermelha foi comprada");
		} else {
			System.out.println("Flor vermelha não foi comprada");
		}
		if (flor2.comprada == true) {
			System.out.println("Flor verde foi comprada");
		} else {
			System.out.println("Flor verde não foi comprada");
		}
		if (flor3.comprada == true) {
			System.out.println("Flor azul foi comprada");
		} else {
			System.out.println("Flor azul não foi comprada");
		}
		if (flor4.comprada == true) {
			System.out.println("Flor amarela foi comprada");
		} else {
			System.out.println("Flor amarela não foi comprada");
		}
		if (flor1.comprada == true) {
			System.out.println("Flor branca foi comprada");
		} else {
			System.out.println("Flor branca não foi comprada");
		}
	}

}
