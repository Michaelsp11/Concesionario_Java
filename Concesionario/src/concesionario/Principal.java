package concesionario;

import Util.Util;

/**
 *
 * @author MichaelSP
 */
public class Principal {
	static Concesionario concesionario = new Concesionario();

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido!");
		int accion = 0;
		do {
			accion = seleccionaAccion();
			if (accion != 4) {
				realizarAccion(accion);
			}
		} while (accion < 4);
		System.out.println("Hasta pronto!");
	}

	public static int seleccionaAccion() {
		int opcion = 0;
		do {
			System.out.println("Que acción desea realizar?");
			System.out.println("1. Introducir vehiculo");
			System.out.println("2. Quitar vehiculo");
			System.out.println("3. Listado de vehiculos");
			System.out.println("4. Salir");
			opcion = Util.pedirInt("Escoge una opción: ");
			if (opcion < 1 || opcion > 4) {
				System.out.println("Opción erronia!!");
			}
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}

	public static void realizarAccion(int accion) {
		switch (accion) {
		case 1:
			int tipo = seleccionarTipoVehiculo();
			Vehiculo vehiculo = introducirDatosGenerales();
			if (tipo == 1) {
				Coche coche = vehiculo.getCoche(vehiculo);
				coche = introducirDatosCoche(coche);
				concesionario.nuevoVehiculo(coche);
			} else {
				Moto moto = vehiculo.getMoto(vehiculo);
				moto = introducirDatosMoto(moto);
				concesionario.nuevoVehiculo(moto);
			}
			System.out.println("Vehiculo agregado correctamente!");
			break;
		case 2:
			if (concesionario.hayVehiculos()) {
				int numeroVehiculoAQuitar;
				do {
					concesionario.listarVehiculos();
					numeroVehiculoAQuitar = introducirVehiculoAQuitar();
					if(numeroVehiculoAQuitar < 0 || numeroVehiculoAQuitar >= concesionario.totalVehiculos() + 1) {
						System.out.println("Introduce un número de vehiculo válido!");
					}
				} while (numeroVehiculoAQuitar < 0 || numeroVehiculoAQuitar >= concesionario.totalVehiculos() + 1);
				concesionario.quitarVehiculo(numeroVehiculoAQuitar - 1);
				System.out.println("Vehiculo quitado correctamente!");
			} else {
				System.out.println("Actualmente, no hay vehiculos en el concesionario!");
			}
			break;
		case 3:
			if (concesionario.hayVehiculos()) {
				concesionario.listarVehiculos();
			} else {
				System.out.println("Actualmente, no hay vehiculos en el concesionario!");
			}
			break;
		default:
			System.out.println("Acción no disponible!!");
			break;
		}
	}

	public static int seleccionarTipoVehiculo() {
		int tipo = 0;
		do {
			System.out.println("Que tipo de vehiculo es?");
			System.out.println("1. Coche");
			System.out.println("2. Moto");
			tipo = Util.pedirInt("Escoge una opción: ");
			if (tipo < 1 || tipo > 2) {
				System.out.println("Opción erronia!!");
			}
		} while (tipo < 1 || tipo > 2);
		return tipo;
	}

	public static Vehiculo introducirDatosGenerales() {
		return new Vehiculo(Util.pedirString("Marca del vehículo: "), Util.pedirString("Modelo del vehículo: "),
				Util.pedirFloatPositivo("Motor del vehículo: "), Util.pedirFloatPositivo("CV del vehículo: "));
	}

	public static Coche introducirDatosCoche(Coche coche) {
		coche.numPuertas = Util.pedirIntPositivo("Número de puertas: ");
		return coche;
	}

	public static Moto introducirDatosMoto(Moto moto) {
		moto.cilindrada = Util.pedirIntPositivo("Cilindrada: ");
		return moto;
	}

	public static int introducirVehiculoAQuitar() {
		return Util.pedirInt("Vehiculo un número de vehículo: ");
	}
}