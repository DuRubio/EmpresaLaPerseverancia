package ar.edu.unlam.pb2;

public class Gerente extends PlantaPermanente{
	
	private Double valorHora =4000.0;
	private  Integer valorAntiguedad = 1500;
	
	
	public Gerente(Integer nHoras, Boolean esCasado, Integer nHijos, Integer antiguedad) {
		super(nHoras, esCasado, nHijos, antiguedad);
		super.setVALOR_HORA(valorHora );
		super.setVALOR_ANTIGUEDAD(valorAntiguedad);
	}
		
}