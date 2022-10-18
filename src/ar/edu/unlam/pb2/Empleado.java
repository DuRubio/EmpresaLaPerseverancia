package ar.edu.unlam.pb2;

public class Empleado {

	private Integer cantidadHorasTrabajadas;
	private Boolean tieneEsposa=false;
	private Integer cantidadHijos;
	private static Double VALOR_HIJO=200.0;
	private static  Double VALOR_ESPOSA = 100.0;
	private  Double valorHora=0.0;
	
	public Empleado (Integer nHoras, Boolean esCasado, Integer nHijos) {
		this.cantidadHorasTrabajadas=nHoras;
		this.tieneEsposa=esCasado;
		this.cantidadHijos = nHijos;
		
	}
	
	public Double getSueldo() {
		Double sueldo= getVALOR_HORA()*getCantidadHorasTrabajadas()+ calcularPlusFamiliar(); ;
		return sueldo;
	}
	
	public Double calcularPlusFamiliar () {
		Double plusFamiliar=0.0;
		if(getTieneEsposa()) plusFamiliar = this.getVALOR_ESPOSA();
		plusFamiliar += getCantidadHijos()*getVALOR_HIJO();
		return plusFamiliar;
	}
	
	
	
	public  Double getVALOR_HORA() {
		return valorHora;
	}

	public void setVALOR_HORA(Double vALOR_HORA) {
		valorHora = vALOR_HORA;
	}

	public Integer getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}


	public void setCantidadHorasTrabajadas(Integer cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}


	public Boolean getTieneEsposa() {
		return tieneEsposa;
	}


	public void setTieneEsposa(Boolean tieneEsposa) {
		this.tieneEsposa = tieneEsposa;
	}


	public Integer getCantidadHijos() {
		return cantidadHijos;
	}


	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}



	public Double getVALOR_HIJO() {
		return VALOR_HIJO;
	}


	public Double getVALOR_ESPOSA() {
		return VALOR_ESPOSA;
	}

	

	
}
