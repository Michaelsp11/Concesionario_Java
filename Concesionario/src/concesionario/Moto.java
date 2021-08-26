package concesionario;

public class Moto extends Vehiculo {
	protected int cilindrada;

	public Moto(String nombre, String modelo, float motor, float cv, int cilindrada) {
		super(nombre, modelo, motor, cv);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "\tCilindrada: " + cilindrada + "\n";
	}

}
