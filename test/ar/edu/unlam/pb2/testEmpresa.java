package ar.edu.unlam.pb2;

import org.junit.Assert;
import org.junit.Test;

public class testEmpresa {
	
	
	
	@Test
	public void queUnEmpleadoTemporalCon80hsConEsposaYSinHijosCobre160100() {
		Empleado empleadoTemporal = new PlantaTemporaria (80, true, 0);
		Double valorEsperado= 160100.0;
		Assert.assertEquals(valorEsperado, empleadoTemporal.getSueldo());
	}
	
	@Test
	public void queUnEmpleadoPermanenteCon80hsEsposaDosHijosYCuatroAniosAntiguedad() {
		Empleado empleadoPermanente = new PlantaPermanente(80, true, 2, 4);
		Double valorEsperado = 244500.0;
		Assert.assertEquals(valorEsperado, empleadoPermanente.getSueldo());
	}
	
	@Test
	public void queUnEmpleadoPermanenteCon160hsEsposaDosHijosYCuatroAniosAntiguedad() {
		Empleado empleadoPermanente = new PlantaPermanente(160, true, 1, 10);
		Double valorEsperado = 490300.0;
		Assert.assertEquals(valorEsperado, empleadoPermanente.getSueldo());
	}
	@Test
	public void queUnGerenteCon160hsEsposaDosHijosYCuatroAniosAntiguedad() {
		Empleado gerente = new Gerente(160, true, 1, 10);
		Double valorEsperado = 655300.0;
		Assert.assertEquals(valorEsperado, gerente.getSueldo());
	}
	
	@Test
	public void queSePuedaCrearUnaEmpresaConLos4Empleados() {
		Empresa JReventos = new Empresa (2037241 , "JR eventos", 4);
		Empleado empleadoTemporal = new PlantaTemporaria (80, true, 0);
		Empleado empleadoPermanente = new PlantaPermanente(80, true, 2, 4);
		Empleado empleadoPermanente2 = new PlantaPermanente(160, true, 1, 10);
		Empleado gerente = new Gerente(160, true, 1, 10);
		JReventos.agregarEmpleados(empleadoTemporal);
		JReventos.agregarEmpleados(empleadoPermanente);
		JReventos.agregarEmpleados(empleadoPermanente2);
		JReventos.agregarEmpleados(gerente);
		Integer valorEsperado = 4;
		Assert.assertEquals(valorEsperado, JReventos.getSize());
	}
	
	@Test
	public void calcularMontoTotalEmpresa() {
		Empresa JReventos = new Empresa (2037241 , "JR eventos", 4);
		
		Empleado empleadoTemporal = new PlantaTemporaria (80, true, 0);
		Empleado empleadoPermanente = new PlantaPermanente(80, true, 2, 4);
		Empleado empleadoPermanente2 = new PlantaPermanente(160, true, 1, 10);
		Empleado gerente = new Gerente(160, true, 1, 10);
		
		JReventos.agregarEmpleados(empleadoTemporal);
		JReventos.agregarEmpleados(empleadoPermanente);
		JReventos.agregarEmpleados(empleadoPermanente2);
		JReventos.agregarEmpleados(gerente);
		
		//Double valorEsperado = 894900.0; sin gerente
		Double valorEsperado2 = 1550200.0;
		Assert.assertEquals(valorEsperado2, JReventos.getMontoTotal());
	}
	@Test
	public void queHayan20empleados(){
		Empresa JReventos = new Empresa (2037241 , "JR eventos", 4);
		for(int i=0; i<20; i++) {
			Empleado empleadoTemporal = new PlantaTemporaria (80, true, 0);
			JReventos.agregarEmpleados(empleadoTemporal);
		}
		Integer valorEsperado2 = 20;
		Assert.assertEquals(valorEsperado2, JReventos.getSize());
		
	}
	
}
