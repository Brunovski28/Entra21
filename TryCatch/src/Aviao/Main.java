package Aviao;

public class Main {

	public static void main(String[] args) {
		Aeronave superTucano = new Aeronave(2, 600, 1725, 10);
		Aeronave tucano = new Aeronave(1, 450, 1300, 7);
		Aeronave f15 = new Aeronave(2, 2575, 2200, 40);

		int vetor1[] = new int[3];
		int vetor2[] = new int[3];
		for (int i = 0; i < 3; i++) {
			vetor1[i] = Aeronave.lista.get(i).getCapacidadecombustivel() / Aeronave.lista.get(i).getQueimacombustivel();
		}
		for (int i = 0; i < 3; i++) {
			vetor2[i] = (Aeronave.lista.get(i).getCapacidadecombustivel() / Aeronave.lista.get(i).getQueimacombustivel())*Aeronave.lista.get(i).getVelomaxima();
		}
		int maior = Integer.MIN_VALUE;
		int id = 0;
		int passageiro = Integer.MIN_VALUE;
		String aviao;
		for (int i = 0; i < vetor1.length; i++) {
			if (vetor1[i] > maior) {
				maior = vetor1[i];
				id = i;
			}
		}
		if (id==0) {
			System.out.println("SuperTucano pode sobrevoar por mais tempo por "+maior+" minutos.");
		} else if (id==1) {
			System.out.println("Tucano pode sobrevoar por mais tempo por "+maior+" minutos.");
		} else if (id==2) {
			System.out.println("F15 pode sobrevoar por mais tempo por "+maior+" minutos.");
		}
		for (int i = 0; i < vetor1.length; i++) {
			if (Aeronave.lista.get(i).getPassageiros() > passageiro) {
				passageiro = i;
			}
		}
		if (passageiro==0) {
			System.out.println("SuperTucano tem mais passageiros.");
		} else if (passageiro==1) {
			System.out.println("Tucano tem mais passageiros.");
		} else if (passageiro==2) {
			System.out.println("F15 tem mais passageiros.");
		}
		int maiorr = Integer.MIN_VALUE;
		int idd = 0;
		for (int i = 0; i < vetor2.length; i++) {
			if (vetor2[i] > maiorr) {
				maiorr = vetor2[i];
				idd = i;
			}
		}
		if (idd==0) {
			System.out.println("SuperTucano pode ir mais longe por "+maiorr/1000+"Km's");
		} else if (idd==1) {
			System.out.println("Tucano pode ir mais longe por "+maiorr/1000+"Km's");
		} else if (idd==2) {
			System.out.println("F15 pode ir mais longe por "+maiorr/1000+"Km's");
		}
	}
	
}
