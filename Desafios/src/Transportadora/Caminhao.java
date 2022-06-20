package Transportadora;

import java.time.LocalDate;
import java.util.ArrayList;

public class Caminhao {

	private String placa;
	private String modelo;
	private LocalDate DataAq;
	static ArrayList<Caminhao> lista = new ArrayList<>();
	public Caminhao(String placa, String modelo, LocalDate dataAq) {
		this.placa = placa;
		this.modelo = modelo;
		DataAq = dataAq;

		this.lista.add(this);
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa.isBlank() || placa == null || placa.length() != 8) {
			throw new IllegalArgumentException("Placa inconsistente!");
		}
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo.isBlank() || modelo == null) {
			throw new IllegalArgumentException("Modelo inconsistente!");
		}
		this.modelo = modelo;
	}
	public LocalDate getDataAq() {
		return DataAq;
	}
	public void setDataAq(LocalDate dataAq) {
		DataAq = dataAq;
	}

	
	
}
