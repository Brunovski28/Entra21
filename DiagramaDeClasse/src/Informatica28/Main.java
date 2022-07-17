package Informatica28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Computador\nNotebook\nSmartphone");
		System.out.println("Você tem qual bagui eletronico?");
		String eletro = entrada.next();
		boolean temTeclado = false;
		if (eletro.equalsIgnoreCase("Computador")) {
			Computador computer = new Computador();
			System.out.println("Quanto de ram tem a bomba?");
			int ram = entrada.nextInt();
			System.out.println("Quanto de armazenamento tem a bomba?");
			int armazenamento = entrada.nextInt();
			System.out.println("Tem teclado?");
			String SN = entrada.next();
			if (SN.equalsIgnoreCase("Sim")) {
				temTeclado = true;
			} else {
				temTeclado = false;
			}
			computer.setArmazenamento(armazenamento);
			computer.setRam(ram);
			System.out.println("Você quer aumentar a memoria RAM do seu PC?");
			String SNR = entrada.next();
			if (SNR.equalsIgnoreCase("sim")) {
				System.out.println("Quanto?");
				int RAMR = entrada.nextInt();
				computer.setRAMM(RAMR);
				computer.aumentarRam();
			} else {
				System.out.println("Ok, permaneceu com " + computer.getRam() + "GB de ram");
			}
			System.out.println("Você deseja aumentar o espaço de armazenamento?");
			String SNRR = entrada.next();
			if (SNRR.equalsIgnoreCase("sim")) {
				System.out.println("Quanto deseja?");
				int qtdar = entrada.nextInt();
				computer.setArm(qtdar);
				computer.aumentarArmazenamento();
			} else {
				System.out.println("Ok, seu armazenamento permaneceu " + computer.getArmazenamento() + " de espaço");
			}
			System.out.println(
					"--------------------------------------------------------------------------------------------------------------------------------");
			if (temTeclado == true) {
				System.out.println("Sua máquina e seus periféricos\n" + computer.getTudo() + " GB de RAM\n"
						+ computer.getTudor() + " GB de armazenamento\nTem teclado");
			} else {
				System.out.println("Sua máquina e seus periféricos\n" + computer.getTudo() + " GB de RAM\n"
						+ computer.getTudor() + " GB de armazenamento\nNãotem teclado");
			}
		} else if (eletro.equalsIgnoreCase("Notebook")) {
			
			System.out.println("Tem quantos KG's seu notebook?");
			int peso = entrada.nextInt();
			Notebook note = new Notebook(peso);
			if (note.ehPesado() == true) {
				System.out.println("Notebook gordin");
			} else {
				System.out.println("Notebook levin");
			}
			
		} else if (eletro.equalsIgnoreCase("Smartphone")) {
			int selfiestotal = 0;
			while(true) {
				System.out.println("Você quer tirar Selfie?");
				String SN = entrada.next();
				if (SN.equalsIgnoreCase("Sim")) {
					System.out.println("Quantas selfies você quer tirar?");
					int numselfie = entrada.nextInt();
					Smartphone smart = new Smartphone(numselfie);
					selfiestotal += numselfie;
					smart.tirarSelfies();
				} else {
					break;
				}
			}
			System.out.println("Seu celular ficou com "+selfiestotal+" fotos no total");
		} else {
			System.out.println("Não existe isso não doidão\n   No meu programa n hehe");
		}

	}

}
