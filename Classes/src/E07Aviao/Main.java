package E07Aviao;

public class Main {

	public static void main(String[] args) {//passageiros, veloMaxima, capacidade, queima
		Aeronave gigantesco = new Aeronave(300, 500, 600, 18);
		Aeronave gigante = new Aeronave(250, 400, 500, 11);
		Aeronave media = new Aeronave(200, 300, 400, 7);
		Aeronave pequena = new Aeronave(150, 200, 300, 3);
		
		int maisgigantesco = gigantesco.capacidadecombustivel / gigantesco.queimacombustivel;
		int maisgigante = gigante.capacidadecombustivel / gigante.queimacombustivel;
		int maismedia = media.capacidadecombustivel / media.queimacombustivel;
		int maispequena = pequena.capacidadecombustivel / pequena.queimacombustivel;
			
	double longegigantesco = (gigantesco.capacidadecombustivel / gigantesco.queimacombustivel) * gigantesco.velocidademaxima;
	double longegigante = (gigante.capacidadecombustivel / gigante.queimacombustivel) * gigante.velocidademaxima;
	double longemedia = (media.capacidadecombustivel / media.queimacombustivel) * media.velocidademaxima;
	double longepequena = (pequena.capacidadecombustivel / pequena.queimacombustivel) * pequena.velocidademaxima;

		
		if (maisgigantesco > maisgigante && maisgigantesco > maismedia && maisgigantesco > maispequena) {
			System.out.println("O avião gigantesco pode voar por mais tempo. "+maisgigantesco+" minutos.");
		} else if (maisgigante > maisgigantesco && maisgigante > maismedia && maisgigante > maispequena) {
			System.out.println("O avião gigante pode voar por mais tempo. "+maisgigante+" minutos.");
		} else if (maismedia > maisgigantesco && maismedia > maisgigante && maismedia > maispequena) {
			System.out.println("O avião médio pode voar por mais tempo. "+maismedia+" minutos.");
		} else if (maispequena > maisgigantesco && maispequena > maisgigante && maispequena > maismedia) {
			System.out.println("O avião pequeno pode voar por mais tempo. "+maispequena+" minutos.");
		} else {
			System.out.println("Deu erro");
		}
		if (gigantesco.passageiros > gigante.passageiros && gigantesco.passageiros > media.passageiros && gigantesco.passageiros > pequena.passageiros) {
			System.out.println("O avião gigantesco tem mais capacidade de passageiros."+ gigantesco.passageiros+" passageiros");
		} else if (gigante.passageiros > gigantesco.passageiros && gigante.passageiros > media.passageiros && gigante.passageiros > pequena.passageiros) {
			System.out.println("O avião gigante tem mais capacidade de passageiros");
		} else if (media.passageiros > gigantesco.passageiros && media.passageiros > gigante.passageiros && media.passageiros > pequena.passageiros) {
			System.out.println("O avião médio tem mais capacidade de passageiros");
		} else if (pequena.passageiros > gigantesco.passageiros && pequena.passageiros > gigante.passageiros && pequena.passageiros > media.passageiros) {
			System.out.println("O avião pequeno tem mais capacidade de passageiros	");
		}
		if (longegigantesco > longegigante && longegigantesco > longemedia && longegigantesco > longepequena) {
			System.out.println("O avião gigantesco consegue ir mais longe");
		} else if (longegigante > longegigantesco && longegigante > longemedia && longegigante > longepequena) {
			System.out.println("O avião gigante consegue ir mais longe");
		} else if (longemedia > longegigantesco && longemedia > longegigante && longemedia > longepequena) {
			System.out.println("O avião médio consegue ir mais longe");
		} else if (longepequena > longegigantesco && longepequena > longegigante && longepequena > longemedia) {
			System.out.println("O avião pequeno consegue ir mais longe. "+longepequena+" km's");
		}
	}
	
}
