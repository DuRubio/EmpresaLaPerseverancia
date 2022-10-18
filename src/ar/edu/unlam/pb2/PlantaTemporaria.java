package ar.edu.unlam.pb2;

public class PlantaTemporaria extends Empleado{
	private  Double valorHora=2000.0;
	
	
	public PlantaTemporaria(Integer nHoras, Boolean esCasado, Integer nHijos) {
		super(nHoras, esCasado, nHijos);
		super.setVALOR_HORA(valorHora);
	}
	

	
}
