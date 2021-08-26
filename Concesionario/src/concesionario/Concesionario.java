package concesionario;

import java.util.ArrayList;

public class Concesionario {
	private ArrayList<Vehiculo> listadoVehiculos;

	public Concesionario() {
		listadoVehiculos = new ArrayList<>();
	}

	public void nuevoVehiculo(Vehiculo vehiculo) {
		this.listadoVehiculos.add(vehiculo);
	}

	public void quitarVehiculo(int numVehiculo) {
		this.listadoVehiculos.remove(numVehiculo);
	}

	public boolean hayVehiculos() {
		return listadoVehiculos.size() > 0;
	}

	public int totalVehiculos() {
		return listadoVehiculos.size();
	}

	public void listarVehiculos() {
		System.out.println("Listado de veh�culos:\n");
		for (int i = 0; i < listadoVehiculos.size(); i++) {
			System.out.println("N� Veh�culo: " + (i + 1) + "\t" + listadoVehiculos.get(i).toString());
		}
		System.out.println("------------");
	}
}
