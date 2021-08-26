package concesionario;

public class Coche extends Vehiculo {
	protected int numPuertas;

	public Coche(String marca, String modelo, float motor, float cv, int numPuertas) {
		super(marca, modelo, motor, cv);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + "\tNumero de puertas: " + numPuertas + "\n";
	}

}
