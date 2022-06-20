package E07Avion;

public class Aeronave {
	int passageiros;
	double velocidademaxima;
	int capacidadecombustivel;
	int queimacombustivel;
	public Aeronave(int passageiros, double velocidademaxima, int capacidadecombustivel, int queimacombustivel) {

		setPassageiros(passageiros);//this.passageiros = passageiros;
		setVelocidademaxima(velocidademaxima);//this.velocidademaxima = velocidademaxima;
		setCapacidadecombustivel(capacidadecombustivel);//this.capacidadecombustivel = capacidadecombustivel;
		setQueimacombustivel(queimacombustivel);//this.queimacombustivel = queimacombustivel;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			this.passageiros = 0;
		} else {
		this.passageiros = passageiros;
		}
	}
	public double getVelocidademaxima() {
		return velocidademaxima;
	}
	public void setVelocidademaxima(double velocidademaxima) {
		if (velocidademaxima < 0) {
			this.velocidademaxima = 0;
		} else {
		this.velocidademaxima = velocidademaxima;
		}
	}
	public int getCapacidadecombustivel() {
		return capacidadecombustivel;
	}
	public void setCapacidadecombustivel(int capacidadecombustivel) {
	if (capacidadecombustivel < 0) {
		this.capacidadecombustivel = 0;
	} else {
		this.capacidadecombustivel = capacidadecombustivel;
	}
	}
	public int getQueimacombustivel() {
		return queimacombustivel;
	}
	public void setQueimacombustivel(int queimacombustivel) {
		if (queimacombustivel < 0) {
			this.queimacombustivel = 0;
		} else {
		this.queimacombustivel = queimacombustivel;
		}
	}
	
}
