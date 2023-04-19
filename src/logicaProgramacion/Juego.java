package logicaProgramacion;

import manejadorArchivo.ManejadorArchivo;

public class Juego {
	Tablero tablero;
	Robot robot;
	char listaComandos[];
	
	public Juego() {}
	
	public void comenzarJuego() {
		ManejadorArchivo manejadorArchivo = new ManejadorArchivo();
		this.tablero = manejadorArchivo.getTablero();
		this.robot = manejadorArchivo.getRobot();
		this.listaComandos = manejadorArchivo.getListaComandos();
	}
	
	public void calcularPosicionFinal() {
		
		for(int i=0;i<this.listaComandos.length;i+=2) {
			if(this.listaComandos[i] == 'A') {
				
			}else {
				if(this.listaComandos[i] == 'R') {
					
				}
			}
		}
		
	}
}
