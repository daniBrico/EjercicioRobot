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
	
	public boolean fueraDeRango(int posicionX, int posicionY, char orientacionActual, int moverCantCasilleros) {
		boolean fueraDeRango=true;
		
		switch(orientacionActual) {
			case 'N':{
				if((posicionY+moverCantCasilleros) > this.numeroFilas) {
					fueraDeRango=false;
				}
			}break;
			
			case 'S':{
				if((posicionY-moverCantCasilleros) < 1) {
					fueraDeRango=false;
				}
			}break;
			
			case 'E':{
				if((posicionX+moverCantCasilleros) > this.numeroColumnas) {
					fueraDeRango=false;
				}
			}break;
			
			case 'O':{
				if((posicionX-moverCantCasilleros) < 1) {
					fueraDeRango=false;
				}
			}break;
		}
		
		return(fueraDeRango);
	}
	
	@Override
	public boolean equals(Object object) {
		Tablero tablero = (Tablero)object;
		
		return ((this.getNumeroColumnas() == tablero.getNumeroColumnas()) && (this.getNumeroFilas() == tablero.getNumeroFilas()));
	}
	
//	public void getInformacion() {
//		System.out.println("C F");
//		System.out.println(this.numeroColumnas + " " + this.numeroFilas);
//	}
}
