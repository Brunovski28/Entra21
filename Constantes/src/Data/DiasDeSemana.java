package Data;

import java.time.LocalDate;

public enum DiasDeSemana {

	
Domingo(1), Segunda(2), Terca(3), Quarta(4), Quinta(5), Sexta(6), Sabado(7);
	
	final int numero;


	private DiasDeSemana(int numero) {
		this.numero = numero;
		
	}
	

}
