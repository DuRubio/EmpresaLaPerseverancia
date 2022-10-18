package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
	private Integer cuit;
	private String razonSocial;
	private Integer cantidadEmpleados;
	private List<Empleado> empleados;
	
	public Empresa(Integer cuit, String razonSocial, Integer cantidadEmpleados) {
			this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.cantidadEmpleados = cantidadEmpleados;
		empleados= new LinkedList <>();
	}
	
	public Double getMontoTotal () {
		Double montoTotal=0.0;
		for (Empleado cadaEmpleado : empleados) {
			montoTotal += cadaEmpleado.getSueldo();
		}
		return montoTotal;
	}
	
	public Integer getCuit() {
		return cuit;
	}


	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}




	public void setCantidadEmpleados(Integer cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}


	public void agregarEmpleados (Empleado empleado) {
		empleados.add(empleado);
	}
	
	public Integer getSize() {
		return empleados.size();
	}
}
