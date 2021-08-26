package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import concesionario.*;

public class ConcesionarioTest {
	Concesionario concesionario = new Concesionario();

	@Before
	public void setListaVehiculos() throws Exception {
		// setear lista vehiculos
		concesionario.nuevoVehiculo(new Coche("Opel", "Astra", 2000, 200, 5));
		concesionario.nuevoVehiculo(new Moto("Harley", "Davinson", 2000, 200, 600));
		concesionario.nuevoVehiculo(new Vehiculo("Mountainbike", "Orbea", 0, 0));
	}

	@Test
	public void testHayVehiculos() {
		boolean resultadoReal = concesionario.hayVehiculos();
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testTotalVehiculos() {
		int resultadoReal = concesionario.totalVehiculos();
		int resultadoEsperado = 3;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testQuitarVehiculo1() throws Exception {
		try {
			concesionario.quitarVehiculo(1);
		} catch (Exception e) {
			throw new Exception("No se ha podido retirar el vehículo");
		}
	}
	
	@Test
	public void testQuitarVehiculo2() throws Exception {
		try {
			concesionario.quitarVehiculo(4000);
		} catch (Exception e) {
			throw new Exception("No se ha podido retirar el vehículo");
		}
	}
	@Test
	public void testListarVehiculos() throws Exception {
		if(concesionario.hayVehiculos()) {
			concesionario.listarVehiculos();
		}else {
			throw new Exception("No hay vehículos disponibles");
		}
	}
}
