package Aviao;

import java.util.ArrayList;

public class Aeronave {

	private int passageiros;
	private int velomaxima;
	private int capacidadecombustivel;
	private int queimacombustivel;
	static ArrayList<Aeronave> lista = new ArrayList<>();
	public Aeronave(int passageiros, int velomaxima, int capacidadecombustivel, int queimacombustivel) {
		
		this.passageiros = passageiros;
		this.velomaxima = velomaxima;
		this.capacidadecombustivel = capacidadecombustivel;
		this.queimacombustivel = queimacombustivel;
		this.lista.add(this);
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			throw new IllegalArgumentException("Número de passageiros impossível!");
		}
		this.passageiros = passageiros;
	}
	public int getVelomaxima() {
		return velomaxima;
	}
	public void setVelomaxima(int velomaxima) {
		if (velomaxima < 100) {
			throw new IllegalArgumentException("Número de velocidade impossível!");
		}
		this.velomaxima = velomaxima;
	}
	public int getCapacidadecombustivel() {
		return capacidadecombustivel;
	}
	public void setCapacidadecombustivel(int capacidadecombustivel) {
		if (capacidadecombustivel < 100) {
			throw new IllegalArgumentException("Número da capacidade de combustivel impossivel!");
		}
		this.capacidadecombustivel = capacidadecombustivel;
	}
	public int getQueimacombustivel() {
		return queimacombustivel;
	}
	public void setQueimacombustivel(int queimacombustivel) {
		if (queimacombustivel < 1) {
			throw new IllegalArgumentException("Número da queima de combustivel impossivel!");
		}
		this.queimacombustivel = queimacombustivel;
	}
	
}
