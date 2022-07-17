package Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual dia?");
		int dia = entrada.nextInt();
		if (dia < 0 || dia > 30) {
		throw new IllegalArgumentException("Dia inválido!");
		}

		System.out.println("Qual mês");
		int mes = entrada.nextInt();
		if (mes < 1 || mes > 12) {
		throw new IllegalArgumentException("Mês inválido!");
		}
		System.out.println("Qual ano");
		int ano = entrada.nextInt();
		if (ano %4 == 0 && mes == 2) {
			if (dia < 1 || dia > 29) {
				throw new IllegalArgumentException("Fevereiro inválido!");
			}
		} else if (mes == 2) {
			if (dia < 1 && dia > 28) {
				throw new IllegalArgumentException("Fevereiro inválido!");
			} else {
				
				
			}
		}
		LocalDate data = LocalDate.of(ano, mes, dia);
		if (data.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
			System.out.println(DiasDeSemana.Segunda);
			System.out.println(DiasDeSemana.Segunda.numero);
		} else if (data.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
			System.out.println(DiasDeSemana.Terca);
			System.out.println(DiasDeSemana.Terca.numero);
		} else if (data.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) {
			System.out.println(DiasDeSemana.Quarta);
			System.out.println(DiasDeSemana.Quarta.numero);
		}else if (data.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
			System.out.println(DiasDeSemana.Quinta);
			System.out.println(DiasDeSemana.Quinta.numero);
		}else if (data.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			System.out.println(DiasDeSemana.Sexta);
			System.out.println(DiasDeSemana.Sexta.numero);
		}else if (data.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			System.out.println(DiasDeSemana.Sabado);
			System.out.println(DiasDeSemana.Sabado.numero);
		}else if (data.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println(DiasDeSemana.Domingo);
			System.out.println(DiasDeSemana.Domingo.numero);
		}
		if (data.getMonthValue() == Meses.Janeiro.numero) {
			System.out.println(Meses.Janeiro);
			System.out.println(Meses.Janeiro.numero);
		} else if (data.getMonthValue() == Meses.Fevereiro.numero) {
			System.out.println(Meses.Fevereiro);
			System.out.println(Meses.Fevereiro.numero);
		} else if (data.getMonthValue() == Meses.Marco.numero) {
			System.out.println(Meses.Marco);
			System.out.println(Meses.Marco.numero);
		} else if (data.getMonthValue() == Meses.Abril.numero) {
			System.out.println(Meses.Abril);
			System.out.println(Meses.Abril.numero);
		} else if (data.getMonthValue() == Meses.Maio.numero) {
			System.out.println(Meses.Maio);
			System.out.println(Meses.Maio.numero);
		} else if (data.getMonthValue() == Meses.Junho.numero) {
			System.out.println(Meses.Junho);
			System.out.println(Meses.Junho.numero);
		} else if (data.getMonthValue() == Meses.Julho.numero) {
			System.out.println(Meses.Julho);
			System.out.println(Meses.Julho.numero);
		} else if (data.getMonthValue() == Meses.Agosto.numero) {
			System.out.println(Meses.Agosto);
			System.out.println(Meses.Agosto.numero);
		} else if (data.getMonthValue() == Meses.Setembro.numero) {
			System.out.println(Meses.Setembro);
			System.out.println(Meses.Setembro.numero);
		} else if (data.getMonthValue() == Meses.Outubro.numero) {
			System.out.println(Meses.Outubro);
			System.out.println(Meses.Outubro.numero);
		} else if (data.getMonthValue() == Meses.Novembro.numero) {
			System.out.println(Meses.Novembro);
			System.out.println(Meses.Novembro.numero);
		} else if (data.getMonthValue() == Meses.Dezembro.numero) {
			System.out.println(Meses.Dezembro);
			System.out.println(Meses.Dezembro.numero);
		} 
		
		MetodoDia metodo = new MetodoDia(data);
		metodo.dia();
		if (metodo.dia() == true) {
			System.out.println("Final de semana");
		} else {
			System.out.println("Dia de semana");
		}
	}

}
