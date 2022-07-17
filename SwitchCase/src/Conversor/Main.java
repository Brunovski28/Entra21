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
					System.out.println("Pra qual você quer converter?\n1 - Fahrenheit\n2 - Kelvin");
					int conv = entrada.nextInt();
					switch (conv) {
					case 1:
						System.out.println("Celsius? ");
						double num1 = entrada.nextInt();
						System.out.println("Fahrenheit: " + (9 * num1 + 160) / 5 + "°F");
						break;
					case 2:
						System.out.println("Celsius? ");
						double num2 = entrada.nextDouble();
						System.out.println("Kelvin: " + (num2 + 273.15) + "°K");
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual você quer converter?\n1 - Celsius\n2 - Kelvin");
					int temp2 = entrada.nextInt();
					switch (temp2) {
					case 1:
						System.out.println("Fahrenheit? ");
						double fah = entrada.nextDouble();
						System.out.println("Celsius: " + (fah - 32) * 5 / 9 + "°C");
						break;
					case 2:
						System.out.println("Fahrenheit?");
						double fah2 = entrada.nextDouble();
						System.out.println("Kelvin: " + ((fah2 - 32) * 5 / 9 + 273.15) + "°K");
					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual você quer converter?\n1 - Celsius\n2 - Fahrenheit");
					int temp3 = entrada.nextInt();
					switch (temp3) {
					case 1:
						System.out.println("Kelvin? ");
						double kelv = entrada.nextDouble();
						System.out.println("Celsius: " + (kelv - 273.15) + "°C");
						break;
					case 2:
						System.out.println("Kelvin? ");
						double kelv2 = entrada.nextDouble();
						System.out.println("Fahrenheit: " + (((kelv2 - 273.15) * 1.8) + 32) + "°F");
					default:
						break;
					}
				default:
					break;
				}
				break;
			case 2:
				System.out.println("Qual tipo de peso você quer?\n1 - Quilos\n2 - Libras\n3 - Onças");
				int num4 = entrada.nextInt();
				switch (num4) {
				case 1:
					System.out.println("Pra qual quer converter?\n1 - Libras\n2 - Onças");
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
						System.out.println("Onça: " + (num253 * 35.274));
						break;
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual quer converter?\n1 - Quilos\n2 - Onças");
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
						System.out.println("Onças: " + (libra2 * 16));
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
						System.out.println("Onças: ");
						double onca = entrada.nextDouble();
						System.out.println("Quilos: " + (onca / 35.274));
						break;
					case 2:
						System.out.println("Onças: ");
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
				System.out.println("Qual tipo de medida você quer?\n1 - Metros\n2 - Pés\n3 - Polegadas");
				int edbh = entrada.nextInt();
				switch (edbh) {
				case 1:
					System.out.println("Pra qual você quer converter?\n1 - Pés\n2 - Polegadas");
					int fn = entrada.nextInt();
					switch (fn) {
					case 1:
						System.out.println("Metros: ");
						double metros = entrada.nextDouble();
						System.out.println("Pés: " + (metros * 3.281));
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
					System.out.println("Pra qual você quer converter?\n1 - Metros\n2 - Polegadas");
					int rg = entrada.nextInt();
					switch (rg) {
					case 1:
						System.out.println("Pés: ");
						double pes = entrada.nextDouble();
						System.out.println("Metros: " + (pes / 3.281));
						break;
					case 2:
						System.out.println("Pés: ");
						double pess = entrada.nextDouble();
						System.out.println("Polegadas: " + (pess * 12));
						break;

					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual você quer converter?\n1 - Metros\n2 - Pés");
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
						System.out.println("Pés: " + (polegadass / 12));
						break;
					default:
						break;
					}
				default:
					break;
				}
				break;
			case 4:
				System.out.println("Qual tipo de volume você quer?\n1 - Litros\n2 - Galão\n3 - Onças líquidas");
				int bcv = entrada.nextInt();
				switch (bcv) {
				case 1:
					System.out.println("Pra qual você quer converter?\n1 - Galão\n2 - Onças líquidas");
					int kf = entrada.nextInt();
					switch (kf) {
					case 1:
						System.out.println("Litros: ");
						double litros = entrada.nextDouble();
						System.out.println("Galão: " + (litros / 3.785));
						break;
					case 2:
						System.out.println("Litros: ");
						double litross = entrada.nextDouble();
						System.out.println("Onças líquidas: " + (litross * 33.814));
						break;
					default:
						break;
					}
					break;
				case 2:
					System.out.println("Pra qual você quer converter?\n1 - Litros\n2 - Onças líquidas");
					int kk = entrada.nextInt();
					switch (kk) {
					case 1:
						System.out.println("Galão: ");
						double galao = entrada.nextDouble();
						System.out.println("Litros: " + (galao * 3.785));
						break;
					case 2:
						System.out.println("Galão: ");
						double galao2 = entrada.nextDouble();
						System.out.println("Onças líquidas: " + (galao2 * 128));
						break;
					default:
						break;
					}
					break;
				case 3:
					System.out.println("Pra qual você quer converter?\n1 - Litros\n2 - Galão");
					int kkc = entrada.nextInt();
					switch (kkc) {
					case 1:
						System.out.println("Onça líquida: ");
						double galao = entrada.nextDouble();
						System.out.println("Litros: " + (galao / 33.814));
						break;
					case 2:
						System.out.println("Onças líquidas: ");
						double galao2 = entrada.nextDouble();
						System.out.println("Galão: " + (galao2 / 128));
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
