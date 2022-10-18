package ar.edu.unlam.pb2;

public class PlantaPermanente extends Empleado{
	private Double valorHora=3000.0;
	private Integer valorAntiguedad = 1000;
	private Integer antiguedad;
	
	
	public PlantaPermanente (Integer nHoras, Boolean esCasado, Integer nHijos, Integer antiguedad) {
		super(nHoras, esCasado, nHijos);
		this.setAntiguedad(antiguedad); // lo mismo que this.antiguedad=antiguedad;
		super.setVALOR_HORA(valorHora);
	}
	
	@Override
	public  Double getSueldo() {
		return super.getSueldo() + getAntiguedad()*getValorAntiguedad();
	}
	
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad=antiguedad;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}
	
	
	public void setVALOR_ANTIGUEDAD(Integer valorAntiguedad) {
		this.valorAntiguedad=valorAntiguedad;
	}
	
	public Integer getValorAntiguedad() {
		return valorAntiguedad;
	}

	

	
	
}
