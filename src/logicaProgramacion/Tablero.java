package logicaProgramacion;

public class Tablero {
	int numeroColumnas;
	int numeroFilas;
	
	public Tablero(int numeroColumnas, int numeroFilas) {
		this.numeroColumnas = numeroColumnas;
		this.numeroFilas = numeroFilas;
	}
	
	public int getNumeroColumnas() {
		return(this.numeroColumnas);
	}
	
	public int getNumeroFilas() {
		return(this.numeroFilas);
	}
	
	public void getInformacion() {
		System.out.println("C F");
		System.out.println(this.numeroColumnas + " " + this.numeroFilas);
	}
	
	@Override
	public boolean equals(Object object) {
		Tablero tablero = (Tablero)object;
		
		return ((this.getNumeroColumnas() == tablero.getNumeroColumnas()) && (this.getNumeroFilas() == tablero.getNumeroFilas()));
	}
}
