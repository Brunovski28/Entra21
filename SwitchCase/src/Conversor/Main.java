package Conversor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		while (true) {

			System.out.println("Quer converter o que? \n1 - Temperatura\n2 - Peso\n3 - Comprimento\n4 - Volume");
			int escolha = entrada.nextInt();
			if (escolha == 0) {
				break;
			}
			switch (escolha) {
			case 1:
				System.out.println("Qual o tipo de temperatura?\n1 - Celsius\n2 - Fahrenheit\n3 - Kelvin");
				int temp = entrada.nextInt();
				switch (temp) {
				case 1:
					System.out.println("Pra qual voc� quer converter?\n1 - Fahrenheit\n2 - Kelvin");
					int conv = entrada.nextInt();
					switch (conv) {
					case 1:
						System.out.println("Celsius? ");
						double num1 = entrada.nextInt();
						System.out.println("Fahrenheit: " + (9 * num1 + 160) / 5 + "�F");
						break;
					case 2:
						System.out.println("Celsius? ");
						double num2 = entrada.nextDouble();
						System.out.println("Kelvin: " + (num2 + 273.15) + "�K");
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual voc� quer converter?\n1 - Celsius\n2 - Kelvin");
					int temp2 = entrada.nextInt();
					switch (temp2) {
					case 1:
						System.out.println("Fahrenheit? ");
						double fah = entrada.nextDouble();
						System.out.println("Celsius: " + (fah - 32) * 5 / 9 + "�C");
						break;
					case 2:
						System.out.println("Fahrenheit?");
						double fah2 = entrada.nextDouble();
						System.out.println("Kelvin: " + ((fah2 - 32) * 5 / 9 + 273.15) + "�K");
					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual voc� quer converter?\n1 - Celsius\n2 - Fahrenheit");
					int temp3 = entrada.nextInt();
					switch (temp3) {
					case 1:
						System.out.println("Kelvin? ");
						double kelv = entrada.nextDouble();
						System.out.println("Celsius: " + (kelv - 273.15) + "�C");
						break;
					case 2:
						System.out.println("Kelvin? ");
						double kelv2 = entrada.nextDouble();
						System.out.println("Fahrenheit: " + (((kelv2 - 273.15) * 1.8) + 32) + "�F");
					default:
						break;
					}
				default:
					break;
				}
				break;
			case 2:
				System.out.println("Qual tipo de peso voc� quer?\n1 - Quilos\n2 - Libras\n3 - On�as");
				int num4 = entrada.nextInt();
				switch (num4) {
				case 1:
					System.out.println("Pra qual quer converter?\n1 - Libras\n2 - On�as");
					int es = entrada.nextInt();
					switch (es) {
					case 1:
						System.out.println("Quilo: ");
						double num254 = entrada.nextDouble();
						System.out.println("Libras: " + (num254 * 2.205));
						break;
					case 2:
						System.out.println("Quilo: ");
						double num253 = entrada.nextDouble();
						System.out.println("On�a: " + (num253 * 35.274));
						break;
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual quer converter?\n1 - Quilos\n2 - On�as");
					int dfk = entrada.nextInt();
					switch (dfk) {
					case 1:
						System.out.println("Libras: ");
						double libra = entrada.nextDouble();
						System.out.println("Quilos: " + (libra / 2.205));
						break;
					case 2:
						System.out.println("Libras: ");
						double libra2 = entrada.nextDouble();
						System.out.println("On�as: " + (libra2 * 16));
						break;
					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual quer converter?\n1 - Quilos\n2 - Libras");
					int esv = entrada.nextInt();
					switch (esv) {
					case 1:
						System.out.println("On�as: ");
						double onca = entrada.nextDouble();
						System.out.println("Quilos: " + (onca / 35.274));
						break;
					case 2:
						System.out.println("On�as: ");
						double onca2 = entrada.nextDouble();
						System.out.println("Libras: " + (onca2 / 16));
						break;
					default:
						break;
					}

				default:
					break;
				}
			case 3:
				System.out.println("Qual tipo de medida voc� quer?\n1 - Metros\n2 - P�s\n3 - Polegadas");
				int edbh = entrada.nextInt();
				switch (edbh) {
				case 1:
					System.out.println("Pra qual voc� quer converter?\n1 - P�s\n2 - Polegadas");
					int fn = entrada.nextInt();
					switch (fn) {
					case 1:
						System.out.println("Metros: ");
						double metros = entrada.nextDouble();
						System.out.println("P�s: " + (metros * 3.281));
						break;
					case 2:
						System.out.println("Metros: ");
						double metros2 = entrada.nextDouble();
						System.out.println("Polegadas: " + (metros2 * 39.37));
						break;
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual voc� quer converter?\n1 - Metros\n2 - Polegadas");
					int rg = entrada.nextInt();
					switch (rg) {
					case 1:
						System.out.println("P�s: ");
						double pes = entrada.nextDouble();
						System.out.println("Metros: " + (pes / 3.281));
						break;
					case 2:
						System.out.println("P�s: ");
						double pess = entrada.nextDouble();
						System.out.println("Polegadas: " + (pess * 12));
						break;

					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual voc� quer converter?\n1 - Metros\n2 - P�s");
					int dg = entrada.nextInt();
					switch (dg) {
					case 1:
						System.out.println("Polegadas: ");
						double polegadas = entrada.nextDouble();
						System.out.println("Metros: " + (polegadas / 39.37));
						break;
					case 2:
						System.out.println("Polegadas: ");
						double polegadass = entrada.nextDouble();
						System.out.println("P�s: " + (polegadass / 12));
						break;
					default:
						break;
					}
				default:
					break;
				}
				break;
			case 4:
				System.out.println("Qual tipo de volume voc� quer?\n1 - Litros\n2 - Gal�o\n3 - On�as l�quidas");
				int bcv = entrada.nextInt();
				switch (bcv) {
				case 1:
					System.out.println("Pra qual voc� quer converter?\n1 - Gal�o\n2 - On�as l�quidas");
					int kf = entrada.nextInt();
					switch (kf) {
					case 1:
						System.out.println("Litros: ");
						double litros = entrada.nextDouble();
						System.out.println("Gal�o: " + (litros / 3.785));
						break;
					case 2:
						System.out.println("Litros: ");
						double litross = entrada.nextDouble();
						System.out.println("On�as l�quidas: " + (litross * 33.814));
						break;
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual voc� quer converter?\n1 - Litros\n2 - On�as l�quidas");
					int kk = entrada.nextInt();
					switch (kk) {
					case 1:
						System.out.println("Gal�o: ");
						double galao = entrada.nextDouble();
						System.out.println("Litros: " + (galao * 3.785));
						break;
					case 2:
						System.out.println("Gal�o: ");
						double galao2 = entrada.nextDouble();
						System.out.println("On�as l�quidas: " + (galao2 * 128));
						break;
					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual voc� quer converter?\n1 - Litros\n2 - Gal�o");
					int kkc = entrada.nextInt();
					switch (kkc) {
					case 1:
						System.out.println("On�a l�quida: ");
						double galao = entrada.nextDouble();
						System.out.println("Litros: " + (galao / 33.814));
						break;
					case 2:
						System.out.println("On�as l�quidas: ");
						double galao2 = entrada.nextDouble();
						System.out.println("Gal�o: " + (galao2 / 128));
						break;
					default:
						break;
					}
					break;
				}

			}
		}
	}
}
