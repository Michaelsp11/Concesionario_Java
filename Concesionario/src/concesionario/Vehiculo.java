package concesionario;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected float motor;
	protected float cv;

	public Vehiculo(String nombre, String modelo, float motor, float cv) {
		this.marca = nombre;
		this.modelo = modelo;
		this.motor = motor;
		this.cv = cv;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	public float getCv() {
		return cv;
	}

	public void setCv(float cv) {
		this.cv = cv;
	}

	public Coche getCoche(Vehiculo vehiculo) {
		return new Coche(vehiculo.marca, vehiculo.modelo, vehiculo.motor, vehiculo.cv, 0);
	}

	public Moto getMoto(Vehiculo vehiculo) {
		return new Moto(vehiculo.marca, vehiculo.modelo, vehiculo.motor, vehiculo.cv, 0);
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + "\tMarca: " + marca + "\tMotor: " + motor + "\tCV: " + cv;
	}

}
